package Tem;
//ģ�巽��ģʽ
public class ClientClass {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ADefiniteIntegral[] x=new ADefiniteIntegral[3];
		x[0]=new DeflntegralXX(0,20,100);
		x[1]=new DeflntegralXX(20,0,100);
		x[2]=new DeflntegralLn(2.71,20,100);
		for(int i=0;i<3;i++) {
			System.out.println(x[i].CalDefiniteIntegral());
		}
	}

}
