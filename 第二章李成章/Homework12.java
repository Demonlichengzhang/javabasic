package java43class_Chapter01;
import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {
		int  huaTemperature;
		double sheTemperature;
		System.out.println("�����뻪�϶ȣ�");
		Scanner input=new Scanner(System.in);
		huaTemperature=input.nextInt();
		sheTemperature=5/9.0*(huaTemperature-32);
		System.out.println("���϶�Ϊ��"+sheTemperature);
		
	}

}
