package proxy;

public class Client {
//静态代理模式
//客户端通过代理对象访问远程对象
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IShowPic pic=new CLocalPic();
		pic.ShowPic("火车");
	}

}
