package Ada;

import pro.MyFruit;

public class Adapter  implements InewJuicer {     //对象适配器模式，灵活性更大
	private OldJuicer oldjuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		oldjuicer=new OldJuicer();
		String str="混合果汁："+oldjuicer.onePort(fruit1);
		str+=oldjuicer.onePort(fruit2);
		return str;
	}
}

//	@Override
//	public String newPort(MyFruit fruit1, MyFruit fruit2) {   //类适配器模式
//		// TODO 自动生成的方法存根
//		String str="混合果汁："+onePort(fruit1);
//		str+=onePort(fruit2);
//		return str;
//	}
//
//}
