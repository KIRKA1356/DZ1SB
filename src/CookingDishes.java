public class CookingDishes {
    public static void cook() {
        int milkAmount = 300; // ml
        int powderAmount = 350; // g
        int eggsCount = 5; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items


        // apples - 5
        if (appleCount >= 5)
            System.out.println("You can cook Apple juice");
        else System.out.println("You can't cook Apple juice");

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >=400 && sugarAmount >=10 && milkAmount >= 1000 && oilAmount >= 30)
            System.out.println("You can cook Pancakes");
        else System.out.println("You can't cook Pancakes");

        // milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >=300 && powderAmount >=5 && eggsCount >=5)
            System.out.println("You can cook Omelette");
        else System.out.println("You can't cook Omelette");

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >=300 && eggsCount >=4)
            System.out.println("You can cook Apple pie");
        else System.out.println("You can't cook Apple pie");
    }
}

