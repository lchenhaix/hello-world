package Bri;

public class Client {
//桥接模式，用于两个维度变化自由
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Color color;
		Pen pen;
		color=new Blue();
		pen=new SmallPen();
		pen.setColor(color);
		pen.draw("鲜花");
	}

}
