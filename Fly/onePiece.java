package Fly;
//������Ԫ��
public class onePiece extends Apiece {
    public onePiece(String key) {
    	super(key);
    }
	@Override
	public void Play(int x, int y) {
		// TODO �Զ����ɵķ������
		System.out.println("��"+inKind+"���ӷ��ڣ�"+x+","+y+")λ����");
	}
}
