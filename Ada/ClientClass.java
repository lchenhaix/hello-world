package Ada;

import pro.Apple;
import pro.Banana;

public class ClientClass {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		InewJuicer newJuicer=new Adapter(); //������ģʽ
		System.out.println(newJuicer.newPort(new Apple(), new Banana()));
	}

}
