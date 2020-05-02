package Meb;

public class DiamondMember extends Member {
	public DiamondMember(String name) {
		super(name);
	}
	@Override
	public void sendText(String to,  String message) {
		// TODO 自动生成的方法存根
		System.out.println("钻石会员发送消息：");
		chatroom.sendText(name,to, message);
	}

	@Override
	public void sendImage(String to,String Image) {
		// TODO 自动生成的方法存根
		System.out.println("钻石会员发送图片:");
		chatroom.sendImage(name,to, Image);
	}

}
