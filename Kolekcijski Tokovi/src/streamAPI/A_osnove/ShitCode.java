package streamAPI.A_osnove;

import java.util.HashMap;
import java.util.Map;

public class ShitCode {

	public static void main(String[] args) {
		Map<String, Integer> grades = new HashMap<>();
			
		grades.put("Ana", 3);
		grades.put("Ann", 5);
		grades.put("Anal", 4);
		
		for(Map.Entry<String, Integer> entry : grades.entrySet()) {
			System.out.format("%s => %d\n", entry.getKey(), entry.getValue());
		}
	}

}
