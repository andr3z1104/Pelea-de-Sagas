
package peleadesagas;

import Clases.*;
import TXT.Txt;
import java.util.concurrent.Semaphore;


/**
 *
 * @author andre
 */
public class App {
    
    private static App app;
    
    private static Admin admin;
    private static AI ia;
    
    private static Semaphore semaforo = new Semaphore(1);
    
    private static String path = "test//PruebaCombate.txt";
    private static Txt t;
       
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

    public  Admin getAdmin() {
        return admin;
    }

    public  void setAdmin(Admin admin) {
        App.admin = admin;
    }

    public  AI getIA() {
        return ia;
    }

    public  void setIA(AI ia) {
        App.ia = ia;
    }

    public  String getPath() {
        return path;
    }

    public  void setPath(String path) {
        App.path = path;
    }

    public  Txt getT() {
        return t;
    }

    public  void setT(Txt t) {
        App.t = t;
    }

    public static Semaphore getSemaforo() {
        return semaforo;
    }

    public static void setSemaforo(Semaphore semaforo) {
        App.semaforo = semaforo;
    }
    
    
    
    
    
    

}
