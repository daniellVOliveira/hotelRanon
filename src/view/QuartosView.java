
package view;

import banco.BancoDadosHotel;
import controllers.QuartosController;
import controllers.RelacaoQuartosController;
import java.util.Scanner;
import models.Quartos;
import models.RelacaoQuartos;


public class QuartosView {
        Scanner scan = new Scanner(System.in);
    
        public void exibirQuartosMenu() {
        System.out.println("Escolha a opção:");
        System.out.println("1 - Listar Todos os Quartos");
        System.out.println("2 - Quartos Disponiveis");
        System.out.println("3 - Exibir Dados do Quarto");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        }
    }
    

        private void listarRelacaoQuartos() {
           
        for(Quartos q : BancoDadosHotel.getTabelaQuartos()){
            if(q.getStatus().equals("Ocupado")){
                
                for(RelacaoQuartos r : BancoDadosHotel.getTabelaRelacaoQuartos()){
                    if(q.getCodigo() == r.getQuartos().getCodigo()){
                
                        System.out.println("Quarto número: " + r.getQuartos().getCodigo()+".");
                        System.out.println("Tipo do quarto: " + r.getQuartos().getCategoria()+".");
                        System.out.println("Disponibilidade: " + r.getQuartos().getStatus()+".");
                        System.out.println("Código do cliente: " + r.getCliente().getCodigo()+".");
                        System.out.println("Nome do cliente: " + r.getCliente().getNome()+".");
                        System.out.println("---");
                
                        }  
                    
                    }
                    
                }
                else if(q.getStatus().equals("Livre")){
                    
                    System.out.println("Quarto número: " + q.getCodigo()+".");
                    System.out.println("Tipo do quarto: " + q.getCategoria()+".");
                    System.out.println("Disponibilidade: " + q.getStatus()+".");
                    System.out.println("---");
 
            }
    
        }
                
    }
        
        private void exibirPorCodigo() {
        System.out.print("Digite o codigo do quarto: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Quartos q = QuartosController.buscarQuartosPorCodigo(cod);
        
        if(q != null){
            if(q.getStatus().equals("Livre")){
                    
                    System.out.println("Quarto número: " + q.getCodigo()+".");
                    System.out.println("Tipo do quarto: " + q.getCategoria()+".");
                    System.out.println("Disponibilidade: " + q.getStatus()+".");
                    System.out.println("---");
 
            } else if(q.getStatus().equals("Ocupado")){
                
                RelacaoQuartos r = RelacaoQuartosController.buscarRelacaoPorCodigo(q);
                        
                System.out.println("Quarto número: " + r.getQuartos().getCodigo()+".");
                System.out.println("Tipo do quarto: " + r.getQuartos().getCategoria()+".");
                System.out.println("Disponibilidade: " + r.getQuartos().getStatus()+".");
                System.out.println("Código do cliente: " + r.getCliente().getCodigo()+".");
                System.out.println("Nome do cliente: " + r.getCliente().getNome()+".");
                System.out.println("---");
           
                }
        
        }
    }   
    
}
