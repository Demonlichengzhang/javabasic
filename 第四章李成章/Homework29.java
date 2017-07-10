package java43class_Chapter01;

import java.util.Scanner;

public class Homework29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数： ");
		int num1=input.nextInt();
		System.out.println("请输入第二个数： ");
		int num2=input.nextInt();
		System.out.println("请选择算法：：1.加2.减3.乘4.除 ");
		if(input.hasNextInt()==true){
		int fh=input.nextInt();
		
		switch(fh){
			case 1:
				System.out.println("输出结果是： "+(num1+num2));
				break;
			case 2:
				System.out.println("输出结果是： "+(num1-num2));
				break;
			case 3:
				System.out.println("输出结果是： "+(num1*num2));
				break;
			case 4:
				System.out.println("输出结果是： "+(num1/num2));
				break;
		}
		}else{
			System.out.println("请输入正确的数字");
		}
	}

}
