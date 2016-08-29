package strategy;
/**
 * @author shadow
 * @Date 2016��8��12������9:04:53
 * @Fun  ����(Strategy)ģʽ  ��ע����Ϊ��ѡ��
 * 		  ��װ��һϵ�в��Զ����û���ѡ��ʹ�����ֲ��Զ���
 * 		 ��򵥹���������
 * 			����ģʽ��������Զ����Context����Context��װ���Զ���ķ������ã����⹫��Context�ķ����ӿ�
 * 			�򵥹���ģʽ������һ���򵥵Ĳ�������������Ȼ����ó�������ķ���
 * 		��װ��ģʽ������
 * 			Context����ʵ��(Implements)ҵ��ӿڣ�����Ҫ��ǿ���еĲ��Զ���Ĺ��ܡ�
 * 			����ģʽ�������㷨����ϵͳ�У����繤�ʽ��㡣
 **/
public class MainTest {
	public static void main(String[] args) {
		double money = 998;
		CashContext cashContext = new CashContext(new CashNormal());
		System.out.println("ԭ�ۣ�" + cashContext.acceptCash(money));
		
		cashContext.setCasher(new CashRebate(8.5));
		System.out.println("��85�ۣ�" + cashContext.acceptCash(money));
		
		cashContext.setCasher(new CashReturn(300, 50));
		System.out.println("��300��50��" + cashContext.acceptCash(money));
	}
}
