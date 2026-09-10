package com.pcn.interview.Singleton;

public class SingletonDBConnectionEagerBasic {
    
    // Private Instance
    // Initiates even the app didnt request it yet
    private static SingletonDBConnectionEagerBasic instance = new SingletonDBConnectionEagerBasic();
    
    // Private COnstructor
    private SingletonDBConnectionEagerBasic() {}

    // Public Static method
    public static SingletonDBConnectionEagerBasic getInstance() {
      
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


