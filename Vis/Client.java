package Vis;

public class Client {
//访问者模式
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket=new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor=new Customer();
		visitor.setName("张三");
		basket.accept(visitor);
	}

}
