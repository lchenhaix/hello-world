package pro;          //����ԭ����

public class MyFruit implements Cloneable {   //Cloneableǳ��¡�ӿ�
	protected String kind;
	public void Display()
	{
		System.out.println(kind);
	}
	public String Get() {
		return kind;
	}
	public Object clone() 
	{
		Object obj=null;
		try {
		obj=super.clone();  //��Ҫ
		} catch (CloneNotSupportedException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
		}
	return obj;
	}
}
