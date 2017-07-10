package java43class_Chapter01;

public class Homework8 {

	public static void main(String[] args) {
		
		System.out.println("********消费单********");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥245\t2\t￥490");
		System.out.println("网球鞋\t￥570\t1\t￥570");
		System.out.println("网球拍\t￥320\t1\t￥320");
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		int shirtNo=2;
		int shoeNo=1;
		int padNo=1;
		double discount=0.8;
		double result=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
		System.out.println("折扣：8折");
		System.out.println("消费总金额：￥"+result);
		int realConsumption=1500;
		double balance=realConsumption-result;
		System.out.println("实际交费：￥"+realConsumption);
		System.out.println("找钱：￥"+balance);
		int integration=(int)result/100*3;
		System.out.println("本次购物所获得积分是："+integration);
		
	}

}
