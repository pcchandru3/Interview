package com.pcn.interview.Singleton;

public class SingletonDBConnectionLazySyncMethod {
    
    // Private Instance
    // Initiates even the app didnt request it yet
    private static SingletonDBConnectionLazySyncMethod instance;
    
    // Private COnstructor
    private SingletonDBConnectionLazySyncMethod() {}

    // Public Static method
    public static synchronized SingletonDBConnectionLazySyncMethod getInstance() {
      
        if(instance == null){
            instance = new SingletonDBConnectionLazySyncMethod();
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


