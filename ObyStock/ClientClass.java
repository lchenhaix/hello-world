package ObyStock;
//观察者模式
public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AStockPrice future1=new StockFutures("111");
		AStockPrice future2=new StockFutures("222");
		AStockPrice future3=new StockFutures("333");
		
		AStockPrice common5=new StockCommon("555");
		AStockPrice common6=new StockCommon("666");
		AStockPrice common7=new StockCommon("777");
		
		IStockHolder Buy1=new BuyHolder("Buy1");
		IStockHolder Buy2=new BuyHolder("Buy2");
		IStockHolder Buy3=new BuyHolder("Buy3");
		IStockHolder sell1=new SellHolder("sell1");
		IStockHolder sell2=new SellHolder("sell2");
		IStockHolder sell3=new SellHolder("sell3");
		
		Buy1.AddHolder(future1);Buy1.AddHolder(future2);
		Buy1.AddHolder(common5);
		
		Buy2.AddHolder(future1);Buy2.AddHolder(future3);
		Buy2.AddHolder(common6);
		
		Buy3.AddHolder(future3);Buy3.AddHolder(future3);
		Buy3.AddHolder(common7);
		
		sell1.AddHolder(future1);sell1.AddHolder(future2);
		sell1.AddHolder(common5);
		
		sell2.AddHolder(future1);sell2.AddHolder(future2);
		sell2.AddHolder(common7);
		
		sell3.AddHolder(future1);sell3.AddHolder(common6);
		sell3.AddHolder(common5);
		
		for(int i=0;i>-5;i--) {
			future1.setPrice(1+i);
			future2.setPrice(1+i);
			future3.setPrice(1+i);
			
			common5.setPrice(1+i);
			common6.setPrice(1+i);
			common7.setPrice(1+i);
		}
	}

}
