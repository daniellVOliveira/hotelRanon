
package view;

import banco.BancoDadosHotel;
import java.util.Scanner;
import models.Cliente;
import models.Quartos;
import models.RelacaoQuartos;

public class RelacaoQuartosView {
    
    Scanner scan = new Scanner(System.in);

    public void exibirMainMenu() {
        System.out.println("Escolha o menu:");
        System.out.println("1 - Gerenciar Funcionários");
        System.out.println("2 - Gerenciar Quartos");
        System.out.println("3 - Gerenciar Clientes");
        System.out.println("4 - Check-in e Check-out");
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
                
}

            
