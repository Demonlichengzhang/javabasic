package java43class_Chapter01;
import java.util.Scanner;
public class Homework25 {

	public static void main(String[] args) {
		System.out.println("���������ѽ�");
		Scanner input=new Scanner(System.in);
		int money=input.nextInt();
		if(money>=50){
			System.out.println("�Ƿ�μ��Żݻ������ ");
			System.out.println("1.��50Ԫ����2Ԫ�������¿�������һƿ ");
			System.out.println("2.��100Ԫ����3Ԫ����500ml����һƿ ");
			System.out.println("3.��100Ԫ����10Ԫ����5kg��� ");
			System.out.println("4.��200Ԫ����10Ԫ����1�����ƹ� ");
			System.out.println("5.��200Ԫ����20Ԫ����ŷ�����ѷ�ˮһƿ ");
			System.out.println("0.������ ");
			System.out.println("��ѡ��");	
		int num=input.nextInt();
		switch(num){
			case 1:
				money=money+2;
				System.out.println("���������ܽ� "+money);
				System.out.println("�ɹ�������1ƿ���¿��� ");
				break;
			case 2:
				money=money+3;
				System.out.println("���������ܽ� "+money);
				System.out.println("�ɹ�������1ƿ500ml���� ");
				break;
			case 3:
				money=money+10;
				System.out.println("���������ܽ� "+money);
				System.out.println("�ɹ�������5kg��� ");
				break;
			case 4:
				money=money+10;
				System.out.println("���������ܽ� "+money);
				System.out.println("�ɹ�������1�����ƹ�");
				break;
			case 5:
				money=money+20;
				System.out.println("���������ܽ� "+money);
				System.out.println("�ɹ�������ŷ�����ѷ�ˮһƿ");
				break;
			default:
				System.out.println("лл���Ĺ��٣�");
				break;
		}
		}else{
			money=50-money;
			System.out.println("�������ѽ�û�дﵽ�����Ľ�������뻻���Ļ���������Ҫ���ѣ�"+money);
		}
		
	}

}
