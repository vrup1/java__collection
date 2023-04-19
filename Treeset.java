package set;
import java.util.TreeSet;
import java.util.Iterator;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<>();
ts.add("english");
ts.add("maths");
ts.add("");
ts.add("biology");
ts.add("physics");
ts.add("chemistry");

Iterator<String> itr =ts.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
