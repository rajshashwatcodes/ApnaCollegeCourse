public class NestedClass {
    public static void main(String args[]) {
        A outerobj = new A();
        outerobj.test();
    }
}

class A {
    int outer_x = 50;

    // defining nested class class B inside class A
    class B {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void test() {
        B inobj = new B(); //creating new object of class B  so that class A can access class B's method 'display'
        inobj.display(); //calling display method of class B
    }
}
