
public class Set {

    private static final String str = System.getProperty( "line.separator" );
        
    // Instance variable
    private Cashier[] set;

    // Constructor
    public Set( int nbr ) {
        
       if (nbr<1) {
    	   
        throw new IllegalArgumentException(Integer.toString( nbr ) );
    }
       else {
    	   set = new Cashier[nbr];
    	   for (int i = 0; i < nbr; i++){
    		   set[i] = new Cashier();
    	   }
       }
    }

    // Instance methods
    public void add (Client client) {
    	int c = 0;
    	if (set.length < 1){
    		return;
    		}
    	for (int i = 0; set.length<i; i++) {
    		if (set[i].getQueueSize() < set[c].getQueueSize()) {
    			c = i;}}set[c].add(client);
   }

    public void servedClients( int currentTime ) {
    	for (int i = 0; i < set.length; i++) {
    		set[i].servedClients(currentTime);}
    }

    public String toString() {
        System.out.println("The total number of clients served is:"); 
        Cashier getClientsServed() ;  
        System.out.println("The average number of items per client was: ");
        Cashier getItemsDone();
        System.out.println("The average time (in seconds) was:");
        Cashier getClientTime();
    }

}