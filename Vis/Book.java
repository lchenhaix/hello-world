package Vis;
//����Ԫ��
public class Book implements IProduct {

	@Override
	public void accept(AVisitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
