
package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import modelo.Produto;
import util.UperCaseName;


public class Main {


    public static void main(String[] args) {
       
       List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));  
        
        
        //Function<Produto,String> func = p -> p.getNome().toUpperCase();
        
       //List<String> nomes = lista.stream().map(new UperCaseName()).collect(Collectors.toList());
       //List<String> nomes = lista.stream().map(Produto::staticUperCaseName).collect(Collectors.toList());
       //List<String> nomes = lista.stream().map(Produto::naoStaticUperCaseName).collect(Collectors.toList());
       //List<String> nomes = lista.stream().map(func).collect(Collectors.toList());
       List<String> nomes = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
       
       nomes.forEach(System.out::println);
        
    }
    
}
