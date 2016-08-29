/**
 * @author shadow
 * @Date 2016��8��13������8:21:03
 * @Fun  ������(Visitor)ģʽ  ��Ϊģʽ
 * 		 �ڲ��޸����г���ṹ��ǰ���£�ͨ����Ӷ���ġ������ߡ�����ɶ����д��빦�ܵ�����
 * 	  	 ����˵��������ģʽ����һ�ַ���������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬�ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч��
 * 		ȱ�㣺����µ�Ԫ���࣬�Ƚ����ѣ���Ϊ��Ҫ�޸ĳ�������ߵĽӿڼ�ʵ�֣�Υ����-��ԭ��
 **/
package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		List<Flower> flowers = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			flowers.add(FlowerGenerator.newFlower());
		}
		
		Visitor visitor = new StringVisitor();
		Iterator<Flower> iterator = flowers.iterator();
		while(iterator.hasNext()){
			iterator.next().accept(visitor);
			System.out.println(visitor);
		}
		System.out.println("-----------");
		
		visitor = new BeeVisitor();
		iterator = flowers.iterator();
		while(iterator.hasNext()){
			iterator.next().accept(visitor);
			System.out.println(visitor);
		}
	}
}
