package pro;

public class ClientCladss {

public static void main(String[] args) {
    MyFruit fru1=new Apple();     //ԭ��ģʽ(ǳ����)
		//MyFruit fru2=fru1;
	MyFruit fru2=(Apple)fru1.clone();
	fru1.Display();
	fru2.Display();
		System.out.println("fru1:"+fru1.hashCode());
	System.out.println("fru2:"+fru2.hashCode());
	System.out.println("fru1:"+fru1.toString());
		System.out.println("fru2:"+fru2.toString());  //��ν�ĵ�ַ
	System.out.println(fru1==fru2);
	System.out.println(fru1.equals(fru2));
	}
}

//public static void main(String[] args) {
//	MyFruit fru1=new Apple();     //ԭ�͹�����ģʽ
//	MyFruit fru2=new Banana();
//	MyFruitStore.Add(1,fru1);
//	MyFruitStore.Add(2,fru2);
//	MyFruitStore.Add(3,new Apple());
//	MyFruitStore.Add(4,new Banana());
//	MyFruit fru=(MyFruit)MyFruitStore.Get(2);  //�����ˮ�������õ����������ʼ����������
//	MyFruit frui=(MyFruit)MyFruitStore.Get(3);
//	fru.Display();
//	frui.Display();
//}
//}

//public static void main(String[] args) {
//	MyFruit fru1=new Apple();    //����ģʽ
//	MyFruit fru2=new Banana();
//	MyFruitStore mfs=MyFruitStore.Getfruitstore();  //mfsΪ��Ķ���
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
