package com.OOPS;

class car2 {
  String brand;
  String color;
  int speed;

  car2() {
    brand = "";
    color = "white";
    speed = 60;
  }

  car2(String brand, String color, int speed) {
    this.brand = brand;
    this.color = color;
    this.speed = speed;
    // this.display();
  }

  void display() {
    System.out.println("Brand : " + brand);
    System.out.println("Color : " + color);
    System.out.println("Speed : " + speed);
    System.out.println();
  }

  static void print() {
    System.out.println("A static method");

    // access non - static data member
    car temp = new car();
    System.out.println(temp.brand);
  }

  String getBrand() {
    return this.brand;
  }

  String getColor() {
    return this.color;
  }

  int getSpeed() {
    return this.speed;
  }

  void setBrand(String brand) {
    this.brand = brand;
  }

  void setColor(String color) {
    this.color = color;
  }

  void setSpeed(int speed) {
    this.speed = speed;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    car2 obj = new car2("Toyota", "Black", 60);
    // obj.brand = ""; invalid due to private member
    obj.display();
    obj.setBrand("Hyundai");
    obj.setColor("White");
    obj.setSpeed(75);
    System.out.println("Brand : " + obj.getBrand());
    System.out.println("Color : " + obj.getColor());
    System.out.println("Speed : " + obj.getSpeed());
    obj.display();
  }
}
