package dsa.String;

public class tocheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        char arr[] = str.toCharArray();
        int n = str.length();
        boolean isPalindrome = true;
        for(int i=0;i<n/2;i++){
            if (arr[i] != arr[n-i-1]) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("string is Palindrome ");
        } else {
            System.out.println("Palindrome is not ");
        }

    }
}
