package java43class_Chapter01;
import java.util.Scanner;
public class Homework60 {

	public static void main(String[] args) {
		double[] nums=new double[4];
		double min;
		System.out.println("������4�ҵ�ļ۸�");
		for(int i=0;i<nums.length;i++){
			System.out.print("��"+(i+1)+"�ҵ�ļ۸�Ϊ��");
			Scanner input=new Scanner(System.in);
			nums[i]=input.nextDouble();
		}min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(min>nums[i]){
				min=nums[i];
				break;
			}
		
			
		}	System.out.println("��ͼ��ǣ�"+min);
	}

}
