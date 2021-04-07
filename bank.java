package Weituo;

public class bank {
/*
 * 对象：人，银行
 * 人：名字，余额
 * 银行：名字，账号，密码，存款，取款，交易额
 */
	protected String name="";//人名
	private String bankname="";//银行名字
	private double money=0;//人身上的余额
	protected static double blance=0;//银行存款
	private double turnover=0;//交易额
	private int password=0;//密码
	
	public bank(String name, String bankname, double money, double blance, double turnover, int password) {
	
		this.name = name;
		this.bankname = bankname;
		this.setMoney(money);
		this.setBlance(blance);
		this.turnover = turnover;
		this.password = password;
	}

	public  void welcome(){
		System.out.println("欢迎来到"+bankname);
		System.out.println("---------------");
	}
	
	public void kaihu(String name,String string,int turnover) {//开户
		 this.setBlance(turnover);
		 System.out.println(name+string+turnover);
	}
	
	public void cunkuan(int money,int turnover) {//存款
		if(money>=turnover) {
			money=money-turnover;
			setBlance(getBlance()+turnover);
			System.out.println("存了"+turnover);
		}else
		{
			System.out.println("余额不足");
		}
	}
	
	public void qukuan(int password,double turnover ) {//取款，银行免利息
		if(password!=123456) {
			System.out.println("密码错误");
		}else
		{	if(turnover>this.getBlance()) {
				System.out.println("你的余额不足");
			}else
			{
				setBlance(getBlance()-turnover);
				setMoney(getMoney()+turnover);
				System.out.println("取出了"+turnover);
			}
		}
		System.out.println("欢迎下次光临");
	}
	
	public static void main(String[] args) {
		bank b=new bank("小明", "建设银行", 0, 0, 0,123456);//人名，银行名，交易额，存款，密码
		b.welcome();
		b.kaihu("小明","开户存了",1000);
		b.cunkuan(1000,800);
		b.qukuan(123456,1800);
		b.toString();
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getBlance() {
		return blance;
	}

	public void setBlance(double blance) {
		this.blance = blance;
	}

}
