
public class Test {

	   static Stack<Integer> trier (Stack<Integer> p1) {
	     Stack<Integer> p2 =new Stack<Integer>();
	     Stack<Integer> p3 =new Stack<Integer>();
	     while (!(p1.isEmpty())){
	    	 if ((p2.isEmpty()) || (p1.peek()<p2.peek())) {
	    		 p1.push(p2.pop());
	    		 if (!(p3.isEmpty())) {
	    			 p3.clear();
	    			 p2.pop(p3);
	    		 	 
	    		 }
	    	 }
	    	 
	    	 else {
	    		
	    		
	    		 p3.push(p2.pop());
	    		 
	    	 }
	     }
	   }

	    public static void main( String[] args ) {

	        int[] tab = {4,3,2,5,8,0,2,6,9,3};
	        Stack<Integer> pile;
	        pile = new ArrayStack<Integer>( 10 );
	         
	        
	         Stack<Integer> pileTrie;
	         pileTrie = new ArrayStack<Integer>( 10 );

	       /*Empiler la pile avec les elements de tab et afficher ses elements*/
	        for (int i = 0; i < tab.length; i++) {
	                pile.push(tab[i]);
	        }

	       System.out.println( "Les elements de ma pile sont au depart : "  );
	       while ( ! pile.isEmpty() ) {
	            System.out.println(  pile.pop() );
	        }
	        
	        
	       /*Empiler la pile a nouveau avec tab et afficher ses elements tries*/
	       for (int i = 0; i < tab.length; i++) {
	                pile.push(tab[i]);
	        }
	        pileTrie=trier(pile);
	        
	        System.out.println();
	        System.out.println( "Les elements de ma pile triee sont : "  );
	        while ( !pileTrie.isEmpty() ) {
	            System.out.println( pileTrie.pop() );
	        }

	    }

	}
