package Str;
//����ģʽ
public class ClientClass {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Chef chef=new Chef();
		ICutFruit cut=new FruitKnife();
		chef.SetCutMethod(cut);
		chef.CutFruit("����");
	}

}
