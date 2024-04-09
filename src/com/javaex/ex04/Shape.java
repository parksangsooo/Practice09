package com.javaex.ex04;

public abstract class Shape {  // new 키워드로 생성할 수 없고, 하위 클래스에 책임 위임만 가능
    
    public abstract double getArea(); // 넓이

    public abstract double getPerimeter(); // 둘레 길이
    
}
