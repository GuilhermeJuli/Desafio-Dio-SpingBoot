package Subsistema2cep;

import java.time.Instant;

public class CepApi {
    private static CepApi intancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return intancia;
    }

    public String recuperarCidade(String cep){
        return "Centralina";
    }
    public String recuperarEstado(String cep){
        return "Mg";
    }



}
