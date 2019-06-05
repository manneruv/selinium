package basic;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class ReverseSentence {
	 
    
  
		

			public static void main(String[] args) {
			// TODO Auto-generated method stub

			String s = "My name is Sreedevi";
			String a[] = s.split(" ");
			int b = a.length;
			System.out.println(b);
			String rev = "";

			for(int i=b-1; i>=0;  i--) {

			rev = rev + a[i] + " ";	

			}
			System.out.println(rev);

	
	}
}



