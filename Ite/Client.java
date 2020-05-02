package Ite;
//迭代器模式
public class Client {
	public static void display(Television tv) {
		TVIterator i=tv.createIterator();
		System.out.println("电视机频道：");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());;
			i.next();
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Television tv=new TCLTelevision();
        display(tv);
	}

}
