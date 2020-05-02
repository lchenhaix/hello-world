package fac;
//客户类
public class Client {
   //外观（门面）模式，外部通过一个外观对象跟子系统进行交流
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GeneralSwitchFacade Facade=new GeneralSwitchFacade();
		Facade.on();
	    System.out.print("\n");
		Facade.off();
	}

}
