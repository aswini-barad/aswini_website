import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		int value, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		value = sc.nextInt();
		sum = value % 10;
		value /= 10;
		sum += value % 10;
		value /=10;
		sum +=value % 10;
		System.out.println("The sum of digits is " + sum);
		
	
				
		
		
		
		
		

	}

}
