package Weituo;

public class Yikatong extends bank{
	
	
	public Yikatong(String name, String bankname, double money,
			double blance, double turnover, int password) {//初始化
		super(name, name,money, blance,turnover, password);
		
	}
	
	public static void gouwu(int turnover, double blance) {
		
		if(blance>=turnover) {
			blance=blance-turnover;
			System.out.print("消费:"+turnover+";余额:"+blance);
		}else {
			System.err.println("余额不足");
		}
	}
	
	public static void main(String[] args) {
		bank b=new bank("小明", "校园一卡通", 0, 0,0, 123456);
		b.welcome();
		b.kaihu("小明","办卡充值了",1000);//人名，建卡充值
		b.cunkuan(800,800);//人身上的余额，交易额
		Yikatong.gouwu(100, blance);
	}
}