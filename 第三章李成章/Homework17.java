package java43class_Chapter01;
import java.util.Scanner;
public class Homework17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���֣�");
		int custScore=input.nextInt();
		if(custScore<2000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.9");
		}
		else if(custScore>=2000&&custScore<4000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.8");
		}
		else if(custScore>=4000&&custScore<8000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.7");
		}
		else{
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.6");
		}
}
}