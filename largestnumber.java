import java.util.Scanner;
public class largestnumber {
public static void main(String args[])  {
Scanner sc=new Scanner(System.in);
System.out.println("enter the vale of a,b,c:");
int a,b,c,max,min,mid;
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 max=Math.max(Math.max(a,b),c);
 min=Math.min(Math.min(a,b),c);
 mid=a+b+c-max-min;
System.out.println("1st largest number:"+max);
System.out.println("2nd largest number:"+mid);
}  
}
