package chain;

public class SmallFruitSorting extends AbstractFruitSort {

	public SmallFruitSorting(int weight) {
		super(weight);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO �Զ����ɵķ������
		fruitBox.add("ե��֭��"+fruit);
	}

}
