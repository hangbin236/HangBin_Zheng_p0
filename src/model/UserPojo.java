package model;

public class UserPojo {

	private int userId;
	private String username;
	private String password;
	private double deposit;
	private double withdraw;
	private double balance;
	private double tansaction;
	private String multipleAccount;
	private String jointAccount;
	private double tranferFund;

	public UserPojo() {

	}

	public UserPojo(int userId, String username, String password, double deposit, double withdraw, double balance,
			double tansaction, String multipleAccount, String jointAccount, double tranferFund) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
		this.tansaction = tansaction;
		this.multipleAccount = multipleAccount;
		this.jointAccount = jointAccount;
		this.tranferFund = tranferFund;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "UserPojo [userId=" + userId + ", username=" + username + ", password=" + password + ", deposit="
				+ deposit + ", withdraw=" + withdraw + ", balance=" + balance + ", tansaction=" + tansaction
				+ ", multipleAccount=" + multipleAccount + ", jointAccount=" + jointAccount + ", tranferFund="
				+ tranferFund + "]";
	}

}
