package Vis;
//���������
public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա"+name+"��ƻ�����ӣ�Ȼ�������۸�");
	}

	@Override
	public void visit(Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա"+name+"ֱ�Ӽ�����ļ۸�");
	}

}
