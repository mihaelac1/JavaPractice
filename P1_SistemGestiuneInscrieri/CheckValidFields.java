package JavaPracticeGitHub.P1_SistemGestiuneInscrieri;
//used for checking if a field of class guest is valid
public class CheckValidFields {

    public static boolean checkNameValid(String input){
        for(int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if(!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')) && c != ' ')
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkEmailValid(String input){
        if(input.indexOf('@') < 0){
            return false;
        }else if(input.indexOf('@') == input.lastIndexOf('@')){
            return true;
        }
        return false;
    }

    public static boolean checkPhoneNumberValid(String input){
        for(int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if(!((c >= '0' && c <= '9'))) {
                if(!(i == 0 && c == '+')) {
                    return false;
                }
            }
        }
        return true;
    }
}
