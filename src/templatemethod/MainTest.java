/**
 * @author shadow
 * @Date 2016��8��12������9:34:26
 * @Fun  ģ�巽��(TemplateMethod)ģʽ����Ϊ��ģʽ��������һϵ�в����ĹǼܣ���ģ���ʵ�֣��ӳٵ�ʵ������������н��С�
 * 		 ��������ģʽ�ıȽϣ�
 * 			������ģʽ��ʹ����Ϸ�ʽ����ָ����Directorָ����ϵ�Builder���죬����������Director���ƣ������ģ��
 * 			������Builderʵ�֡�
 * 			ģ�巽��ģʽ����ģ�嶨��������̣��������ʵ����ʵ�־����ģ�鷽����
 * 			���ϣ�������ģʽ�����ģ�巽��ģʽ��
 **/
package templatemethod;

public class MainTest {
	public static void main(String[] args) {
		BaseTemplate template = new TemplateMethod();
		template.useTemplateMethod();
		
		System.out.println();
		
		template = new TemplateMethod2();
		template.useTemplateMethod();
	}
}
