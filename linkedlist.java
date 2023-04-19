package arraylist;
import java.util.LinkedList;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> studList=new LinkedList<>();
studList.add(2);
studList.add(20);
studList.add(76);
studList.add(42);
studList.add(22);
studList.add(2);

System.out.println("print size of collection:"+studList.size());
System.out.println("check whether collection is empty:"+studList.isEmpty());
System.out.println("print hashCode of collection:"+studList.hashCode());
System.out.println("print last index of collection:"+studList.lastIndexOf(studList));
	}

}
