package set;
import java.util.Iterator;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("storybook");
		hs.add("novel");
		hs.add("litrature");
		hs.add("artbook");
		hs.add("");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
