package oneDigitalInnovation.Facede;


import Subsistema1Crm.CrmService;
import Subsistema2cep.CepApi;

public class Facade {
    public void migrarClinte(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);


        CrmService.gravarCliente(nome,cep,cidade, estado);


    }

}
