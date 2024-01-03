import java.util.Scanner;
public class cartisianplane {
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.println("enter x");
double x=sc.nextDouble();
System.out.println("enter y");
double y=sc.nextDouble();
if(x>0  &&   x>0){
    System.out.println("First quadrant");
}else if(x>0  &&  x<0){
    System.out.println("Second quadrant");
}else if(x<0  &&  y<0){
    System.out.println("Third quadrant");
}else if(x<0  &&   y>0){
    System.out.println("fourth quadrant");
}else if(x!=0 && y==0){
System.out.println("x-axis");
}else if(x==0 && y!=0){
System.out.println("y-axis");
}else{
    System.out.println("Origin");
}

}
}




