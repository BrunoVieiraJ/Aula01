/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author User
 */
public class Pessoa_juridica extends Pessoa {
    String cnpj;
    
    public Pessoa_juridica(String nome, int telefone, String email, String endereco, double valor_desconto, String cnpj) {
        super(nome, telefone, email, endereco, valor_desconto);
        this.cnpj = cnpj;
    }
    
    @Override
    public void calcular_desconto(double percentual_desconto){
        super.calcular_desconto(percentual_desconto);
    }
            
          
    @Override
    public void printar_tudo(){
        super.printar_tudo();
        System.out.println(cnpj);
    }
}
