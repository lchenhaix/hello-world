package Dproxy;

public class CTest implements ITestInterface {

	@Override
	public void SendMessage(String mes) {
		// TODO �Զ����ɵķ������
		for(int i=5;i>=0;i--) {
			System.out.println(mes+"����ĳ��ֻ���"+i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		System.out.println(mes+"��������ˣ�");
	}

}
