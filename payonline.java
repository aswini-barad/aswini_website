import java.util.Scanner;
public class payonline {
public static void main (String args[]){
Scanner sc=new Scanner(System.in); 
System.out.print("No of units");
double unit=sc.nextDouble();
System.out.println("Do you want to paya the bill online:y/n");
char a=sc.next().charAt(0);
double rs=0;
if(unit<=50){
    rs=unit*3;
}else if(unit>=50 && unit<=200){
    rs=50*3+(unit-50)*4.80;

}else if(unit>=200  &&  unit<=400){
rs=50*3+150*4.80+(unit-200)*5.80;

}else{
    rs=50*3+200*5.80+(unit-400)*6.20;
}
System.out.println("pay the amount"+rs);
if(a=='y'){
    double discount=rs*3/100;
    System.out.println("discount:"+discount);
    rs=rs-discount;
    System.out.println("amount payble:"+rs);
    
}

}
}