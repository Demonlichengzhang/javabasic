package java43class_Chapter01;
import java.util.Scanner;
public class Homework15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.print("请输入会员号(<四位数>)：");
		int custNo=input.nextInt();
		System.out.print("请输入会员的生日(月/日<用两位数表示>):");
		String custBirth=input.next();
		System.out.print("请输入积分：");
		int cust=input.nextInt();
		
		
		
		if(custNo>999&&custNo<10000){
			System.out.print("已录入的会员信息是：");
			System.out.print(custNo+"\t"+custBirth+"\t"+cust);
		}
		else{
			System.out.print("信息录入失败！");
		}
	}

}
