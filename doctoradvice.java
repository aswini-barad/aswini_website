import java.util.Scanner;
public class doctoradvice {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount of water in ml");
     int ml=sc.nextInt();
if(ml>=5000){
    System.out.println("\"yes Alice is following doctors advice\"");
}else{
    System.out.println("\"No Alice is not following doctors advice\"");
}
}
}