package Weituo;

public class Yikatong extends bank{
	
	
	public Yikatong(String name, String bankname, double money,
			double blance, double turnover, int password) {//��ʼ��
		super(name, name,money, blance,turnover, password);
		
	}
	
	public static void gouwu(int turnover, double blance) {
		
		if(blance>=turnover) {
			blance=blance-turnover;
			System.out.print("����:"+turnover+";���:"+blance);
		}else {
			System.err.println("����");
		}
	}
	
	public static void main(String[] args) {
		bank b=new bank("С��", "У԰һ��ͨ", 0, 0,0, 123456);
		b.welcome();
		b.kaihu("С��","�쿨��ֵ��",1000);//������������ֵ
		b.cunkuan(800,800);//�����ϵ������׶�
		Yikatong.gouwu(100, blance);
	}
}