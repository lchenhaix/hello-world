package Vis;

public class Client {
//������ģʽ
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket=new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor=new Customer();
		visitor.setName("����");
		basket.accept(visitor);
	}

}
