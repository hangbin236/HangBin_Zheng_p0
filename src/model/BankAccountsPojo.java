package model;

public class BankAccountsPojo {
	
	private int bankId;
	private double balance;
	private String multipleAccount;
	private String jointAccount;
	private double tranferFund;
	
	//update stuff 
	public BankAccountsPojo() {
	}

	public BankAccountsPojo(int bankId, double balance, String multipleAccount, String jointAccount,
			double tranferFund) {
		super();
		this.bankId = bankId;
		this.balance = balance;
		this.multipleAccount = multipleAccount;
		this.jointAccount = jointAccount;
		this.tranferFund = tranferFund;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMultipleAccount() {
		return multipleAccount;
	}

	public void setMultipleAccount(String multipleAccount) {
		this.multipleAccount = multipleAccount;
	}

	public String getJointAccount() {
		return jointAccount;
	}

	public void setJointAccount(String jointAccount) {
		this.jointAccount = jointAccount;
	}

	public double getTranferFund() {
		return tranferFund;
	}

	public void setTranferFund(double tranferFund) {
		this.tranferFund = tranferFund;
	}

	
}
