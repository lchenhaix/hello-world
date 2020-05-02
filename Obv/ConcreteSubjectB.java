package Obv;

public class ConcreteSubjectB extends Subjects {
	public ConcreteSubjectB() {
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("B目标发生改变了");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}
}
