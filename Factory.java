//public class Factory {
//	//构造了抽象工厂 引号    工厂方法模式
//	public Fruit CreateFruit() {
//		return null;
//	}
//}

public class Factory {
	//构造了一个水果(简单)工厂  简单工厂模式
	public Fruit CreateFruit(String Kind) {
		if(Kind.equals("A"))
			return new Apple();
		if(Kind.equals("B"))
		    return new Banana();
		return null;
	}
}
