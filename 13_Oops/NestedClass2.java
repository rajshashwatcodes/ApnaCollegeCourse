
public class NestedClass2 {
    public static void main(String[] args) {
        
        // Creating object of Outer class
        Outer outer = new Outer();
        
        // Creating object of Inner class
        Outer.Inner inner = outer.new Inner();
        
        // Calling the method of inner class
        inner.display();
    }
}

// Outer class
class Outer {
    
    // Private variable of the outer class
    private int num = 175;
    
    // Inner class
    public class Inner {
        
        // Method of inner class
        public void display() {
            System.out.println("This is an inner class");
        }
    }
}




