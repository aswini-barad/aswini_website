import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius , surfArea , volume ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of the hemisphere: ");
		radius = sc.nextFloat();
		surfArea = (float)(3 * Math.PI * Math.pow(radius, 2));
		volume = (float)((2.0/3)* Math.PI * Math.pow(radius, 3));
		System.out.println("Surface Area of the Hemisphere is: "+ surfArea );
		System.out.println("Volume are of the Hemisphere is:"+ volume);
		
		
		
		
		

	}

}
