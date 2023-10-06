public class FindCharacter {

    public static void printLetters(String str) {
        for(int i = 0 ; i < str.length() ; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String firstName = "Shashwat";
        String lastName = "Raj";
        String fullName = firstName + " " + lastName;
        // using "charAt" keyword to find any character
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
