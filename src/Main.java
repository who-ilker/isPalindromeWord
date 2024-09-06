public class Main {
    public static void main(String[] args) {

    String str = "ab121ba";
    String str2 = "kavak";
    System.out.println(isPalindrome(str2));

    String str1 = "Do you think i am in the danger, no I am the danger. I am the one knocks!";
    System.out.println(isPalindrome2(str1));

    }

    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; --i){
            reverse += str.charAt(i);
        }
        boolean isEqueal = str.equalsIgnoreCase(reverse);

        return isEqueal;
    }
}