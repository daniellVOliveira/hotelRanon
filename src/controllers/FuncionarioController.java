package controllers;

import banco.BancoDadosHotel;
import models.Funcionario;

public class FuncionarioController {
    
        public static void adicionarFuncionario(int codigo, String nome, String cpf, String usuario, String senha){

        Funcionario f = new Funcionario();
        
        f.setCodigo(codigo);
        f.setNome(nome);
        f.setCpf(cpf);
        f.setUsuario(usuario);
        f.setSenha(senha);
        
        BancoDadosHotel.getTabelaFuncionario().add(f);
    }
    
    public static Funcionario fazerLogin(String usuario, String senha){
        
        for(Funcionario f : BancoDadosHotel.getTabelaFuncionario()){
            if(f.getUsuario().equals(usuario) && f.getSenha().equals(senha)){
                return f;
            }
        }
        
        return null;
    }
    
}
