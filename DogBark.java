import java.util.LinkedHashMap;
import java.util.Map;

public class DogBark {

	public static void main(String[] args) {
		Map<Integer, String> mis = new LinkedHashMap<Integer, String>();
		mis.put(1, "Smile");
		mis.put(2, "Cry");
		mis.put(3, "Fear");
		System.out.println("Alex wakes up with " + mis.get(3) + " and " + mis.get(2)
				+ " before goes to school and return home with " + mis.get(1));

	}

}
