package java43class_Chapter01;
import java.util.Scanner;
public class Homework63 {

	public static void main(String[] args) {
		int[] nums=new int[10];
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("请输入十个数：");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
				switch(nums[i]){
					case 1:
						a++;
						break;
					case 2:
						b++;
						break;
					case 3:
						c++;
						break;
					default:
						d++;
						break;
						
				}				
		}
		
		
		System.out.print("数字1的个数为："+a+"\n数字2的个数为："+b+"\n数字3的个数为："+c+"\n非法数字的个数为："+d);

	}

}
