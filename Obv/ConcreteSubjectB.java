package Obv;

public class ConcreteSubjectB extends Subjects {
	public ConcreteSubjectB() {
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("BĿ�귢���ı���");
		for(ObserverO obs:observers)
		{
			obs.response();
		}
	}
}
