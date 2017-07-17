package java43class_Chapter01;
import java.util.Scanner;
public class Homework46 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int time;
		int sum=0;
		double avg=0.0;
		for(int i=0;i<5;i++){
			System.out.println("请输入周"+(i+1)+"的学习时间为：");
			time=input.nextInt();
			sum+=time;
		}avg=sum/5;
		System.out.println("周一到周五每日平均时间是："+avg);
		
	}

}
