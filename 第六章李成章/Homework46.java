package java43class_Chapter01;
import java.util.Scanner;
public class Homework46 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int time;
		int sum=0;
		double avg=0.0;
		for(int i=0;i<5;i++){
			System.out.println("��������"+(i+1)+"��ѧϰʱ��Ϊ��");
			time=input.nextInt();
			sum+=time;
		}avg=sum/5;
		System.out.println("��һ������ÿ��ƽ��ʱ���ǣ�"+avg);
		
	}

}
