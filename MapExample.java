package chap13;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapExample {

	public static void main(String[] args) {
		// HashMap에 아이디와 점수가 저장되어 있습니다. 평균점수와 최고 점수와  최고점수를 받은 아이디를 출력하시오.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("pink", 87);
		map.put("red", 97);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//아이디와 점수가 모두 필요
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
		System.out.println("평균점수:" + avgScore);
		System.out.println("최고점수:" + maxScore);
		System.out.println("최고점수를 받은 아이디 :" + name);
		
		
	}

}
