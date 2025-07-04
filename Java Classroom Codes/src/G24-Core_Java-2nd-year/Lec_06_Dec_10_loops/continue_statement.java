package Lec_06_Dec_10_loops;
public class continue_statement {
    public static void main(String[] args) {
        
        for(int i=1 ; i<=10 ; i++){
            if(i == 5){
                break;
            }
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
        // return; it will return from function and will not execute ststement after this
        System.out.println("hello");

        int a = 10;

        for( ; a < 15; a++){
            if(a == 12){
                break;
            }
        }
        System.out.println(a);
    }
}
