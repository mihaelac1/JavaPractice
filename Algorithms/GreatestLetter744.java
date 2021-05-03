package JavaPracticeGitHub.Algorithms;

public class GreatestLetter744 {

    public static char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));

    }

}
