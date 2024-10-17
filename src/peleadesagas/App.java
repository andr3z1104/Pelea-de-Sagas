
package peleadesagas;

import Clases.*;


/**
 *
 * @author andre
 */
public class App {
    
    private static App app;
    private static Admin admin;
    private static AI ia;
    
    
    // Instancia de App, para que sea accesible para todas las clases
    public static synchronized App getInstance(){
        if(getApp() == null){
                setApp(new App());
        }
        return getApp();
    }

    public void iniciar(){
        Controlador.cargarSimulacion();
    }
    
    
    
    
    
    
    public static App getApp() {
        return app;
    }

    public static void setApp(App app) {
        App.app = app;
    }

    public static Admin getAdmin() {
        return admin;
    }

    public static void setAdmin(Admin admin) {
        App.admin = admin;
    }

    public static AI getIa() {
        return ia;
    }

    public static void setIa(AI ia) {
        App.ia = ia;
    }
    
    
    

}
