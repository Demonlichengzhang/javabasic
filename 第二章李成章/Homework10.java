package java43class_Chapter01;
import java.util.Scanner;
public class Hpmework10 {

	public static void main(String[] args) {
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		
		System.out.println("�������ۿۣ�");
		Scanner input=new Scanner(System.in);
		double discount=input.nextDouble();
		
		double discountPrice1=shirtPrice*discount;
		double discountPrice2=shoePrice*discount;
		double discountPrice3=padPrice*discount;
		
		boolean discountPrice1Bool=discountPrice1<100;
		boolean discountPrice2Bool=discountPrice2<100;
		boolean discountPrice3Bool=discountPrice3<100;
		System.out.println("T�����ۿۼ۵���100��?"+discountPrice1Bool);
		System.out.println("����Ь���ۿۼ۵���100��?"+discountPrice2Bool);
		System.out.println( "�����ĵ��ۿۼ۵���100��?"+discountPrice3Bool);
	}

}
