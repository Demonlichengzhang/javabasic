package java43class_Chapter01;
import java.util.Scanner;
public class Homework60 {

	public static void main(String[] args) {
		double[] nums=new double[4];
		double min;
		System.out.println("请输入4家店的价格");
		for(int i=0;i<nums.length;i++){
			System.out.print("第"+(i+1)+"家店的价格为：");
			Scanner input=new Scanner(System.in);
			nums[i]=input.nextDouble();
		}min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(min>nums[i]){
				min=nums[i];
				break;
			}
		
			
		}	System.out.println("最低价是："+min);
	}

}
