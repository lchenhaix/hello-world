package Obv;

public class ConcreteSubjectA extends Subjects {
	public ConcreteSubjectA() {
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("AĿ�귢���ı���");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}

}
