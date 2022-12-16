public class SingletonMain {
    public static void main(String[] args) {

    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    private Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}