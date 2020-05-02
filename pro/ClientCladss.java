package pro;

public class ClientCladss {

public static void main(String[] args) {
    MyFruit fru1=new Apple();     //原型模式(浅拷贝)
		//MyFruit fru2=fru1;
	MyFruit fru2=(Apple)fru1.clone();
	fru1.Display();
	fru2.Display();
		System.out.println("fru1:"+fru1.hashCode());
	System.out.println("fru2:"+fru2.hashCode());
	System.out.println("fru1:"+fru1.toString());
		System.out.println("fru2:"+fru2.toString());  //所谓的地址
	System.out.println(fru1==fru2);
	System.out.println(fru1.equals(fru2));
	}
}

//public static void main(String[] args) {
//	MyFruit fru1=new Apple();     //原型管理器模式
//	MyFruit fru2=new Banana();
//	MyFruitStore.Add(1,fru1);
//	MyFruitStore.Add(2,fru2);
//	MyFruitStore.Add(3,new Apple());
//	MyFruitStore.Add(4,new Banana());
//	MyFruit fru=(MyFruit)MyFruitStore.Get(2);  //比拟从水池中来得到对象，无需初始化上面四行
//	MyFruit frui=(MyFruit)MyFruitStore.Get(3);
//	fru.Display();
//	frui.Display();
//}
//}

//public static void main(String[] args) {
//	MyFruit fru1=new Apple();    //单例模式
//	MyFruit fru2=new Banana();
//	MyFruitStore mfs=MyFruitStore.Getfruitstore();  //mfs为类的对象
//	mfs.Add(1, fru1);
//	mfs.Add(2, fru2);
//	mfs.Add(3,new Apple());
//	mfs.Add(4, new Banana());
//	MyFruit fru=(MyFruit)mfs.Get(1);
//	fru.Display();
//	
//	MyFruitStore mfs1=MyFruitStore.Getfruitstore();
//	System.out.println("mfs:"+mfs.toString());
//	System.out.println("mfs1:"+mfs1.toString());
//}
//}
