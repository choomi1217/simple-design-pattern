# Adaptor

특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환합니다.
인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와줍니다.

### 객체 어댑터와 클래스 어댑터
제가 구현한 `Duck`과 `Turkey` 예제는 객체 어댑터 패턴입니다.
다중 상속이 가능한 언어만이 클래스 어댑터 패턴이 가능하고, 저는 자바 언어를 사용하고 있기 때문에 패스.

### 실전적용 예시
`Enumeration` 인터페이스를 `Iterator` 인터페이스로 변환하는 어댑터를 사용하는 예시가 있습니다.
자바에선 `Iterator`를 사용하는 것이 더 좋지만 기존 클라이언트 코드 중에선 `Enumeration`을 사용하는 경우가 있으므로 이를 변환해주는 어댑터를 사용합니다.
`Iterator`의 `hasNext()` 메소드를 호출하면 `Enumration`의 `hasMoreElements()` 메소드를 호출 되어야 한다.

```java
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
```
