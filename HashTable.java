package PracticesByVrushali;
import java.util.Hashtable;
import java.util.Map;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> ht=new Hashtable<>();
ht.put(45, "prachiti");
ht.put(56, "Nirmiti");
ht.put(22, "Bidipta");
ht.put(78, "Navya");
ht.put(14, "Priyani");
ht.put(67, "Arrvi");
ht.put(35, "Keya");
for(Map.Entry<Integer,String> mm:ht.entrySet()) {
	System.out.println("The key is:"+mm.getKey() +"The value is:" +mm.getValue());
}
	}

}
