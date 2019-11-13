package TRI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {
        int numberOfElements = 1000000;

//        initializeTriTimeTest("triBulle", numberOfElements);
//        initializeTriTimeTest("triInsertion", numberOfElements);
        initializeTriTimeTest("triFusion", numberOfElements);
        initializeTriTimeTest("triRapide", numberOfElements);

        List<Stuff> stuffs = Stuff.generateListOfStuff(numberOfElements);

        long start = System.nanoTime();
        Collections.sort(stuffs);
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("Collections.sort" + "() : " + numberOfElements + " elements");
        System.out.println("Temps : " + duration/1000000.0 + "ms");
    }

    public static void initializeTriTimeTest(String methodName, int numberOfElements)
    {
        long time = timeTriMethod(methodName, numberOfElements);

        System.out.println(methodName + "() : " + numberOfElements + " elements");
        System.out.println("Temps : " + time/1000000.0 + "ms");
        System.out.println();
    }

    public static long timeTriMethod(String methodName, int numberOfElements)
    {
        List<Stuff> stuffs = Stuff.generateListOfStuff(numberOfElements);
        long start, end, duration = 0;

        try {
            Class<?> c = Class.forName("TRI.Stuff");
            Method method = c.getDeclaredMethod(methodName, List.class);
            start = System.nanoTime();
            method.invoke(c, stuffs);
            end = System.nanoTime();
            duration = end - start;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return duration;
    }
}
