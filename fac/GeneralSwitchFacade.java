package fac;
//外观角色（类）
public class GeneralSwitchFacade {
	private Light Lights[]=new Light[4];
	private Fan fan;
	private Television tv;
	private AirConditioner air;
	public GeneralSwitchFacade() {
		Lights[0]=new Light("左前");
		Lights[1]=new Light("右前");
		Lights[2]=new Light("左后");
		Lights[3]=new Light("右后");
		fan=new Fan();
		tv=new Television();
		air=new AirConditioner();
	}
	public void on() {
		Lights[0].on();
		Lights[1].on();
		Lights[2].on();
		Lights[3].on();
		fan.on();
		air.on();
		tv.on();
		}
	public void off() {
		Lights[0].off();
		Lights[1].off();
		Lights[2].off();
		Lights[3].off();
		fan.off();
		air.off();
		tv.off();
		}
}
