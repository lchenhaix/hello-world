package Vis;
//具体元素
public class Book implements IProduct {

	@Override
	public void accept(AVisitor visitor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

}
