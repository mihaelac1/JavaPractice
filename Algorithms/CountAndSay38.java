package JavaPracticeGitHub.Algorithms;

public class CountAndSay38 {

    public static String countAndSay(int n) {
        if(n < 1 || n > 30)
            return "";
        if(n == 1)
            return "1";

        String result = "1";
        for(int i = 2; i <= n; i++){
            result = count(result);
        }
        return result;


    }
    public static String count(String number){
        char ch = number.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < number.length(); i++){
            if(number.charAt(i) != ch){
                sb.append(count).append(ch);
                ch = number.charAt(i);
                count = 1;
            }
            else
                count++;
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(9));
    }
}
