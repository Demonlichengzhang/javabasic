package java43class_Chapter01;
import java.util.Scanner;
public class Homework32 {

	public static void main(String[] args) {
		String name="";
		double price=0.0;
		double discount=0.8;
		double total=0.0;
		double payment=0.0;
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("************************************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while("y".equals(answer)){
			System.out.println("��ѡ�������Ʒ��ţ�");
			int num=input.nextInt();
			System.out.println("�����빺��������");
			int amount=input.nextInt();
			switch(num){
				case 1:
					name="T��";
					price=245.0;
					break;
				case 2:
					name="����Ь";
					price=570.0;
					break;
				case 3:
					name="������";
					price=320.0;
					break;
			}
			total=price*amount;
			System.out.println(name+"��"+price+"\t����"+amount+"\t�ϼƣ�"+total);
			System.out.println("�Ƿ������(y/n)");
			answer=input.next();
		}
		payment=total*discount;
		System.out.println("�ۿۣ�"+discount);
		System.out.println("Ӧ����"+payment);
		System.out.println("ʵ����");
		double money=input.nextDouble();
		money=money-payment;
		System.out.println("���㣺"+money);
	}

}
