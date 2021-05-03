package JavaPracticeGitHub.Algorithms;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty())
            return true;
        s = s.replaceAll("\\P{Alnum}", "").toLowerCase();
        StringBuilder newStr = new StringBuilder();
        newStr.append(s);
        newStr = newStr.reverse();

        if(s.equals(newStr.toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
