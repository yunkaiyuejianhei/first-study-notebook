package Weituo;

public class bank {
/*
 * �����ˣ�����
 * �ˣ����֣����
 * ���У����֣��˺ţ����룬��ȡ����׶�
 */
	protected String name="";//����
	private String bankname="";//��������
	private double money=0;//�����ϵ����
	protected static double blance=0;//���д��
	private double turnover=0;//���׶�
	private int password=0;//����
	
	public bank(String name, String bankname, double money, double blance, double turnover, int password) {
	
		this.name = name;
		this.bankname = bankname;
		this.setMoney(money);
		this.setBlance(blance);
		this.turnover = turnover;
		this.password = password;
	}

	public  void welcome(){
		System.out.println("��ӭ����"+bankname);
		System.out.println("---------------");
	}
	
	public void kaihu(String name,String string,int turnover) {//����
		 this.setBlance(turnover);
		 System.out.println(name+string+turnover);
	}
	
	public void cunkuan(int money,int turnover) {//���
		if(money>=turnover) {
			money=money-turnover;
			setBlance(getBlance()+turnover);
			System.out.println("����"+turnover);
		}else
		{
			System.out.println("����");
		}
	}
	
	public void qukuan(int password,double turnover ) {//ȡ���������Ϣ
		if(password!=123456) {
			System.out.println("�������");
		}else
		{	if(turnover>this.getBlance()) {
				System.out.println("�������");
			}else
			{
				setBlance(getBlance()-turnover);
				setMoney(getMoney()+turnover);
				System.out.println("ȡ����"+turnover);
			}
		}
		System.out.println("��ӭ�´ι���");
	}
	
	public static void main(String[] args) {
		bank b=new bank("С��", "��������", 0, 0, 0,123456);//�����������������׶������
		b.welcome();
		b.kaihu("С��","��������",1000);
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
