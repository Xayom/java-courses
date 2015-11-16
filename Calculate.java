public class Calculate{
	public static void main(String[] arg){
		 System.out.println("Calculate...");	
		String  first = arg[0];
		String  second = arg[1];
		String sum = first + second;
		int  a = Integer.valueOf(arg[0]);
		int  b = Integer.valueOf(arg[1]);
		int summa = a + b, proiz = a * b, vichit = a - b, delenie = a / b;
		System.out.println("Sum = " + sum + "!summa = " + summa + "!proiz = " + proiz + "!vichit = " + vichit + "!delenie = " + delenie);
	}
}