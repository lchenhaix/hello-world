package state;
//状态模式
public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCpu();
		tc.suspend();
		tc.resume();
	}
}
