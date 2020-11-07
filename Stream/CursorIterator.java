import java.util.ArrayList;
import java.util.Iterator;

public class CursorIterator {

	public static void main(String[] args) {

		
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		
		for(int i=0;i<10;i++)
		{
			
			arrayList.add(i);
			
			System.out.println(arrayList);
			
		}
		
		
		Iterator itr=arrayList.iterator();
		
		while(itr.hasNext())
		{
			int i=(Integer) itr.next();
			
			System.out.println(i + " ");
			
			System.out.println();
			
			if (i% 2 == 0) {
				
				
				itr.remove();
				
			}
		}
		
		System.out.println();
		
		System.out.println(arrayList);
	}

}
