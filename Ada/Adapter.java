package Ada;

import pro.MyFruit;

public class Adapter  implements InewJuicer {     //����������ģʽ������Ը���
	private OldJuicer oldjuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		oldjuicer=new OldJuicer();
		String str="��Ϲ�֭��"+oldjuicer.onePort(fruit1);
		str+=oldjuicer.onePort(fruit2);
		return str;
	}
}

//	@Override
//	public String newPort(MyFruit fruit1, MyFruit fruit2) {   //��������ģʽ
//		// TODO �Զ����ɵķ������
//		String str="��Ϲ�֭��"+onePort(fruit1);
//		str+=onePort(fruit2);
//		return str;
//	}
//
//}
