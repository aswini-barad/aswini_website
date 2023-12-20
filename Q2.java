import java.util.Scanner;
public class Q202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dist, distmetres, distfeet,distinch ,distcentim;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in km = ");
		dist = input.nextDouble();
		distmetres = dist*1000;
		distfeet = dist*3280.8399;
		distinch = dist*39370.0787;
		distcentim = dist*100000;
		System.out.println(dist + " Km is " + distmetres + " metres");
		System.out.println(dist + " Km is " + distfeet + " feet");
		System.out.println(dist + " Km is " + distinch + " inch");
		System.out.println(dist + " Km is " + distcentim + " centimetres");
		
		
		
		
		

	}

}
