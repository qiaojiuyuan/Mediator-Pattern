/**
 * 库存管理
 * @author qiaojy
 *
 */
public class Stock extends AbstractColleague{

	private static int COMPUTER_NUMBER = 100;
	
	public Stock(AbstractMediator medietor) {
		super(medietor);
	}
	
	//增加库存
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量为:"+COMPUTER_NUMBER);
	}
	
	//减少库存
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为:"+COMPUTER_NUMBER);
	}
	
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	public void clearStock() {
		System.out.println("清理存货数量为:"+COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
