package Com;
import java.util.*;
 //容器类
public class Plate extends MyElement {
	private ArrayList<MyElement> list=new ArrayList<MyElement>();//两个myelement都可去掉，但会有警告报出
	public  void add(MyElement element) {
		list.add(element);
	}
	public void delete(MyElement element) {
		list.remove(element);
	}
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		for(Object object:list) {
			((MyElement)object).eat();
		}
	}

}
