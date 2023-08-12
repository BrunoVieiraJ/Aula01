/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author User
 */
public class Pessoa {
    String nome;
    int telefone;
    String email;
    String endereco;
    double valor_desconto;

    public Pessoa(String nome, int telefone, String email, String endereco, double valor_desconto) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valor_desconto = valor_desconto;
    }
    
    public void calcular_desconto(double percentual_desconto){
        double valor_temp = (percentual_desconto/100) * valor_desconto;
        valor_desconto = valor_desconto - valor_temp; 
        System.out.println(valor_desconto);
    }
    
    
    public void printar_tudo() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor de Desconto: " + valor_desconto);
    }
    
}
