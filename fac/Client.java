package fac;
//�ͻ���
public class Client {
   //��ۣ����棩ģʽ���ⲿͨ��һ����۶������ϵͳ���н���
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GeneralSwitchFacade Facade=new GeneralSwitchFacade();
		Facade.on();
	    System.out.print("\n");
		Facade.off();
	}

}
