package java43class_Chapter01;

public class Homework8 {

	public static void main(String[] args) {
		
		System.out.println("********���ѵ�********");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t��245\t2\t��490");
		System.out.println("����Ь\t��570\t1\t��570");
		System.out.println("������\t��320\t1\t��320");
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		int shirtNo=2;
		int shoeNo=1;
		int padNo=1;
		double discount=0.8;
		double result=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
		System.out.println("�ۿۣ�8��");
		System.out.println("�����ܽ���"+result);
		int realConsumption=1500;
		double balance=realConsumption-result;
		System.out.println("ʵ�ʽ��ѣ���"+realConsumption);
		System.out.println("��Ǯ����"+balance);
		int integration=(int)result/100*3;
		System.out.println("���ι�������û����ǣ�"+integration);
		
	}

}
