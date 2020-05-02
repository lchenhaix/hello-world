package proxy;

public class CLocalPic implements IShowPic, Runnable {
//本地代理对象
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		pic.ShowPic(picname);
		System.out.println("图片加载完成");
	}
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO 自动生成的方法存根
		pic=new CRemoPic();
		this.picname=picname;
		System.out.println("载入图片："+picname);
		Thread th=new Thread(this);
		th.start();
	}

}
