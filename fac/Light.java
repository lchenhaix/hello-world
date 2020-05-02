package fac;
//子系统角色
public class Light {
	private String position;
	public Light(String position) {
		this.position=position;
	}
	public void on() {
		System.out.println(position+"灯打开了");
	}
	public void off() {
		System.out.println(position+"灯关闭了");
	}
}
