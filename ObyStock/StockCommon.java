package ObyStock;

import java.util.ArrayList;
import java.util.List;

public class StockCommon extends AStockPrice {
	public StockCommon(String code) {
		super(code);
	}
	@Override
	protected void notifyHolder() {
		// TODO 自动生成的方法存根
		System.out.println("普通股票更新了-"+code+":"+"");
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2=price;
	}
}
