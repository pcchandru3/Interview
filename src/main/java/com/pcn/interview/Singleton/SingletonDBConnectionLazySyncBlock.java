package com.pcn.interview.Singleton;

public class SingletonDBConnectionLazySyncBlock {
    
    // Private Instance
    // volatile keyword ensures changes are gloabl to instance 
    private static volatile SingletonDBConnectionLazySyncBlock instance;
    
    // Private COnstructor
    private SingletonDBConnectionLazySyncBlock() {}

    // Public Static method
    // Double-Checked Locking
    public static SingletonDBConnectionLazySyncBlock getInstance() {
        
        if(instance == null){
            synchronized (SingletonDBConnectionLazySyncBlock.class){
                if (instance == null){
                    instance = new SingletonDBConnectionLazySyncBlock();
                }
            }
        }

        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


