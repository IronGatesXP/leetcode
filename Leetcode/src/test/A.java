package test;

public class A {

    {
        this.a = 2;
    }
    int a = 1;
    A() {
//        a =2;
        System.out.println(a);
    }
//    int a = 1;
    public static int b = 2;
    public void printB() {
        System.out.println("b is " + b);
    }
    final void  printA() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        A a1 = new A();
    }


    // 测试git reset1

    // test git reset2
}
