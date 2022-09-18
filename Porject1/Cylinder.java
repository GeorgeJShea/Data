import java.util.Scanner;
class Cylinder
{
    public static void main(String[] args)
    {
        userInterface();
    }
    public static void userInterface()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to the Java Geometry Program!\n" +
                "Select from these Options\n" +
                "Use format option, raduis, height\n" +
                "\n" +
                "1. volume\n" +
                "2. surface area\n" +
                "3. lateral surface area\n" +
                "0. Quit");



        String stringSide = myObj.nextLine();  // Read user input
        String[] bits = stringSide.split(",");

        float choice = Float.parseFloat(bits[0]);
        float raduisMain = Float.parseFloat(bits[1]);
        float heightMain = Float.parseFloat(bits[2]);


        if(choice == 1)
        {
            float result = volume(raduisMain, heightMain);
            System.out.println(result);
        }
        else if(choice == 2)
        {
            float result = surfaceArea(raduisMain, heightMain);
            System.out.println(result);
        }
        else if(choice == 3)
        {
            float result = lateralSurfaceArea(raduisMain, heightMain);
            System.out.println(result);
        }
        else
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
    public static float volume (float radius, float height)
    {
        //code goes here
        float result = 3.1415f * height * radius * radius;
        return result;
    }

    public static float surfaceArea (float radius, float height)
    {
        //code goes here
        float result = 2 * 3.1415f * radius * height + 2 * 3.1415f * radius * radius;
        return result;
    }

    public static float lateralSurfaceArea (float radius, float height)
    {
        //code goes here
        float result = 2 * 3.1415f * radius * height;
        return result;
    }

}