package com.examply.kotlinlearn.singleton

/**
 *@author:wgsun
 *2021/4/26
 *desc: Kotlin下的5种单例模式
 */

//1，饿汉式

/** java实现
public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}*/

object Singleton {
}

//2、懒汉式
/**
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
    if(instance==null){
        instance=new Singleton1();
    }
    return instance;
    }
}*/
class Singleton1 private constructor() {
    companion object {
        private var instance: Singleton1? = null
        get() {
            if (field == null) {
                field = Singleton1()
            }
            return field
        }
        fun get(): Singleton1{
            //细心的小伙伴肯定发现了，这里不用getInstance作为为方法名，是因为在伴生对象声明时，内部已有getInstance方法，所以只能取其他名字
            return instance!!
        }
    }
}

//3、线程安全的懒汉式
/**
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){//使用同步锁
    if(instance==null){
        instance=new Singleton2();
    }
    return instance;
    }
}*/
class Singleton2 private constructor() {
    companion object {
        private var instance: Singleton2? = null
        get() {
            if (field == null) {
                field = Singleton2()
            }
            return field
        }
        @Synchronized
        fun get(): Singleton2 {
            return instance!!
        }
    }
}

//双重校验锁式（Double Check)
/**
public class Singleton3 {
    private volatile static Singleton3 instance;
    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
            if(instance==null){
                instance=new Singleton3();
            }
        }
    }
    return instance;
    }
} */
class Singleton4 private constructor() {
    companion object {
        //Kotlin的延迟属性 Lazy
        val instance : Singleton4 by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED){
            Singleton4()
        }
    }
}

//静态内部类式
/**
public class Singleton5 {
    private static class SingletonHolder{
         private static Singleton5 instance=new Singleton5();
    }
    private Singleton5(){
        System.out.println("Singleton has loaded");
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
} */
class Singleton5 private constructor() {
    companion object {
        val instance  = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = Singleton5()
    }

}



