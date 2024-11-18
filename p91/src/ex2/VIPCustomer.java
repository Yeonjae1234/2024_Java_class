package ex2;

public class VIPCustomer extends Customer{
	String agent;
	double saleRatio;
	
	VIPCustomer(){
		cstGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
	}
}
