package state;
//״̬ģʽ
public class ClientClass {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCpu();
		tc.suspend();
		tc.resume();
	}
}
