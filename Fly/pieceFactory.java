package Fly;
//��Ԫ������
import java.util.HashMap;

public class pieceFactory {
	private HashMap piecepool=new HashMap();
	public Apiece GetPiece(String key) {
		if(!piecepool.containsKey(key)) {
			Apiece a=new onePiece(key);
			piecepool.put(key, a);
			return a;
		}
		return (Apiece)piecepool.get(key);
	}
	public int PieceCount() {
		return piecepool.size();
	}
}
