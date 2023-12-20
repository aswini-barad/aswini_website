import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        a = 1;
        //System.out.print("Enter Value of a: ");
        //a = sc.nextInt();
        //System.out.print("Enter Value of b: ");
        //b = sc.nextInt();
        b = a + 1;
        System.out.println("a\tb\tpow(a,b)");
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a+=1;
        b+=1;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a+=1;
        b+=1;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a+=1;
        b+=1;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
        a+=1;
        b+=1;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
             
    }
}
