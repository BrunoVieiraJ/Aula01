/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

/**
 *
 * @author User
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Pessoa_fisica pf = new Pessoa_fisica("João", 123456789, "joao@example.com", "Rua A", 100.0, "123.456.789-01");
     Pessoa_juridica pj = new Pessoa_juridica("Empresa XYZ", 987654321, "contato@empresa.com", "Av. B", 200.0, "12.345.678/0001-09");
        
     pf.calcular_desconto(10);
     pf.printar_tudo();
     
     pj.calcular_desconto(20);
     pj.printar_tudo();
     
     
     
    }
    
}
