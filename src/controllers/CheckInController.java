
package controllers;

import banco.BancoDadosHotel;
import models.CheckIn;
import models.Cliente;
import models.Quartos;



public class CheckInController {
    
    public static void fazerNovoCheckIn (Quartos quartos, Cliente cliente){
    
        CheckIn ci = new CheckIn();
        
        ci.getCliente();
        ci.getQuarto();
        ci.getCalendar();
        
        BancoDadosHotel.getTabelaCheckIn().add(ci);

        
    }
}
