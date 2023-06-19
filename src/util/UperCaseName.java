
package util;

import java.util.function.Function;
import modelo.Produto;


public class UperCaseName implements Function<Produto,String> {

    @Override
    public String apply(Produto p) {
        
       return p.getNome().toUpperCase();
        
    }
    
    
    
}
