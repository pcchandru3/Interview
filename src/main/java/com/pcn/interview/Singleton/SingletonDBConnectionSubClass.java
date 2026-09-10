package com.pcn.interview.Singleton;

public class SingletonDBConnectionSubClass {
    
    // Private Instance
    // Initiates even the app didnt request it yet
    //private static SingletonDBConnectionSubClass instance;
    
    // Private COnstructor
    private SingletonDBConnectionSubClass() {}

    // Subclass
    private static class SingletonHelper {
        private static final SingletonDBConnectionSubClass instance = new SingletonDBConnectionSubClass();
    }

    // Public Static method
    public static SingletonDBConnectionSubClass getInstance() {
        return SingletonHelper.instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


