package JavaPracticeGitHub.Algorithms;

public class Test {
    public static void printArray(String[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }public static char printNumber(int number) {
        if (number <= 0) {
            return '\0';
        }

        number--;
        System.out.print(printNumber(number));
        System.out.print(number);
        return ' ';
    }
    public static int recursiveNumberAnalyser(int value) {
        if (value == 0) {
            return 0;
        }

        if (value % 10 % 2 == 0) {
            return recursiveNumberAnalyser(value / 10);
        }
        return 1 + recursiveNumberAnalyser(value / 10);
    }
    public static void main(String[] args) {
        printNumber(5);
        String str = "as";
        System.out.println("Initial " + str);
        str = str + "aaa";
        System.out.println("Initial " + str);
        System.out.println(12 - 1.0d + " + " + 10 + false + " end");
        String[] names = {"cow", "dog", "mouse", "zebra", "spider", "bee"};
        for (int i=0; i<names.length; i++) {
            String tmp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = tmp;
        }
        printArray(names);
        int x= 5219044;
        System.out.println(recursiveNumberAnalyser(x));
    }
}
