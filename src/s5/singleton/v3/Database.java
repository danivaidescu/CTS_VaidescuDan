package s5.singleton.v3;


// Lazy Initialization - THREAD SAFE
public class Database {
	
	private static Database INSTANCE;
	
	private Database() {
		// Facem ceva		
	}
	
	public static Database getInstance() {
		
		if(INSTANCE == null) {		
			synchronized (Database.class) {  // sincronizare la nivelul clasei
				if(INSTANCE == null) {
					INSTANCE = new Database();
					return INSTANCE;
				}
			}	
		}
		
		return INSTANCE;
	}
}

