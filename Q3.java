import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hra, da,basic_salary,gross_salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary:" );
		basic_salary = sc.nextFloat();
		hra = basic_salary*((float)40/100);
		da = basic_salary*((float)20/100);
		gross_salary = hra + da + basic_salary;
		System.out.println("DA is " + da);
		System.out.println("HRA is " + hra);
		System.out.println("Gross Salary is " + gross_salary);
		
		

	}

}
