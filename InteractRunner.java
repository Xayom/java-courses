import java.util.Scanner;

public class InteractRunner{
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first element:\n");
                String first = reader.next();
                System.out.println("Enter second element:\n");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println (calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no \n");
                exit = reader.next();
            }
        } finally{
            reader.close();
        }
    }
}
