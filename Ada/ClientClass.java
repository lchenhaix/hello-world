package Ada;

import pro.Apple;
import pro.Banana;

public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		InewJuicer newJuicer=new Adapter(); //适配器模式
		System.out.println(newJuicer.newPort(new Apple(), new Banana()));
	}

}
