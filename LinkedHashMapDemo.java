package PracticesByVrushali;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap <Integer,String>lhm=new LinkedHashMap<>();
lhm.put(21, "Riddhi");
lhm.put(22, "Vrushali");
lhm.put(23, "Niveta");
lhm.put(24, "Dipti");
lhm.put(2, "");

for (Map.Entry<Integer, String> hmn:lhm.entrySet()) {
	System.out.println("key is:"+hmn.getKey()+" value:"+hmn.getValue());
	}
}

}
