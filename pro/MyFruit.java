package pro;          //抽象原型类

public class MyFruit implements Cloneable {   //Cloneable浅克隆接口
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
		obj=super.clone();  //重要
		} catch (CloneNotSupportedException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
		}
	return obj;
	}
}
