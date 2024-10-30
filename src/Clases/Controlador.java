
package Clases;

import TXT.Txt;
import peleadesagas.*;


/**
 *
 * @author andre
 */
public class Controlador {
    
    
    public static void cargarSimulacion(){
        
        App app = App.getInstance();
        
        app.setT(new Txt());
        app.getT().leerTxt(app.getPath());
        
        app.setIA(new AI());
        
        Admin admin = new Admin( app.getIA(), app.getSemaforo(), app.getT().getOroStarWars(), app.getT().getPlataStarWars(), app.getT().getBronceStarWars(),
        app.getT().getOroStarTrek(), app.getT().getPlataStarTrek(), app.getT().getBronceStarTrek());
        
        app.setAdmin(admin);
        app.getAdmin().getAi().setAdmin(admin);
        app.getAdmin().arrancarSimulacion();
        
    }
    
    
}
