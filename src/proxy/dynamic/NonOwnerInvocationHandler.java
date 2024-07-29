package proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public void invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        String methodName = method.getName();
        if (methodName.startsWith("set")) {
            throw new IllegalAccessException("Non-owner cannot change the person's information");
        } else if (methodName.startsWith("get")) {
            try {
                method.invoke(person, args);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Person getNonOwnerProxy() {
        return (Person) java.lang.reflect.Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                (java.lang.reflect.InvocationHandler) this);
    }
}
