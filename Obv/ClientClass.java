package Obv;
//观察者模式
public class ClientClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Subjects subject=new ConcreteSubjectB();
		ObserverO obs1=new ConcreteObserver1();
		ObserverO obs2=new ConcreteObserver2();
		subject.Add(obs1);
		subject.Add(obs2);
		subject.notifyObserver();
	}

}
