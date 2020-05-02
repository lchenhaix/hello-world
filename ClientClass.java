
//public class ClientClass {
//	public static void main(String[] args) {  //工厂方法
//		Factory factor=new AFactory();
//		Fruit fruit=factor.CreateFruit();
//		fruit.eat();
//	}
//}

public class ClientClass {

	public static void main(String[] args) {  //简单工厂
		// TODO 自动生成的方法存根
		Factory factor=new Factory();
		Fruit fruit=factor.CreateFruit("B");
		fruit.eat();
	}
	public String factory(String fruitname) {  //多余的
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}

//public class ClientClass {   //抽象工厂
//	public static void main(String[] args) {
//		AFruitAndVegetables f=new AConF();
//		BFruitAndVegetables v=new BConV();
//		System.out.println(f.CreateF());
//		System.out.println(v.CreateV());
//	} 
//}
