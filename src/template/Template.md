# Template Method

> 템플릿 메소드는 알고리즘의 각 단계를 정의할 수 있고,
> 서브클래스의 일부를 구현할 수 있게 해줍니다.
> 알고리즘의 골격(템플릿)을 정의합니다.

### 템플릿 메소드의 훅(hook)
- 서브클래스의 필요에 따라 오버라이드할 수 있는 메소드입니다.

```java
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 훅 메소드
    boolean customerWantsCondiments() {
        return true;
    }
}
```

### 할리우드 원칙
> 먼저 연락하지 마세요. 제가 연락 드리겠습니다.
- 의존성 부패(dependency rot)을 방지 할 수 있다
- 어떤 고수준 구성 요소가 저수준 요소에 의존하고, 그 저수준 요소가 다시 고수준 요소에 의존하는, 복잡한 상황을 의존성 부패라고 합니다.
- 저수준 요소가 시스템에 접속할 수는 있으나, 그 어떻게 그 구성 요소를 사용할지는 고수준 요소가 결정합니다.
- 템플릿 메소드 패턴은 할리우드 원칙을 따릅니다.


### 실전적용 예시
Arrays 클래스 속 템플릿 메소드

```java
public class Duck implements Comparable<Duck>{

    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name : " + name + " , weight :  " + weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
```

### 실전 적용 예시 풀이
1. `Duck[] ducks = {new Duck("A", 10), new Duck("B", 5), new Duck("C", 15)};` 배열 생성
2. `Arrays.sort(ducks);` 정렬
3. 배열을 정렬하려면 목록이 정렬될 때까지 두 항목을 하나씩 비교해야 합니다.

