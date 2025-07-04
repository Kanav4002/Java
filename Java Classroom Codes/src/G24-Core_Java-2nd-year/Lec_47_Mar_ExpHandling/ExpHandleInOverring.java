package Lec_47_Mar_ExpHandling;
import java.io.FileNotFoundException;
import java.io.IOException;

class parent{
    void NonExceptionFunction(){
        System.out.println("Doesn't exception");
    }
    void ExceptionFunction() throws IOException{
        System.out.println("Throws Exception");
    }
}
class child1 extends parent{
    // @Override
    // void NonExceptionFunction() throws IOException{ 
    //     // can't throw Checked Exception if parent class method doesn't throw any
    //     System.out.println("throws exception");
    // }
    @Override
    void ExceptionFunction() throws FileNotFoundException{
        System.out.println("Can throw subclass of thrown Exception");
    }
}
class child2 extends parent{
    @Override
    void NonExceptionFunction() throws ArithmeticException{
        // can throw unchecked Exception
        System.out.println("throws exception");
    }
//     @Override
//     void ExceptionFunction() throws Exception{
//         System.out.println("Can throw subclass of thrown Exception");
//     }
// }

//public class ExpHandleInOverring {
//    public static void main(String[] args) {
//        
//    }    
//}
