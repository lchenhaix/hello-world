package command;
//����������
public class OrderCommand implements Command {
	private Operator receiver;
	public Order order;
	public OrderCommand(Operator receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}
	@Override
	public void execuit() {
		// TODO �Զ����ɵķ������
		System.out.println(order.getId()+"�Ź˿Ͳ�Ʒ");
		receiver.MarkFruit(order);
	}

}
