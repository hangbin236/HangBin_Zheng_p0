package model;

public class BankAccountsPojo {
	private double deposit;
	private double withdraw;
	private double balance;
	private double tansaction;
	private String multipleAccount;
	private String jointAccount;
	private double tranferFund;

	public BankAccountsPojo() {
	}

	public BankAccountsPojo(double deposit, double withdraw, double balance, double tansaction, String multipleAccount,
			String jointAccount, double tranferFund) {
		super();
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
		this.tansaction = tansaction;
		this.multipleAccount = multipleAccount;
		this.jointAccount = jointAccount;
		this.tranferFund = tranferFund;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTansaction() {
		return tansaction;
	}

	public void setTansaction(double tansaction) {
		this.tansaction = tansaction;
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
		return "BankAccounts [deposit=" + deposit + ", withdraw=" + withdraw + ", balance=" + balance + ", tansaction="
				+ tansaction + ", multipleAccount=" + multipleAccount + ", jointAccount=" + jointAccount
				+ ", tranferFund=" + tranferFund + "]";
	}

}
