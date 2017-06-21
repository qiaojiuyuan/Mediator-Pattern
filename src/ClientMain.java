
public class ClientMain {

	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(2);
		
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
