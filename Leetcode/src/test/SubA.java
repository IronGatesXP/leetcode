package test;

public class SubA extends A{
    public static void main(String[] args) {
        SubA subA = new SubA();
        System.out.println(subA.a);
        A father = new A();
//        SubA son = (SubA) father;
        String str = "hello";
        if (str instanceof Object) {
            System.out.println(str);
        }
        System.out.println(SubA.b++);
        System.out.println(A.b);
    }
}
