import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumeration {

	public static void main(String[] args) {
		
		
		
		Vector v=new Vector<>();
		
		v.add("Suyog");
		
		v.add("Jadhav");
		
		v.add("Mangur");
		
		
		Enumeration<String> names=v.elements();
				
			while(names.hasMoreElements())
				{
					//cursor moving to next elements
					String Str=names.nextElement();
//					System.out.print(Str+ " ");
					
					
					if (Str!="Suyog") {
						
						System.out.print(Str + " ");
						
					}
				}
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
		

	}

}
