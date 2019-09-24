import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // hvis man trykker fori laver den hele lykken
        //tæller op med 2
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // tæller ned fra -2 til -1000
        for (int i = -2; i > -1000; i= i--) {
            System.out.println(i);
        }
        //tæller op med 5 fra 42 til og med 77
        for (int i = 42; i<=77; i= i+5) {
            System.out.println(i);
        }
        //while loop
        int counter = 0;
        while (counter < 10)
            //bunch of code
            System.out.println("Hej" + counter++);
        Scanner scanner = new Scanner(System.in);
        String besked;
        besked = "";
        while (!besked.equals("exit"))
            System.out.println(besked+besked);

        // do while always executes once before checking parameters compared to a while loop
        do
        {
            counter++;
        }
        while (counter < 10);
        //foreach
        String[] strArray = {"Sune", "Mathias", "Tommy", "Henrik", "Simon"};
        for (String element : strArray)
        {
            System.out.println(element);
        }
    }
}
