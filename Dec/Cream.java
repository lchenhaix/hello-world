package Dec;
	//具体装饰类
public class Cream extends Decorating {
	public Cream(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		//System.out.println("Cream");
	}
	public void PutCream() {
		System.out.println("Add Cream...");
	}
}
