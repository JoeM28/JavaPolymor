class X{}
class Emp{}
class Y{}
class Student {}

public class MethodArgClass {

    void m1(X x, Emp e) {
        System.out.println("Inside m1 method");
        System.out.println(x);
        System.out.println(e);
    }

    static void m2(Y y, Student S) {
        System.out.println("Inside m2 method");
        System.out.println(y);
        System.out.println(S);
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        MethodArgClass t = new MethodArgClass();
        X x1 = new X();
        Emp e1 = new Emp();
        Y y1 = new Y();
        Student s1 = new Student();
        System.out.println("Calling m1 "+ x1 + " " +e1 );
        t.m1(x1, e1);    // t.m1(new X(), new Emp())
        System.out.println("Calling m2 " + y1 + " " +s1 );
        MethodArgClass.m2(y1, s1);

    }

}
