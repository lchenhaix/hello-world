package Com;
import java.util.*;
 //������
public class Plate extends MyElement {
	private ArrayList<MyElement> list=new ArrayList<MyElement>();//����myelement����ȥ���������о��汨��
	public  void add(MyElement element) {
		list.add(element);
	}
	public void delete(MyElement element) {
		list.remove(element);
	}
	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		for(Object object:list) {
			((MyElement)object).eat();
		}
	}

}
