package proxy;

public class Client {
//��̬����ģʽ
//�ͻ���ͨ������������Զ�̶���
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		IShowPic pic=new CLocalPic();
		pic.ShowPic("��");
	}

}
