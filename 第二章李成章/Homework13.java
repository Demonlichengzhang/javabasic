package java43class_Chapter01;
import java.util.Scanner;
public class Homework13 {

	public static void main(String[] args) {
		int year1=1,year2=2,year3=3,year4=5;
		double  money,money1, money2, money3, money4;
		double rate1=0.0225,rate2=0.027,rate3=0.0324,rate4=0.036;
		System.out.println("�����뱾��");
		
		Scanner input=new Scanner(System.in);
		money=input.nextDouble();
		System.out.println("����Ϊ��"+money);
		money1=(1+rate2*year1)*money;
		money2=(1+rate2*year2)*money;
		money3=(1+rate3*year3)*money;
		money4=(1+rate4*year4)*money;
		System.out.println("��ȡһ���ı�Ϣ�ǣ�"+money1);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+money2);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+money3);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+money4);
		
	}

}
