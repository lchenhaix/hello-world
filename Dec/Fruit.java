package Dec;
	//����װ����
public class Fruit extends Decorating {
	public Fruit(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		//System.out.println("Fruit");
	}
	public void PutFruit() {
		System.out.println("Add Fruit...");
	}
}
