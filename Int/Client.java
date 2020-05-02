package Int;
//解释器模式
public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Expression isMale=getMaleExpression();
		Expression isMarriedWomen=getMarriedWomanExpression();
		
		System.out.println("John is male?"+isMale.interpret("John"));
		System.out.println("Julie is a married Women?"+isMarriedWomen.interpret("Married Julie"));
		
	}
	public static Expression getMaleExpression() {
		Expression robert=new TerminalExpression("Robert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert,john);
	}
	public static Expression getMarriedWomanExpression() {
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new OrExpression(julie,married);
	}
}
