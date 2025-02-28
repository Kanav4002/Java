package com.OOPS;

class car {
  String brand;
  String color;
  int speed;

  car() {
    brand = "";
    color = "white";
    speed = 60;
  }

  car(String brand, String color, int speed) {
    this.brand = brand;
    this.color = color;
    this.speed = speed;
  }

  void display() {
    System.out.println("Brand is : " + brand);
    System.out.println("Color is : " + color);
    System.out.println("Speed is : " + speed);
    System.out.println();
  }

  static void print() {
    System.out.println("A static method");
    
    // access non - static data member
    car temp = new car();
    System.out.println(temp.brand);
  }
}

public class ClassAndObject {
  public static void main(String[] args) {
    car obj = new car();
    obj.brand = "hyundai";
    obj.color = "white";
    obj.speed = 100;

    car obj2 = new car("Skoda", "white", 110);

    obj.display();
    obj2.display();

  }
}
