package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;
//Pe baza interfete functionale IVerifyProperty, creati:
//
//O expresie lambda care verifica daca un numar e par
//O expresie lambda care verifica daca un numar e negativ
//O expresie lambda care verifica daca un numar e 0

public class ExpresiiLambdaExercitiul2 {

    public static boolean isEven(int x){
            return x % 2 == 0;
    }

    public static boolean isNegative(int x){
        return x < 0;
    }

    public static boolean isZero(int x){
        return x == 0;
    }

    public static void main(String[] args) {

//        IVerifyProperty isEven = a -> a % 2 == 0;
//        IVerifyProperty isNegative = a -> a < 0;
//        IVerifyProperty isZero = a -> a == 0;

        IVerifyProperty isEven = ExpresiiLambdaExercitiul2::isEven;
        IVerifyProperty isNegative = ExpresiiLambdaExercitiul2::isNegative;
        IVerifyProperty isZero = ExpresiiLambdaExercitiul2::isZero;

        System.out.println("is even ? " + isEven.hasProperty(5));
        System.out.println("is negative ? " + isNegative.hasProperty(-10));
        System.out.println("is zero ? " + isZero.hasProperty(5));
    }
}
