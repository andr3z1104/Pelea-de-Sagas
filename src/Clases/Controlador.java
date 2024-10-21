
package Clases;

import peleadesagas.*;


/**
 *
 * @author andre
 */
public class Controlador {
    
    
    public static void cargarSimulacion(){
        
        App app = App.getInstance();
        
        app.setIA(new AI());
        
        Admin admin = new Admin();
        
        app.setAdmin(admin);
        
    }
    
    
}
