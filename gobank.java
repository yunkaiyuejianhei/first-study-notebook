package Weituo;
public class gobank extends bank  {
	
	public gobank(String name, String bankname, double money,
			double blance, double turnover, int password) {
		super(name, bankname, money, blance, turnover, password);

	}
	
	
	public static void main(String[] args) {

		bank b=new bank("小明", "建设银行", 0, 0,0, 123456);
		//人名，银行名，交易额，存款，密码
		b.welcome();
		b.kaihu("小明","开户存了",1000);//人名，开户存款
		b.cunkuan(800,800);//人身上的余额，交易额
		b.qukuan(123456,1800);//密码，交易额
	
	}
}
