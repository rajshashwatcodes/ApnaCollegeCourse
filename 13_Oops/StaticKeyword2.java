public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(); //calling constructor
        s1.schoolName = "Abc"; //common for all, need not define again and again

        Student s2 = new Student(); //calling constructor
        // System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "Pqr"; //by define the name again it will change to the name defined in the last
        System.out.println(s2.schoolName);

    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName(String name) {
        return this.name;
    }
}
