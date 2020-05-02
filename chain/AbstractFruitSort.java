package chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
		private int weight;
		protected List<String> fruitBox;
		private AbstractFruitSort nextFruitSort;
			public AbstractFruitSort(int weight) {
				this.weight=weight;
				fruitBox=new ArrayList<String>();
			}
			public void setNextSort(AbstractFruitSort nextFruitSort) {
				this.nextFruitSort=nextFruitSort;
			}
			public void sendFruit(int weight,String fruit) {
				if(this.weight==weight)    //可修改
					pushBox(fruit);
				else
					if(nextFruitSort!=null)
						nextFruitSort.sendFruit(weight,fruit);
			}
			abstract protected  void pushBox(String fruit);	
			public void getFruitBox() {
				System.out.print("weight:"+weight);
				System.out.println("个数："+fruitBox.size());
				for(String t:fruitBox) {
					System.out.print(t+",");
				}
				System.out.println(" ");
			}
}


