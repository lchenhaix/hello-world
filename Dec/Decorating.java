package Dec;
	//抽象装饰类
public class Decorating implements IBirthdayCake {
	private IBirthdayCake birthdayCake;//接口声明（对象）
	public Decorating(IBirthdayCake birthdayCake) {
		this.birthdayCake=birthdayCake;
	}
	@Override
	public void Show() {
		// TODO 自动生成的方法存根
		birthdayCake.Show();
	}

}
