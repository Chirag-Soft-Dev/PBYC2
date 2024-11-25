package manager;

public class Manager extends account.Account{
	@Override
	public double calSal(double sal, double tax) {
		// TODO Auto-generated method stub
		return sal-tax;	
	}
}
