package command;
//具体命令类
public class OrderCommand implements Command {
	private Operator receiver;
	public Order order;
	public OrderCommand(Operator receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}
	@Override
	public void execuit() {
		// TODO 自动生成的方法存根
		System.out.println(order.getId()+"号顾客产品");
		receiver.MarkFruit(order);
	}

}
