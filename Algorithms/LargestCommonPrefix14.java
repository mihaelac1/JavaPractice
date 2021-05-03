package JavaPracticeGitHub.Algorithms;

public class LargestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int count = 0;
        int idxCommonPrefix = 0;
        for(int i = 0; i < strs[0].length() ; i++){
            for(int j = 0; j < strs.length - 1; j++){
                if((i < strs[j + 1].length()) && strs[j].charAt(i) == strs[j + 1].charAt(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == strs.length - 1){
                idxCommonPrefix++;
                count = 0;
            }
            else{
                break;
            }

        }
        if(idxCommonPrefix == 0){
            return "";
        }
        return strs[0].substring(0, idxCommonPrefix);
    }

    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));

    }
}
