package Java_Memory_Model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        Class c = obj.getClass();
        System.out.println(c);
        Method[] m = c.getMethods();
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
        Field[] f = c.getFields();
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }
}