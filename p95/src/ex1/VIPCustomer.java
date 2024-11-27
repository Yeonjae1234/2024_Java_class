package ex1;

public class VIPCustomer extends Customer{
	String agent;
	double saleRatio;
	
	public VIPCustomer(int cstID, String cstName,String agent) {
		
		super(cstID,cstName);

		this.agent=agent;
    	cstGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	@Override
	int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
}
