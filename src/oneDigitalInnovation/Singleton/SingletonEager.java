package oneDigitalInnovation.Singleton;

/**
 * Singleton "Apressado".
 *
 * @author guilhemrejuli
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }
    public static SingletonEager getInstance(){
        if(instancia == null){
            instancia = new SingletonEager();
        }
        return instancia;
    }

}