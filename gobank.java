package Weituo;
public class gobank extends bank  {
	
	public gobank(String name, String bankname, double money,
			double blance, double turnover, int password) {
		super(name, bankname, money, blance, turnover, password);

	}
	
	
	public static void main(String[] args) {

		bank b=new bank("С��", "��������", 0, 0,0, 123456);
		//�����������������׶������
		b.welcome();
		b.kaihu("С��","��������",1000);//�������������
		b.cunkuan(800,800);//�����ϵ������׶�
		b.qukuan(123456,1800);//���룬���׶�
	
	}
}
