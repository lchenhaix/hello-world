package pro;

import java.util.Hashtable;

public class MyFruitStore {
//	private  static Hashtable fruittable=null;    //�˴�static��ʡ��  ����ģʽ�еĶ���ʽ
//	private static MyFruitStore fruitstore=new MyFruitStore();
//	private MyFruitStore() {
//		fruittable=new Hashtable<Integer,MyFruit>();
//	}
//	public static MyFruitStore Getfruitstore() {
//				
//		return fruitstore;
//	}
//}	
	
	private  static Hashtable fruittable=null;    //�˴�static��ʡ��   ����ģʽ�е�����ʽ
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

//  public class MyFruitStore {  //ԭ�͹�����ģʽ
//	private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();
//	public static void Add(Integer key,MyFruit fruit) {
//		fruittable.put(key,fruit);
//	}
//	public static MyFruit Get(Integer key) {
//		 MyFruit fruit=(MyFruit)fruittable.get(key);
//		 return (MyFruit) fruit.clone();//��¡��ȥ  ���˴���Ҫ
//	}
//}
