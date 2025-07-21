package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Basics {
    public static void main(String[] args) {
        /*
            A lambda expression is a short block of code which takes in parameters and returns a value.
            Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

            Syntax:
            - Single parameter
            parameter -> expression

            - More than one parameter
            (parameter, parameter) -> expression
        */
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(30);
        nums.add(40);
        nums.add(20);
//        nums.forEach((n)-> { System.out.println(n); });

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        nums.forEach(method);

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

//    Created a method/function which takes a lambda expression as a parameter
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
