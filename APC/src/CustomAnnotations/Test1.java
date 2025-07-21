package CustomAnnotations;

import java.lang.annotation.Annotation;

public class Test1 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.model);
        Class c = t.getClass();
        Annotation a = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) a;
        System.out.println(s.calling());
        System.out.println(s.version());
    }
}
