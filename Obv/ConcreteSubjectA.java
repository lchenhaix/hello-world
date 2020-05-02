package Obv;

public class ConcreteSubjectA extends Subjects {
	public ConcreteSubjectA() {
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("A目标发生改变了");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}

}
