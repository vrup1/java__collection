package arraylist;
import java.util.ArrayList;
public class arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> stuList=new ArrayList<>();
	stuList.add(20);
	stuList.add(74);
	stuList.add(50);
	
	System.out.println("Print the size of collection:"+stuList.size());
	System.out.println("check whether collection is empty:"+stuList.isEmpty());	
	System.out.println("the index of collection  :"+stuList.indexOf(stuList));
	System.out.println("the hashCode of collection  :"+stuList.hashCode());	
	System.out.println("the collection contains  :"+stuList.contains(stuList));
	System.out.println("the element having 2nd index from collection is :"+stuList.get(2));
	System.out.println("remove element having index 1 from collection:"+stuList.remove(1));
	System.out.println("removeall element from collection:"+stuList.removeAll(stuList));
	System.out.println("last Index of from collection:"+stuList.lastIndexOf(stuList));}
	
	}
	
-------------------------------------------------OUT PUT--------------------------------------------------		
	
Print the size of collection:3
check whether collection is empty:false
the index of collection  :-1
the hashCode of collection  :51355
the collection contains  :false
the element having 2nd index from collection is :50
remove element having index 1 from collection:74
removeall element from collection:true
last Index of from collection:-1	