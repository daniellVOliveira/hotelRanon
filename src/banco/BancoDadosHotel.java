package banco;

import java.util.ArrayList;
import java.util.List;
import models.CheckIn;
import models.Funcionario;
import models.Cliente;
import models.Quartos;
import models.RelacaoQuartos;

public class BancoDadosHotel {
    
    private static List<Funcionario> tabelaFuncionario;
    private static List<Cliente> tabelaCliente;
    private static List<Quartos> tabelaQuartos;
    private static List<RelacaoQuartos> tabelaRelacaoQuartos;
    private static List<CheckIn> tabelaCheckIn;
    
    public static List<Funcionario> getTabelaFuncionario(){
        return tabelaFuncionario;
    }

    public static List<Cliente> getTabelaCliente(){
        return tabelaCliente;     
    }
    
    public static List<Quartos> getTabelaQuartos(){
        return tabelaQuartos;     
    }
    
    public static List<RelacaoQuartos> getTabelaRelacaoQuartos(){
        return tabelaRelacaoQuartos;     
    }
    
    public static List<CheckIn> getTabelaCheckIn() {
        return tabelaCheckIn;
    }
    
    public static void inicializarBanco(){
    tabelaFuncionario = new ArrayList<Funcionario>();
    tabelaCliente = new ArrayList<Cliente>();
    tabelaQuartos = new ArrayList<Quartos>();
    tabelaRelacaoQuartos = new ArrayList<RelacaoQuartos>(); 
    tabelaCheckIn = new ArrayList<CheckIn>();
    }



    
}
