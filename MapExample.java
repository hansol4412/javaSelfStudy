package chap13;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapExample {

	public static void main(String[] args) {
		// HashMap�� ���̵�� ������ ����Ǿ� �ֽ��ϴ�. ��������� �ְ� ������  �ְ������� ���� ���̵� ����Ͻÿ�.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("pink", 87);
		map.put("red", 97);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//���̵�� ������ ��� �ʿ�
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator <Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
		totalScore += value;
		
		if(maxScore<value) {
			maxScore = value;
			name =  key;
		}
		
		}
		
		int avgScore = totalScore/ map.size();
		System.out.println("�������:" + avgScore);
		System.out.println("�ְ�����:" + maxScore);
		System.out.println("�ְ������� ���� ���̵� :" + name);
		
		
	}

}
