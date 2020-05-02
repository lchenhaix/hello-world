package Meb;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {
	private Hashtable members=new Hashtable();
	@Override
	public void sendText(String from,String to, String message) {
		// TODO �Զ����ɵķ������
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("��","*");
		member.receiveText(from, newMessage);
	}

	@Override
	public void sendImage(String from,String to, String image) {
		// TODO �Զ����ɵķ������
		Member member=(Member)members.get(to);
		if(image.length()>5)
		{
			System.out.println("ͼƬ̫�󣬷���ʧ�ܣ�");
		}
		else
		{
			member.receiveImage(from, image);
		}
	}

	@Override
	public void register(Member member) {
		// TODO �Զ����ɵķ������
		if(!members.contains(member)) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}
	}

}
