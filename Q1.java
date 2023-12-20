import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempcl, tempfh;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature in Farenheit: ");
		tempfh = input.nextDouble();
		tempcl = (tempfh-32)*(5.0/9);
		System.out.println(tempfh+" Farenheit is "+ tempcl +" Celcius");
	}

}
