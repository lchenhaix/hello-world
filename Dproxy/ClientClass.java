package Dproxy;

public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * IShowPic isp=new CRemoPic(); CLocalPicShow cpic=new CLocalPicShow(isp);
		 * IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		 * 
		 * localpic.ShowPic("AAA");
		 */
		
		ITestInterface ipic=new CTest();//动态代理
		ITestInterface proxy=(ITestInterface)new CLocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage("AAA");
	}

}
