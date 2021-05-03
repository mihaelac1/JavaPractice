package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;

import java.lang.reflect.*;

public class ComplexReflexionExample {
    public void list() {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    // metoda cu numar nedeterminat de parametri (observa '...')
    // ... - un array de obiecte
    public static Object invocareMetodaPrinReflection(Object obj, String numeMetoda,
                                                      Object... setDeParametri) {
        int numarParametri = setDeParametri.length;
        Method metodaApelata;
        Object valoareReturn = null;
        Class<?>[] tipurileParametrilor = new Class<?>[numarParametri];
        for (int i = 0; i < numarParametri; i++) {
            tipurileParametrilor[i] = setDeParametri[i].getClass();
        }
        try {
            metodaApelata = obj.getClass().getDeclaredMethod(
                    numeMetoda, tipurileParametrilor);
            metodaApelata.setAccessible(true);
            valoareReturn = metodaApelata.invoke(obj, setDeParametri);
        } catch (NoSuchMethodException e) {
            System.out.println("Nici o metoda");
        } catch (IllegalArgumentException e) {
            System.out.println("Ilegal Argument");
        } catch (IllegalAccessException e) {
            System.out.println("Ilegal access");
        } catch (InvocationTargetException e) {
            System.out.println("Invoke");
        }
        return valoareReturn;
    }

    public static void main(String[] args) {
        Student student = new Student(19, "Gigel", 7);
       // Guest guest = new Guest("Ion", "Gigel", "abc@gmail", "0748");
        Method[] methods = Student.class.getDeclaredMethods();
        for(Method primaMetoda : methods) {
//            Method primaMetoda = Student.class.getDeclaredMethods()[3]; // prima metoda
            System.out.println(primaMetoda.getName());
            System.out.println(invocareMetodaPrinReflection(student,
                    primaMetoda.getName(), (Object[]) primaMetoda.getParameters()));
        }


    }
}
