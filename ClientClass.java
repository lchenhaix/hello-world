
//public class ClientClass {
//	public static void main(String[] args) {  //��������
//		Factory factor=new AFactory();
//		Fruit fruit=factor.CreateFruit();
//		fruit.eat();
//	}
//}

public class ClientClass {

	public static void main(String[] args) {  //�򵥹���
		// TODO �Զ����ɵķ������
		Factory factor=new Factory();
		Fruit fruit=factor.CreateFruit("B");
		fruit.eat();
	}
	public String factory(String fruitname) {  //�����
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}

//public class ClientClass {   //���󹤳�
//	public static void main(String[] args) {
//		AFruitAndVegetables f=new AConF();
//		BFruitAndVegetables v=new BConV();
//		System.out.println(f.CreateF());
//		System.out.println(v.CreateV());
//	} 
//}
