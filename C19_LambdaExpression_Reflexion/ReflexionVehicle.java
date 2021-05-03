package JavaPracticeGitHub.C19_LambdaExpression_Reflexion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexionVehicle {

    public void list() {
        Class student = Vehicle.class;
        Method[] methods = student.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

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
        Vehicle vehicle = new Vehicle("123456", 5, "Dacia");
        Method[] methods = Vehicle.class.getDeclaredMethods();
        for(Method method : methods) {
//            Method primaMetoda = Student.class.getDeclaredMethods()[3]; // prima metoda
            if(method.getName().equals("displaySerialNumberAndPassword")) {
                System.out.println(method.getName());
                System.out.println(invocareMetodaPrinReflection(vehicle,
                        method.getName(), (Object[]) method.getParameters()));
            }
            System.out.println();
            if(method.getName().equals("changeNoPersons")) {
                Object obj = invocareMetodaPrinReflection(vehicle,
                        method.getName(), (Object[]) method.getParameters());
                System.out.println(obj);
            }


        }
    }
}
