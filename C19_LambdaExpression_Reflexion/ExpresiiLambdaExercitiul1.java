package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;
//Pornind de la interfata functionala IOperator,
// creati operatiile de adunare, scadere, inmultire, impartire si module,
// intre cei doi parametri a si b.

public class ExpresiiLambdaExercitiul1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        IOperator sum = (a, b) -> a + b;
        IOperator diff = (a, b) -> a - b;
        IOperator div = (a, b) -> a / b;
        IOperator mult = (a, b) -> a * b;
        IOperator mod = (a, b) -> a % b;

        System.out.println("Sum : " + sum.operation(x,y));
        System.out.println("Difference : " + diff.operation(x,y));
        System.out.println("Division : " + div.operation(x,y));
        System.out.println("Modulo : " + mod.operation(x,y));
        System.out.println("Multiplication : " + mult.operation(x,y));
    }
}
