package by.it.skarpovich.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Parser parcer=new Parser();
        Printer printer=new Printer();
        Var.read();

        Scanner scanner=new Scanner(System.in);
        String input;

        while (!(input=scanner.next()).equals("END")){
            try {
                String res = parcer.calc(input);
                printer.print(res);
            } catch (CalcException e) {
                System.out.println(e.getMessage());
            }
        }
        Var.save();

    }
}