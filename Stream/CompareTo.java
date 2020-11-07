import java.beans.beancontext.BeanContext;
import java.text.Collator;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.omg.CORBA.portable.InvokeHandler;

import com.sun.javafx.geom.transform.CanTransformVec3d;

public class CompareTo {

	public static void main(String[] args) {
		
		
		String s1="S";
		
		String s2="s";
		
		int a=45;
		
		int b=45;
		
		
//Can not Be invoke because it Is not object;
//		System.out.println(a.compareTo(b));
		
		
		
		System.out.println(s1.compareTo(s2));
		
//	    System.out.println((int)'s');  
//	    System.out.println((int)'u');  
//	    System.out.println((int)'a');  
//	    System.out.println((int)'c');  
//	    
	    
	    Collator collator= 	Collator.getInstance();
	    
	  System.out.println(collator.compare(s1, s2));
	  
		
	 
		

	}

}
