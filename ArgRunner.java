import java.util.Scanner;

public class ArgRunner{
    public static void main(String[] arg){
        if (arg.length == 2){
                Calculator calc = new Calculator();
                String first = arg[0], second = arg[1];
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Sum = " + calc.getResult());
                calc.cleanResult();
        }
        else{
            System.out.println("Enter Two Parametrs");
        }
    }
}

