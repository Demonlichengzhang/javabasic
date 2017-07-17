package java43class_Chapter01;

public class Homework51 {

	public static void main(String[] args) {
		int a,b,c;
		for(int num=100;num<=999;num++){
		a=num%10;
		b=num/10%10;
		c=num/100%10;
		if(num==a*a*a+b*b*b+c*c*c){
			System.out.println(num);
		}
		}
	}

}
