package ObyStock;

import java.util.ArrayList;
import java.util.List;

public class StockCommon extends AStockPrice {
	public StockCommon(String code) {
		super(code);
	}
	@Override
	protected void notifyHolder() {
		// TODO �Զ����ɵķ������
		System.out.println("��ͨ��Ʊ������-"+code+":"+"");
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2=price;
	}
}
