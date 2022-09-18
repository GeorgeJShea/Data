import java.util.Scanner;

public class Cubism
{
    public static void main(String[] args)
    {
        CubeReturn();
        Calculator calc = new Calculator();

        float side = calc.Accepter();
        calc.Solver(side);
    }


    public static class Calculator
    {
        public float Accepter()
        {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter side of cube: ");



            String stringSide = myObj.nextLine();  // Read user input
            float side = Float.parseFloat(stringSide);

            return side;
        }
        public void Solver(float side)
        {
            float surfaceArea = 6 * (side * side);
            float area = side * side * side;

            System.out.println("Surface Area: " + surfaceArea + " Area: " + area);

        }
    }

    public static void CubeReturn()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter side of cube: ");



        String stringSide = myObj.nextLine();  // Read user input
        float side = Float.parseFloat(stringSide);

        float surfaceArea = 6 * (side * side);
        float area = side * side * side;

        System.out.println("Surface Area: " + surfaceArea + " Area: " + area);
    }
}
