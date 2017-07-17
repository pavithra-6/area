package guvi;
import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r;
double p=3.14;
Scanner s=new Scanner(System.in);
System.out.println("enter the radius of circle");
r=s.nextInt();
int a=(int)p*r*r;
System.out.println(a);
int l,b;
System.out.println("entre the length and breath of rectangle");
l=s.nextInt();
b=s.nextInt();
int e=l*b;
System.out.println(e);
int t;
System.out.println("enter the area of triangle");
t=s.nextInt();
int tr=t*t*t;
System.out.println(tr);



}

	}

