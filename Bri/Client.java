package Bri;

public class Client {
//�Ž�ģʽ����������ά�ȱ仯����
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Color color;
		Pen pen;
		color=new Blue();
		pen=new SmallPen();
		pen.setColor(color);
		pen.draw("�ʻ�");
	}

}
