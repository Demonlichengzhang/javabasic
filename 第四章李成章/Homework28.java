package java43class_Chapter01;
import java.util.Scanner;
public class Homework28 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("��������ĳ����·ݣ� ");
	
		int month=input.nextInt();
		int num=input.nextInt();
		double money=5000;
		if(month>=4&&month<=10){
			System.out.println("����ѡ����ͷ�Ȳջ��Ǿ��òգ�(ͷ�Ȳ�1.���ò�2) ");
		switch(num){
			case 1:
				money=money*0.9;
				System.out.println("���Ļ�Ʊ�۸�Ϊ�� "+money);
				break;
			case 2:
				money=money*0.8;
				System.out.println("���Ļ�Ʊ�۸�Ϊ�� "+money);
				break;
		}
		}
		else{
			System.out.println("����ѡ����ͷ�Ȳջ��Ǿ��òգ�(ͷ�Ȳ�1.���ò�2) ");
		
		switch(num){
		case 1:
			money=money*0.5;
			System.out.println("���Ļ�Ʊ�۸�Ϊ�� "+money);
			break;
		case 2:
			money=money*0.4;
			System.out.println("���Ļ�Ʊ�۸�Ϊ�� "+money);
			break;
		}
			
		}
	}

}
