
package modelo;

import java.text.DecimalFormat;


public class Produto {
    
    
    private String nome;
    private Double preco;
    private static DecimalFormat deci = new DecimalFormat("0.00");
    
    

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    
    public Produto() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
    public static String staticUperCaseName(Produto p){
        
        
       return p.getNome().toUpperCase();
        
    }
    
    
    public String naoStaticUperCaseName(){
        
        
        return nome.toUpperCase();
        
    }
    

    @Override
    public String toString() {
        return "\nNome: " + nome + 
                "\nPreco: " + deci.format(preco);
    }
    
    
    
    
    
}
