package java43class_Chapter01;
import java.util.Scanner;
public class Homework31 {

	public static void main(String[] args) {
		String name="";
		double price=0.0;
		int goodsNo=0;
		System.out.println("MyShoping����ϵͳ>�������");
		System.out.println("************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("************************************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while("y".equals(answer)){
		System.out.println("��������Ʒ��ţ�");
		goodsNo=input.nextInt();
		switch(goodsNo){
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
		System.out.println(name+"\t"+"��"+price);
		System.out.println("�Ƿ������(y/n)");
		answer=input.next();
		}
		System.out.println("лл����ʹ�ã�");
	}

}
