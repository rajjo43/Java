
package firstPackage;

import java.util.HashMap;
import java.util.Map;

public class MapSampleCode {

	public static void main(String[] args) {
		Map<String,Integer>sampleMap = new HashMap<String,Integer>();
		sampleMap.put("Std1",50);
		sampleMap.put("Std2",70);
		sampleMap.put("Std3",40);
		sampleMap.put("Std4",90);
		
		System.out.println(sampleMap);
		
		System.out.println(sampleMap.get("Std1"));
		
		for(String mapKey:sampleMap.keySet()) {
			System.out.println(mapKey);
		}
		
		for(String mapKey:sampleMap.keySet()) {
			System.out.println(sampleMap.get(mapKey));
		}

	}

}
