package com.kanav.exceptionHandling;

public class Main {
    public static void main(String[] args) {
    /*
        A try block in exception handling is used to enclose a section of code where exceptions (errors) might occur during execution.
        Its main purpose is to "test" or "monitor" the code for potential errors, so that if an exception arises,
        it can be caught and handled appropriately, rather than causing the program to crash.

        A catch block in exception handling is used to handle exceptions that occur within a preceding try block.
        When an exception is thrown in the try block, control is transferred to the catch block,
        which contains code to respond to the specific type of exception that was thrown.
        The catch block allows the program to manage errors gracefully and prevent abrupt termination.

        A finally block is a construct used in exception handling that contains code guaranteed to execute after a try block finishes,
        regardless of whether an exception was thrown or caught.
        Its main role is to ensure that critical cleanup operations (such as releasing resources, closing files,
        or logging) are always performed, even if an error occurs or if the method exits early via a return statement

        The throw statement/throw block is used in exception handling to explicitly raise (or "throw") an exception in your code.
        This allows you to signal that an error or other exceptional condition has occurred, even if the code is not currently in an error state.
     */

        int a = 10;
        int b = 0;
        try {
//            divide(a, b);
            String name = "Kanav";
            if (name.equals("Kanav")) {
                throw new MyException("My name is Kanav");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Please do not divide by zero.");
        }

        return a / b;
    }
}
