package java43class_Chapter01;
import java.util.Scanner;
public class Homework20 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������a��ֵ��");
		int a=input.nextInt();
		System.out.println("������b��ֵ��");
		int b=input.nextInt();
		System.out.println("������c��ֵ��");
		int c=input.nextInt();
		int t=0;
		if(a>b){
			t=a;
			a=b;
			b=t;
		}
		if(a>c){
			t=a;
			a=c;
			c=t;
		}
		if(b>c){
			t=b;
			b=c;
			c=t;
		}
		System.out.println(a+","+b+","+c);

	}

}
