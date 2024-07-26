# Composite pattern

> 부분-전체 계층구조의 객체 컬렉션에서 그 객체들을 모두 같은 방식으로 다루기 위한 패턴
> 객체들을 모아서 관리하는 것에 매우 유용하다

이 패턴을 사용하면 중첩되어 있는 메뉴 그룹과 항목을 똑같은 구조 내에서 처리 할 수 있습니다.
메뉴와 항목을 같은 구조에 넣어서 부분-전체 계층 구조 (part-whole hierarchy)를 만들 수 있습니다.

메뉴, 서브메뉴, 서브서브메뉴 ... 로 구성된 트리구조가 있다고 하면 각각이 모두 메뉴 객체이며, 메뉴 객체는 항목 객체를 가질 수 있습니다.

### Transparency(투명성)이란?
아래처럼 component interface에 **노드로써 자식들을 관리하는 기능** + **리프로써 수행하는 기능** 을 전부 넣음으로써 투명성을 확보합니다.
즉, 어떤것이 노드이고 어떤것이 리프인지 클라이언트에게 투명하게 보입니다.

```java
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}

```

위 코드를 보면 알 수 있듯, 계층구조를 관리하는 일과 메뉴 관련 작업을 전부 처리 해야 합니다.
컴포지트 패턴에서는 단일 역할 원칙을 깨는 대신 투명성을 확보하는 패턴입니다.

component에 두 종류의 기능이 모두 들어가다 보니 안정성은 떨어집니다.
클라이언트가 어떤 객체를 대상으로 무의미하거나 부적절한 작업을 수행할 수 있습니다.
이런 문제를 해결하기 위해 여러 역할을 서로 다른 인터페이스로 분리할 수도 있습니다. ( 대신 조건문을 써야겠죠..? 🥲)


