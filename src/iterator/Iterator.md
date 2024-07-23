# iterator
> 반복자 패턴은 `iterator` 인터페이스에 의존합니다. 
> `iterator` 인터페이스는 컬렉션의 요소를 순서대로 접근할 수 있는 방법을 제공합니다.

아래와 같이 서로 같은 `Menu`라는 걸 담당하지만 그 속의 `Collection`이 다를때 
`Iterator`를 추가 함으로써 서로의 다른 점을 인정하고 쓰던 코드를 그대로 사용할 수 있게 됨.

```java
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;
}
```

```java

public class PancakeHouseMenu {
    List<MenuItem> menuItems;
}
```

### 단일 책임의 원칙
> 클래스는 단 하나의 이유로만 변경되어야 한다.

집합체(DinerMenu)안에 컬렉션 관련 기능과 Iterator 관련 기능을 전부 구현하는 것이 그렇게 나쁠까요?

나쁜 것임을 이해하려면 클래스의 역할(집합체 역할)외에 다른 역할을 처리할 때 2가지 이유로 그 클래스가 바뀔 수 있다는 걸 알아야 합니다.

1. 컬렉션이 어떤 이유로 바뀌게 되면 그 클래스도 바뀌게 됩니다.
2. Iterator가 어떤 이유로 바뀌게 되면 그 클래스도 바뀌게 됩니다.

이렇게 되면 **클래스는 단 하나의 이유로만 변경되어야 한다는 단일 책임의 원칙을 위반**하게 됩니다.


