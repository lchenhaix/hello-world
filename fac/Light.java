package fac;
//��ϵͳ��ɫ
public class Light {
	private String position;
	public Light(String position) {
		this.position=position;
	}
	public void on() {
		System.out.println(position+"�ƴ���");
	}
	public void off() {
		System.out.println(position+"�ƹر���");
	}
}
