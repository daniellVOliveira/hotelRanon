
package models;

import java.util.Calendar;

public class CheckIn {
    
    private Cliente cliente;
    private Quartos quarto;
    private Calendar calendar;
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quartos getQuarto() {
        return quarto;
    }

    public void setQuarto(Quartos quarto) {
        this.quarto = quarto;
    }

   
    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
   
}
