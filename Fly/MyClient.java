package Fly;
//���ö���ϸ���ȣ�������ڲ�״̬����ͬ�ģ����ⲿ״̬
import java.util.Random;
//��Ԫģʽ
public class MyClient {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		pieceFactory pi=new pieceFactory();
		Random r=new Random();
		for(int i=0;i<19;i++)
			for(int j=0;j<19;j++) {
				Apiece p;
		if(r.nextInt()%2==0)
			p=pi.GetPiece("����");
		else 
			p=pi.GetPiece("����");
		p.Play(r.nextInt(19)+1,r.nextInt(19)+1);
	}
		System.out.println("�ܹ����Ӷ�������ǣ�"+pi.PieceCount());
		}
}
