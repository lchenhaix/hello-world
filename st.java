import java.util.Random;

public class st {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] s= {"qwe","asd","zxc"};
		String[] t= {"wer","sdf","xcv"};
		String[] d= {"ert","dfg","cvb"};
	Random rad=new Random();
	int y=rad.nextInt(s.length);
	int x=rad.nextInt(t.length);
	int z=rad.nextInt(d.length);
	System.out.println(s[y]+t[x]+d[z]);
	}
}
