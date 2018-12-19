import java.util.*;

public class Calculator {

    private int x;
    private int y;
    private int summe;

    public void startCalculator(){

        System.out.println("A Useless Calculator!");
        System.out.println("Zahl 1 eingeben");
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();

        System.out.println("Zahl 2 eingeben");
        y = scan.nextInt();

        summe = x+y;

        System.out.println("Die Summe ist: " + summe);


    }




}
