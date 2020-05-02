package Dec;
	//具体装饰类
public class Fruit extends Decorating {
	public Fruit(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		//System.out.println("Fruit");
	}
	public void PutFruit() {
		System.out.println("Add Fruit...");
	}
}
