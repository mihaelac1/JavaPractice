package JavaPracticeGitHub.C15_NestedClasses;

import java.util.*;

public class ComputeFramework {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ComputationDB cDb = new ComputationDB();

        cDb.addOperation(cDb.generateOperation('+', 10, 5));

        ComputationDB.IBinaryOperation diffOp = cDb.generateOperation('-', 10, 5);
        cDb.addOperation(diffOp);

        System.out.println("Want to add a multiplication op? Y/N");
        if (sc.next().equalsIgnoreCase("Y")) {

            // Note: a different implementation of a binary operation
            class MulOp implements ComputationDB.IBinaryOperation {
                private String result;

                public MulOp(int op1, int op2) {
                    this.result = "MUL(" + op1 + ", " + op2 + ") = " + (op1 * op2);
                }

                @Override
                public void execute() {
                    System.out.println(this.result);
                }
            }

            cDb.addOperation(new MulOp(10, 5));
        }

        // Cannot instantiate 'MulOp' here, because it is not visible
        //new MulOp(10, 5); // Error: MulOp cannot be resolved to a type

        System.out.println("Want to add a division op? Y/N");
        if (sc.next().equalsIgnoreCase("Y")) {
            System.out.println("Give the operands separated by whitespace:");
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();

            cDb.addOperation(new ComputationDB.IBinaryOperation() {
                @Override
                public void execute() {
                    System.out.println("DIV(" + operand1 + ", " + operand2 + ") = " +
                            (operand1 / operand2));
                }
            });
        }

        cDb.executeAll();

    }
}
