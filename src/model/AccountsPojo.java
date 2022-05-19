package model;

public class AccountsPojo {

	private int accountId;
	private String accountType;
	private double balance;
	private String multipleAccount;
	private String jointAccount;
	private double tranferFund;

	// update stuff
	public AccountsPojo() {
		super();
	}

	public AccountsPojo(int accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;

	}

	public AccountsPojo(int accountId, String accountType, double balance, String multipleAccount, String jointAccount,
			double tranferFund) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;

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
				+ " , multipleAccount=" + multipleAccount + ", jointAccount=" + jointAccount + ", tranferFund="
				+ tranferFund + "]";
	}

}
