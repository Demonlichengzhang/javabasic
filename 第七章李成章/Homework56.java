package java43class_Chapter01;
import java.util.Scanner;
public class Homework56 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		double money[]=new double[5];
	
		for(int i=0;i<money.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ�����:");
				money[i]=input.nextDouble();
				sum=sum+money[i];
				}
		System.out.println("���\t\t\t���(Ԫ)");
		for(int i=0;i<money.length;i++){
			System.out.println((i+1)+"\t\t\t"+money[i]);
		}
		System.out.println("�ܽ��\t\t\t"+sum);
	}

}
