package java43class_Chapter01;
import java.util.Scanner;
public class Homework45 {

	public static void main(String[] args) {
		int num,score;
		String bir;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入会员号(<四位整数>)：");
			num=input.nextInt();
			System.out.println("请输入会员的生日(月/日<用两位整数表示):");
			bir=input.next();
			System.out.println("请输入会员积分：");
			score=input.nextInt();
			if(num>999&&num<10000&&score>=0){
				System.out.println("您录入的信息为："+num+"\t"+bir+"\t"+score);
			}
			else{
				System.out.println("信息错误！！录入系统失败。请重新录入信息");
				System.out.println("请输入会员号(<四位整数>)：");
				num=input.nextInt();
				System.out.println("请输入会员的生日(月/日<用两位整数表示):");
				bir=input.next();
				System.out.println("请输入会员积分：");
				score=input.nextInt();
				continue;
			}
				
		}System.out.println("程序结束");
			
	}

}
