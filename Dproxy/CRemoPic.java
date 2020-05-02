package Dproxy;

public class CRemoPic implements IShowPic {
//远程对象
	@Override
	public void ShowPic(String picname) {
		// TODO 自动生成的方法存根
		for(int i=0;i<3;i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
