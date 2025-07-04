package Lec_47_Mar_ExpHandling;

import javax.naming.InsufficientResourcesException;

class InsufficientBalance extends Exception{
    InsufficientBalance(String msg){
        super(msg);
    }
}
class InvalidSenderUPI extends RuntimeException{
    private int errorCode;
    InvalidSenderUPI(int code, String msg){
        super(msg);
        this.errorCode = code;
    }
    int getErrorCode(){
        return this.errorCode;
    }
}
public class customException {
    static void sendMoney(int amount, String UPI) throws InsufficientBalance{
        if(amount > 500){
            throw new InsufficientBalance("Not enoungh Balance in your account");
        }
        if(!UPI.equals("7982143632")){
            throw new InvalidSenderUPI(201, "Enter Valid UPI id");
        }
    }
    public static void main(String[] args) {
        
    }
}
