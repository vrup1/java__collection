package PracticesByVrushali;

import java.util.Map;
import java.util.TreeMap;

public class treeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> tmd=new TreeMap<>();
tmd.put(12, "mitali");
tmd.put(8, "shweta");
tmd.put(22, "ruchi");
tmd.put(16, "tejashree");
tmd.put(10, "komal");
tmd.put(11, "vaishnavi");
for(Map.Entry<Integer,String> mm:tmd.entrySet()) {
	System.out.println("The key is:"+mm.getKey()+"The value is:"+mm.getValue());
}
	}

}
