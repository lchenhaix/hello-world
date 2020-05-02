package pro;

import java.util.Hashtable;

public class MyFruitStore {
//	private  static Hashtable fruittable=null;    //此处static可省略  单例模式中的饿汉式
//	private static MyFruitStore fruitstore=new MyFruitStore();
//	private MyFruitStore() {
//		fruittable=new Hashtable<Integer,MyFruit>();
//	}
//	public static MyFruitStore Getfruitstore() {
//				
//		return fruitstore;
//	}
//}	
	
	private  static Hashtable fruittable=null;    //此处static可省略   单例模式中的懒汉式
	private static MyFruitStore fruitstore=null;
	private MyFruitStore() {
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStore();
		}
		return fruitstore;
	}
		public  void Add(Integer key,MyFruit fruit) {
			fruittable.put(key,fruit);
		}
		public  MyFruit Get(Integer key) {
			 MyFruit fruit=(MyFruit)fruittable.get(key);
	     return (MyFruit) fruit.clone();
	}
}

//  public class MyFruitStore {  //原型管理器模式
//	private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();
//	public static void Add(Integer key,MyFruit fruit) {
//		fruittable.put(key,fruit);
//	}
//	public static MyFruit Get(Integer key) {
//		 MyFruit fruit=(MyFruit)fruittable.get(key);
//		 return (MyFruit) fruit.clone();//克隆出去  ，此处重要
//	}
//}
