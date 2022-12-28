public class TypeCasting {
    public static void main(String args[]) {
        // 25.98 or any decimal is considered as type "double" 
        // so "f" is written after the number to consider it as float.
        float a = 25.98f;
        // due to type casting the decimal points will get lost 
        int b = (int) a;
        System.out.println(b);
    }
}
