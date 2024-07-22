# Facade

> 서브 시스템의 기능을 사용할 수 있는 간단한 인터페이스 제공
> 서브 시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어줍니다.

### 최소 지식 원칙 (Principle of Least Knowledge) || demeter 법칙
객체 사이의 상호작용은 될 수 있으면 아주 가까운 클래스 사이에서만 허용하는 것이 좋다.

### 최소 지식 원칙을 지키는 법
- 객체 자신의 메서드
- 메서드에 전달된 매개변수
- 메서드에서 생성하거나 인스턴스화 하는 객체
- 객체에 속하는 구성요소

#### 안좋은 예
```java
public float getTemperature(){
    Thermometer thermometer = station.getThermometer();
    return thermometer.getTemperature();
}
```
#### 좋은 예
```java
public float getTemperature(){
    return station.getTemperature();
}
```


