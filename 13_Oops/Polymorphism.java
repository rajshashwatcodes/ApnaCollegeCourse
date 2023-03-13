public class Polymorphism {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();
        b.show();
        a.show(10);
        b.show(20);
        b.show(10.5f);
    }
}

class A {
    public void show()
    {
        System.out.println("In A");
    }

    public void show(int a)
    {
        System.out.println("In int A: "+a);
    }
}
class B extends A {
    public void show()
    {
        System.out.println("In B");
    }
    public void show(float a)
    {
        System.out.println("In float B : "+a);
    }
}
