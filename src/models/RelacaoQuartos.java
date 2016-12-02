package models;

public class RelacaoQuartos {

    private Cliente cliente;
    private Quartos quartos;
    private CheckIn checkIn;
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quartos getQuartos() {
        return quartos;
    }

    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }  

    /**
     * @return the checkIn
     */
    public CheckIn getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    
}
