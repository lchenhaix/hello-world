package ObyStock;

public class StockFutures extends AStockPrice {
	public StockFutures(String code) {
		super(code);
	}
	@Override
	protected void notifyHolder() {
		// TODO �Զ����ɵķ������
		System.out.println("�ڻ�������-"+code+":"+"");
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2=price;
	}

}
