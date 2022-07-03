package oneDigitalInnovation;

import oneDigitalInnovation.Facede.Facade;
import oneDigitalInnovation.Singleton.SingletonEager;
import oneDigitalInnovation.Singleton.SingletonLazy;
import oneDigitalInnovation.Singleton.SingletonLazyHolder;
import oneDigitalInnovation.Strategy.*;

public class Teste {
    public static void main(String[] args){

        //singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agresivo = new ComportamentoAgreciso();
        Comportamento defensivo = new ComportamentoDefencivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agresivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarClinte("Guilherme","38408-224");


    }
}
