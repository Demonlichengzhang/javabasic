package java43class_Chapter01;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		int random=(int)(Math.random()*10);
		random=3;
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.println("������4λ���ţ�");
		Scanner input=new Scanner(System.in);
		int numbers=input.nextInt();
		int bw=numbers/100%10;
		if(bw==random){
			System.out.println(numbers+"�ſͻ������˿ͻ�����þ�������һ����");
		}
		else{
			System.out.println(numbers+"�ſͻ���лл���֧�֣�");
		}
	}

}
