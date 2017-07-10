package java43class_Chapter01;
import java.util.Scanner;
public class Homework20 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入a的值：");
		int a=input.nextInt();
		System.out.println("请输入b的值：");
		int b=input.nextInt();
		System.out.println("请输入c的值：");
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
