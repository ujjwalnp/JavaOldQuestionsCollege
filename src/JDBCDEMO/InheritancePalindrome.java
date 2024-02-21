class A {
    public void find_palindrome(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse)) {
            System.out.println(name+" is a palindrome.");
        } else {
            System.out.println(name+" is not a palindrome.");
        }
    }
}

class B extends A {

}
public class InheritancePalindrome {
    public static void main(String[] args) {
        B obj = new B();
        obj.find_palindrome("MOM");
    }
}