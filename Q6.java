import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float distance, time; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Seconds: ");
		time = sc.nextFloat();
		distance = (float)(1.0/2 * 32.174 * Math.pow(time, 2));
		System.out.print("Distance travelled:" + distance);

	}

}
