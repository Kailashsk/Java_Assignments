import java.util.Scanner;

public class dis{

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A & B");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The Value of A & B is "+ a +" "+ b);

    } 

}
