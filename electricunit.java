import java.util.Scanner;
public class electricunit {
   public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the electric unit");
    double unit=sc.nextDouble();
    double RS=0;
    if(unit<=50){
      RS=unit*3;
    }else if(unit>=50  &&  unit<=200){
        RS=50*3+(unit-50)*4.80;
    }else if(unit>=200  &&  unit<=400){
        RS=50*3+150*4.80+(unit-200)*5.80;

    }else{
        RS=50*3+150*4.80+200*5.80+(unit-400)*6.20;
    }
      System.out.println("pay the electric bill:"+RS);
    }
   }

