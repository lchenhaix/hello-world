package Vis;
//����Ԫ��
public class Apple implements IProduct {

	@Override
	public void accept(AVisitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
