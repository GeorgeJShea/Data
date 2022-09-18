import java.util.Scanner;
class FirstFile
{

    public static void main(String[] args)
    {
        FirstFile miniMe = new FirstFile();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello: Whats your Name");


        String userName = myObj.nextLine();  // Read user input
        System.out.println("Welcome Bond " + userName + " Bond");  // Output user input
        System.out.println("This note will self destruct in: ");
        System.out.println("Georges note: it will just clear the consol ");

        Timer("3...");
        Timer("2...");
        Timer("1...");
        Timer("0...");


        Clear(1000);
        // what is the purpose of static it being its own unique thing i remember it having a bunch of tedious limits

    }

    public static void Timer(String numb)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        System.out.println(numb);
    }

    public static void Clear(int time)
    {
        //ints are lower case fun
        try
        {
            Thread.sleep(time);
        }
        catch(InterruptedException e){}

        // clears stuff uatomatically for me horray
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}