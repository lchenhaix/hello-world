package Str;
//策略模式
public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chef chef=new Chef();
		ICutFruit cut=new FruitKnife();
		chef.SetCutMethod(cut);
		chef.CutFruit("橙子");
	}

}
