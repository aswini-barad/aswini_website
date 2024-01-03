import java.util.Scanner;
public class game {
 public static void main(String args[])   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the numbe rbetween 1 to 9");
    int a=sc.nextInt();
    int b=(int) (1+(9-1)*Math.random());
    System.out.println("computer guess:"+b);
    if(a==b){
        System.out.println("the guess is right");

    }else if((a+1)==b || (a-1)==b){
        System.out.println("almost right");
    }else{
        System.out.println("the guess is wrong");
    }

    }
 }

