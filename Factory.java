//public class Factory {
//	//�����˳��󹤳� ����    ��������ģʽ
//	public Fruit CreateFruit() {
//		return null;
//	}
//}

public class Factory {
	//������һ��ˮ��(��)����  �򵥹���ģʽ
	public Fruit CreateFruit(String Kind) {
		if(Kind.equals("A"))
			return new Apple();
		if(Kind.equals("B"))
		    return new Banana();
		return null;
	}
}
