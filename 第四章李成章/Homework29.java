package java43class_Chapter01;

import java.util.Scanner;

public class Homework29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ������ ");
		int num1=input.nextInt();
		System.out.println("������ڶ������� ");
		int num2=input.nextInt();
		System.out.println("��ѡ���㷨����1.��2.��3.��4.�� ");
		if(input.hasNextInt()==true){
		int fh=input.nextInt();
		
		switch(fh){
			case 1:
				System.out.println("�������ǣ� "+(num1+num2));
				break;
			case 2:
				System.out.println("�������ǣ� "+(num1-num2));
				break;
			case 3:
				System.out.println("�������ǣ� "+(num1*num2));
				break;
			case 4:
				System.out.println("�������ǣ� "+(num1/num2));
				break;
		}
		}else{
			System.out.println("��������ȷ������");
		}
	}

}
