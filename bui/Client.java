package bui;
//建造者模式
public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MealBuilder mb=new subMealBuilderA();
	    KFCWaiter waiter=new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		System.out.println("套餐组成：");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
