package test;

public final class test2 {

    public static  test2 test = new test2();



    private test2(){}

    public static void main(String[] args) {

       A a = A.get();
       a.sout();

    }
}

final class A{

    static A a = new A();

    public synchronized static A get(){

        return a;
    }

    private A(){}

    public void sout(){

        System.out.println("hello world");
    }

}
