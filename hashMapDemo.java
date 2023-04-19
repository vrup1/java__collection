package PracticesByVrushali;
import java.util.HashMap;
import java.util.Map;
public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm=new HashMap<>();
hm.put(21, "Riddhi");
hm.put(22, "Vrushali");
hm.put(23, "Niveta");
hm.put(24, "Dipti");
hm.put(null, null);

for (Map.Entry<Integer, String> hmn:hm.entrySet()) {
	System.out.println("key is:"+hmn.getKey()+"get value:"+hmn.getValue());
	}
}

}
