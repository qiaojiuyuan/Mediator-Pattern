/**
 * 采购管理
 * @author qiaojy
 *
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	//采购电脑
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM() {
		System.out.println("不再采购电脑");
	}
}
