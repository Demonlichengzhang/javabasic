package java43class_Chapter01;
import java.util.Scanner;
public class Homework42 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int num=input.nextInt();
//		while(num!=0){
//			System.out.print(num%10);
//			num=num/10;
//		}
		do{
			System.out.print(num%10);
			num=num/10;
			
		}while(num!=0);
	}

}
