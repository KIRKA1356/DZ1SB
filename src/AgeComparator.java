import java.util.Random;

public class AgeComparator {
    public static void ageComparator() {
        Random r = new Random();
        int vasyaAge = r.nextInt(121);
        int katyaAge = r.nextInt(121);
        int mishaAge = r.nextInt(121);

       

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= min)
            min=vasyaAge;
        if (vasyaAge >= max)
            max =vasyaAge;

        if (katyaAge <= min)
            min=katyaAge;
        if (katyaAge >= max)
            max =katyaAge;

        if (mishaAge <= min)
            min=mishaAge;
        if (mishaAge >= max)
            max =mishaAge;

        if ((max==vasyaAge || max==mishaAge) && (min==vasyaAge || min == mishaAge))
            middle = katyaAge;
        else if ((max==katyaAge || max==mishaAge) && (min==katyaAge || min == mishaAge))
            middle = vasyaAge;
        else middle = mishaAge;

        System.out.println("Vasya " + vasyaAge + " Age");
        System.out.println("Katya " + katyaAge + " Age");
        System.out.println("Misha " + mishaAge+ " Age");
        System.out.println();
        System.out.println("min = " + min);
        System.out.println("middle = "+ middle);
        System.out.println("max = " + max);
    }
}
