package java43class_Chapter01;

public class Homework7 {

	public static void main(String[] args) {
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		int shirtNo=2;
		int shoeNo=1;
		int padNo=1;
		double discount=0.8;
		double result=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
		System.out.println("消费总金额："+result);
	}

}
