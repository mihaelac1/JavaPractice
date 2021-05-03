package JavaPracticeGitHub.C3_Strings;
import java.util.*;


public class FilterStringTemplate {
    private static String[] filterString(String[] array, String key, int matchKey){
        key = key.toLowerCase();
        String[] filterStr = new String[array.length];
        int ctrFilter = 0;
        for(int i = 0; i < array.length; i++){
            int count = 0;
            String strCurrent = array[i].toLowerCase();

            for(int j = 0; j < (int)Math.min(strCurrent.length(), key.length()); j++){
                if(strCurrent.charAt(j) == key.charAt(j)){
                    count++;
                }
            }
        if(count >= matchKey){
            filterStr[ctrFilter] = strCurrent;
            ctrFilter++;
        }
        }
        return Arrays.copyOf(filterStr, ctrFilter);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
       System.out.println(Arrays.toString(filterString(array, "plot", 1)));
        System.out.println(Arrays.toString(filterString(array, "plot", 2)));
        System.out.println(Arrays.toString(filterString(array, "plot", 3)));


    }
}
