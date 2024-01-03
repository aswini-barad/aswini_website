import  java.util.Scanner;
public class Adult {//program on eligible to vote or not
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the age");
    int a=sc.nextInt();
    if(a>=18){
        System.out.println("eligible to vote");
    } else {
        System.out.println("not eligible to vote");
    }
}
}