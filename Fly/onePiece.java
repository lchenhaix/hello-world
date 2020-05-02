package Fly;
//具体享元类
public class onePiece extends Apiece {
    public onePiece(String key) {
    	super(key);
    }
	@Override
	public void Play(int x, int y) {
		// TODO 自动生成的方法存根
		System.out.println("把"+inKind+"棋子放在（"+x+","+y+")位置上");
	}
}
