package model;

public class AccountsPojo {
	
	private int accountId;
	private String accountType;
	private double balance;
	private double deposit;
	private double withdraw;
	private String multipleAccount;
	private String jointAccount;
	private double tranferFund;
	
	//update stuff 
	public AccountsPojo() {
	}

	public AccountsPojo(int accountId, String accountType, double balance, double deposit, double withdraw,
			String multipleAccount, String jointAccount, double tranferFund) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.multipleAccount = multipleAccount;
		this.jointAccount = jointAccount;
		this.tranferFund = tranferFund;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
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

	@Override
	public String toString() {
		return "BankAccountsPojo [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance
				+ ", deposit=" + deposit + ", withdraw=" + withdraw + ", multipleAccount=" + multipleAccount
				+ ", jointAccount=" + jointAccount + ", tranferFund=" + tranferFund + "]";
	}

	

	
}
