package ObyStock;

public class StockFutures extends AStockPrice {
	public StockFutures(String code) {
		super(code);
	}
	@Override
	protected void notifyHolder() {
		// TODO 自动生成的方法存根
		System.out.println("期货更新了-"+code+":"+"");
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2=price;
	}

}
