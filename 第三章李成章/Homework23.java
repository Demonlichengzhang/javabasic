package java43class_Chapter01;
import java.util.Scanner;
public class Homework23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����������е��·ݣ�1~12");
		int month=input.nextInt();
		System.out.println("������ѡ����ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		int num=input.nextInt();
		int originalCost=5000;
		double money;
		if(month>=4&&month<=10){
			if(num==1){
			money=originalCost*0.9;
				System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money);
			}
			else{
				money=originalCost*0.8;
				System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money);
			}
		}
		else{
			if(num==1){
				money=originalCost*0.5;
				System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money);
			}
			else{
				money=originalCost*0.4;
				System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money);
			}
		}
	}

}
