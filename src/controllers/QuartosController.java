package controllers;

import banco.BancoDadosHotel;
import models.Quartos;
import models.RelacaoQuartos;

public class QuartosController {
    
        public static void adicionarQuartos(int codigo, String status, String categoria){

        Quartos q = new Quartos();
        
        q.setCodigo(codigo);
        q.setStatus(status);
        q.setCategoria(categoria);

        BancoDadosHotel.getTabelaQuartos().add(q);
    }
    
        public static Quartos buscarQuartosPorCodigo(int codigo) {
           
            for(Quartos q : BancoDadosHotel.getTabelaQuartos()){
                if(q.getCodigo() == codigo){
                    return q;
                    
                }
            }
            return null;
        }
}
                