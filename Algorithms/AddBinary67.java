package JavaPracticeGitHub.Algorithms;

public class AddBinary67 {

    private static String[] returnCh(char ch1, char ch2, String carry){
        String[] result = new String[2];
        if (carry.equals("1")) {
            if (ch1 == ch2 && ch1 == '1') {
                result[0] = "1";
                result[1] = "1";
            }
            if (ch1 == ch2 && ch1 == '0') {
                result[0] = "1";
                result[1] = "0";
            }
            if ((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1')) {
                result[0] = "0";
                result[1] = "1";
            }
        }
        else {
            if (ch1 == ch2 && ch1 == '1') {
                result[0] = "0";
                result[1] = "1";
            }
            if (ch1 == ch2 && ch1 == '0') {
                result[0] = "0";
                result[1] = "0";
            }
            if ((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1')) {
                result[0] = "1";
                result[1] = "0";
            }
        }
        return result;
    }

    public static String addBinary(String a, String b) {
        String carry = "0";

        int n = a.length();
        int m = b.length();
        int i,j;
        StringBuilder sum = new StringBuilder();
        if(n < m) {
            i = n - 1;
            j = m - 1;
            while (i >= 0) {
                char ch1 = a.charAt(i--);
                char ch2 = b.charAt(j--);
                String[] result = returnCh(ch1, ch2, carry);
                sum.append(result[0]);
                carry = result[1];
            }
            while (j >= 0) {
                char ch2 = b.charAt(j--);
                String[] result = returnCh(ch2, '0', carry);
                sum.append(result[0]);
                carry = result[1];
            }
        }
        else {
            i = m - 1;
            j = n - 1;
            while (i >= 0) {
                char ch1 = a.charAt(j--);
                char ch2 = b.charAt(i--);
                String[] result = returnCh(ch1, ch2, carry);
                sum.append(result[0]);
                carry = result[1];
            }
            while (j >= 0) {
                char ch1 = a.charAt(j--);
                String[] result = returnCh(ch1, '0', carry);
                sum.append(result[0]);
                carry = result[1];
            }
        }

        if(carry.equals("1")){
            sum.append("1");
        }
       return sum.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "100";
        String b = "110010";
        System.out.println("Suma este: " + addBinary(a,b));
    }
}