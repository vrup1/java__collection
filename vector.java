package set;
import java.util.Iterator;
import java.util.Vector;
public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> vc =new Vector<>();
vc.add("vrushali");
vc.add("rucha");
vc.add("shraddha");

Iterator<String> itr=vc.iterator();

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}
	
	}


