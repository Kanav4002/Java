package Lecture3;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts by turning the key.");
    }
    public void stop() {
        System.out.println("Car stops by pressing brake.");
    }
    public void openTrunk() {
        System.out.println("Trunk is open.");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle starts by twisting the throttle.");
    }
    public void stop() {
        System.out.println("Motorcycle stops by pressing brake.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using interface reference
//        Vehicle v1 = new Car();
//        v1.start();
//        v1.stop();
        // v1.openTrunk(); // ❌ ERROR: Vehicle doesn't have openTrunk()

//        Vehicle v2 = new Motorcycle();
//        v2.start();
//        v2.stop();
//
//        System.out.println();

        // Using class reference
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.openTrunk(); // ✅ Works fine

        Motorcycle myBike = new Motorcycle();
        myBike.start();
        myBike.stop();
    }
}
