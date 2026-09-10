package com.pcn.interview.Singleton;

public class SingletonDBConnectionLazy {

    // Private Instance
    private static SingletonDBConnectionLazy instance;
    
    // Private COnstructor
    private SingletonDBConnectionLazy() {}

    // Public Static method
    // At very beging of app launch, if 2 threads calls this at a time, there is a
    // chance that it will allow to create 2 instances
    public static SingletonDBConnectionLazy getInstance() {
        if(instance == null){ 
            instance = new SingletonDBConnectionLazy(); // create an db connection
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


