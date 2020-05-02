package Fly;
//复用对象（细粒度）抽象出内部状态（相同的）和外部状态
import java.util.Random;
//享元模式
public class MyClient {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		pieceFactory pi=new pieceFactory();
		Random r=new Random();
		for(int i=0;i<19;i++)
			for(int j=0;j<19;j++) {
				Apiece p;
		if(r.nextInt()%2==0)
			p=pi.GetPiece("白棋");
		else 
			p=pi.GetPiece("黑棋");
		p.Play(r.nextInt(19)+1,r.nextInt(19)+1);
	}
		System.out.println("总共棋子对象个数是："+pi.PieceCount());
		}
}
