package java43class_Chapter01;
import java.util.Scanner;
public class Homework21 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int num=input.nextInt();
		if(num%3==0||num%5==0){
			System.out.println("��������3��5�ı���");
		}
		else{
			System.out.println("�������ܱ�3��5���κ�һ��������");
		}
	}

}
