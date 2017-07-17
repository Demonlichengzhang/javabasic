package java43class_Chapter01;

public class Homework54 {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<=7;){
			i=i+3;
			
			if(i==7){
				break;
			}else{
				i=i-2;
				a++;
			}
		}
		System.out.println(a);
	}

}
