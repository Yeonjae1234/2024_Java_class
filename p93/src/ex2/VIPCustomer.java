package ex2;

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
}
