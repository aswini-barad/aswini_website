import java.util.Scanner;
public class incresedecrease {
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.print("Enter the first number");
int a=sc.nextInt();
System.out.print("Enter the second number");
int b=sc.nextInt();
System.out.print("Enter the third number");
int c=sc.nextInt();
if(a>b && b>c && a>c){
    System.out.println("it is a decreasing order");
}else if(c>a && c>b && b>a){
    System.out.println("it is an Incresing order");
}else{
    System.out.println("Nither incresing nor decreasing");
}
}
}


