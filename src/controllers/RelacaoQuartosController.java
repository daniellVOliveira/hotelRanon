package controllers;

import banco.BancoDadosHotel;
import models.CheckIn;
import models.Cliente;
import models.Quartos;
import models.RelacaoQuartos;

public class RelacaoQuartosController {
    
        public static void adicionarRelacaoQuartosOcupados(Quartos quartos, Cliente cliente, CheckIn checkIn){

        RelacaoQuartos r = new RelacaoQuartos();
        
        r.setQuartos(quartos);
        r.setCliente(cliente);
        r.setCheckIn(checkIn);

        BancoDadosHotel.getTabelaRelacaoQuartos().add(r);
    }
    
        
        public static RelacaoQuartos buscarRelacaoPorCodigo(Quartos q) {
           
            for(RelacaoQuartos r : BancoDadosHotel.getTabelaRelacaoQuartos()){
                if(r.getQuartos().getCodigo() == q.getCodigo()){
                    return r;  
                }
            }
            return null;
        }

}