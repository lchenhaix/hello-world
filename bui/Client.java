package bui;
//������ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MealBuilder mb=new subMealBuilderA();
	    KFCWaiter waiter=new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		System.out.println("�ײ���ɣ�");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
