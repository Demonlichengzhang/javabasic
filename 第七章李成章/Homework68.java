package java43class_Chapter01;

public class Homework68 {

	public static void main(String[] args) {
		int[] nums={22,11,33,15,23,12,14,55};
			int sum=0;
			int max=nums[0];
			int min=nums[0];
			System.out.print("���������ֵΪ��");
			for(int i=0;i<nums.length;i++){
				if(nums[i]>max){
					max=nums[i];
				}
			}System.out.print(max);
			System.out.print("\n��������СֵΪ��");
			for(int i=0;i<nums.length;i++){
				if(nums[i]<min){
					min=nums[i];
				}
			}System.out.print(min);
			System.out.print("\n��������ֵΪ��");
			for(int i=0;i<nums.length;i++){
				sum+=nums[i];
			}System.out.print(sum);
	}

}
