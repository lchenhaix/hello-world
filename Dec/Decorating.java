package Dec;
	//����װ����
public class Decorating implements IBirthdayCake {
	private IBirthdayCake birthdayCake;//�ӿ�����������
	public Decorating(IBirthdayCake birthdayCake) {
		this.birthdayCake=birthdayCake;
	}
	@Override
	public void Show() {
		// TODO �Զ����ɵķ������
		birthdayCake.Show();
	}

}
