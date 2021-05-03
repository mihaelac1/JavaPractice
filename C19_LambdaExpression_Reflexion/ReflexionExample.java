package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;

import java.lang.reflect.*;

public class ReflexionExample {
    public void list(){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method.getName());
        }
    }

    public static void main(String[] args) {
//        new ReflexionExample().list();

        Class guest = Student.class;
        Method[] methods = guest.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method.getName());
        }


    }
}
