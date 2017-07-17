package java43class_Chapter01;

public class Homework62 {

	public static void main(String[] args) {
		int[] nums={18,25,7,36,13,2,89,63};
		int min;
		int index=nums.length-1;
		min=nums[0];
		for(int i=0;i<nums.length;i++){
			if(min>nums[i]){
				index=i;
				min=nums[i];
				
			}
		}System.out.println("最小值为："+min);
		System.out.print("最小值的下标为"+index);
	}

}
