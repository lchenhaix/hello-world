package Com;
	//���ģʽ,������ˮ�������
	//�û���
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Plate plate1,plate2,plate3;
		MyElement obj1,obj2,obj3,obj4,obj5;
		
		obj1=new Apple();
		obj2=new Banana();
		plate1=new Plate();
		plate1.add(obj1);
		plate1.add(obj2);
		
		obj3=new Apple();
		obj4=new Pear();
		plate2=new Plate();
		plate2.add(obj3);
		plate2.add(obj4);
		
		obj5=new Pear();
		plate3=new Plate();
		plate3.add(obj5);
		plate3.add(plate1);
		plate3.add(plate2);
		
		
		//plate3.delete(obj5);//ע��˴�����Ϊ3��������5��obj
	    //plate3.delete(plate1);
		
		plate3.eat();
	}

}
