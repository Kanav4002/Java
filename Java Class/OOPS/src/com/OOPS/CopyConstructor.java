package com.OOPS;

class car1 {
  String brand;
  String color;
  int speed;

  car1() {
    brand = "ferrari";
    color = "white";
    speed = 60;
  }

  car1(String brand, String color, int speed) {
    this.brand = brand;
    this.color = color;
    this.speed = speed;
    // this.display();
  }

  // copy constructor
  car1(car other) {
    this.brand = other.brand;
    this.color = other.color;
    this.speed = other.speed;
  }

  void display() {
    System.out.println("Brand : " + brand);
    System.out.println("Color : " + color);
    System.out.println("Speed : " + speed);
    System.out.println();
  }

  static void print() {
    System.out.println("A static method");
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

class Array {
  int[] arr;
  Array(int size) {
    arr = new int[size];
  } 
  Array(Array other) {
    this.arr = other.arr;
    this.arr = new int[other.arr.length];
    for(int i = 0; i < other.arr.length; i++) {
      this.arr[i] = other.arr[i];
    }
  }
}

public class CopyConstructor {
  public static void main(String[] args) {
    car1 obj = new car1("Toyota", "White", 120);
    // car1 obj1 = new car1(obj);
    // obj1.display();
  }
}
