package Dec;
	//�û���
public class Client {
	//װ��ģʽ���ȼ̳�ӵ�и���������
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
