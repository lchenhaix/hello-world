
public class lang3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
int n=99;
do {
	if(n>=2) {
		System.out.print(n+"bottles of beer on the wall,");
		System.out.println(n+"bottles of beer.");
	}
		else {
			System.out.print(n+"bottle of beer on the wall,");
			System.out.println(n+"bottle of beer.");
		}
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		if(n>2) {
			System.out.println((n-1)+"bottles of beer on the wall.");
		}
		else {
		System.out.println((n-1)+"bottle of beer on the wall.");
		}
		System.out.println();
		n--;
}while(n>0);
System.out.println("No more bottles of beer on the wall." );
	}
}

