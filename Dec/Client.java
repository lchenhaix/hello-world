package Dec;
	//用户类
public class Client {
	//装饰模式，比继承拥有更多的灵活性
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IBirthdayCake birthdayCake=new Cake();		
		birthdayCake.Show();
		Cream cream=new Cream(birthdayCake);
		cream.PutCream();
		//cream.Show();
		Fruit fruit=new Fruit(cream);
		fruit.PutFruit();
		//fruit.Show();
	}

}
