package OOPS.DataHiding;

import DataHiding.Account;

public class Hiding {
    public static void main(String[] args) {
        DataHiding.Account acc = new Account();
//		acc.balance=0;
        //System.out.println(acc.balance);

        System.out.println(acc.getBalance());
    }
}
