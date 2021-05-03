package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;

public class Student {
    private int age;
    public String name;
    public int grade;
//    private intxams;

    public Student(){}

    public Student(int age, String name, int grade){
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public boolean examPass(){
        return this.age > 18 && this.grade > 6;
    }

    private boolean isAdult(){
        return this.age > 18;
    }

    private String testMethod() {
        return "Sunt student la Academia Devmind";
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", grade=" + grade +
//                '}';
//    }
}
