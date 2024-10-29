
package Clases;
import EDD.*;
import peleadesagas.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import UI.UI_Controlador;

/**
 *
 * @author andre
 */
public class AI extends Thread {
    
    private Admin admin;
    
    private Personaje StarWars;
    private Personaje StarTrek;
    
    private int victoriasStarWars = 0;
    private int victoriasStarTrek = 0;
    
    private Semaphore semaforo;

    private long tiempo;
    private int turno;



    //TERMINAAAAAAAAAAR
    public AI() {
        this.admin = App.getApp().getAdmin();
        this.semaforo = App.getApp().getSemaforo();
        //this.tiempo = App.getApp().getDuracionBatalla();
        this.turno = 0;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                this.semaforo.acquire();

                this.turno += 1;

//                ControlMainUI.getHome().getWinnerLabelID().setText("");
                  UI_Controlador.getGolpe().getAI_Estado().setText("");
//                ControlMainUI.getHome().getIaStatusLabel().setText("Determinando el resultado del combate...");
                  UI_Controlador.getGolpe().getAI_Estado().setText("Calculando resultado...");
//                updateCardsUI(getStarWars(), getStarTrek());
//
//                ControlMainUI.getHome().getRoundLabel().setText("Round: " + String.valueOf(round));
                  UI_Controlador.getGolpe().getRound().setText("Round: "+String.valueOf(this.turno));

                Thread.sleep((long) (this.getTiempo() * 1000));

                double rand = Math.random();

                if (rand < 0.4) {
//                    ControlMainUI.getHome().getIaStatusLabel().setText("¡Hay un ganador!");
                    UI_Controlador.getGolpe().getAI_Estado().setText("Tenemos un ganador!");
                    Personaje ganador = getWinnerCharacter(this.StarWars, this.StarTrek);
//                    ControlMainUI.getHome().getWinnerLabelID().setText(winner.getCharacterId());
//                    audioManager.playSoundEffect("/GUI/Assets/victory.wav", 2.0f);
                    Thread.sleep((long) ((getTiempo() * 1000 * 0.3) * 0.6));

                } else if (rand >= 0.40 && rand < 0.67) {
//                    ControlMainUI.getHome().getIaStatusLabel().setText("¡El combate termina en empate!");
                      UI_Controlador.getGolpe().getAI_Estado().setText("Hay un empate!");
//                    audioManager.playSoundEffect("/GUI/Assets/tie.wav", 2.0f);
                    Thread.sleep((long) ((getTiempo() * 1000 * 0.3) * 0.6));
                    

//                    this.getAdministrator().getRegularShow().getQueue1().enqueue(this.StarWars);
                      this.getAdmin().getColasStarWars().getPrioridad_1().enqueue(this.StarWars);
//                    this.getAdministrator().getAvatar().getQueue1().enqueue(this.StarTrek);
                      this.getAdmin().getColasStarTrek().getPrioridad_1().enqueue(this.StarTrek);
                } else {
//                    ControlMainUI.getHome().getIaStatusLabel().setText("El combate no se llevará a cabo.");
                       UI_Controlador.getGolpe().getAI_Estado().setText("Error, no se puede ejecutar el combate");
//                    audioManager.playSoundEffect("/GUI/Assets/fail.wav", 2.0f);
                    Thread.sleep((long) ((getTiempo() * 1000 * 0.3) * 0.6));

                    //PROBAR NO SE SI FUNCIONA PROBAR
                    //no energy no time...
                    this.getAdmin().getColasStarWars().enqueueRefuerzos(this.StarWars);
                    this.getAdmin().getColasStarWars().enqueueRefuerzos(this.StarTrek);
                }

                clearFightersUI();

                Thread.sleep((long) ((getTiempo() * 1000 * 0.3) * 0.4));
                this.semaforo.release();
                Thread.sleep(100);

                //????????? no se q es
            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private Personaje getWinnerCharacter(Personaje StarWars, Personaje StarTrek) {
        long tiempoInicio = System.currentTimeMillis();
        long tiempoFinal = tiempoInicio + getTiempo() * 1000; // Convierte tiempo de combate a milisegundos
        boolean fin = false;

        // Determina quién ataca primero basado en la velocidad inicialmente
        boolean turnoStartWars = StarWars.getAP()>= StarTrek.getAP();

        while (System.currentTimeMillis() < tiempoFinal && !fin) {
            int golpe;
            if (turnoStartWars) {
                // Regular Show ataca
//                ControlMainUI.getHome().getStarWars().getStatusLabel().setText("Enviando daño");
                   UI_Controlador.getGolpe().getSW_Estado().setText("Atacando!");
//                ControlMainUI.getHome().getStarTrek().getStatusLabel().setText("Recibiendo daño");
                   UI_Controlador.getGolpe().getST_Estado().setText("Recibiendo daño");
                golpe = calcularAtaque(StarWars, StarTrek);
                StarTrek.recibirGolpe(golpe);
//                ControlMainUI.getHome().getStarTrek().getHPLabel().setText(String.valueOf(StarTrek.getFP()));
                   UI_Controlador.getGolpe().getST_HP().setText(String.valueOf(this.StarTrek.getHP()));
                if (StarTrek.getHP()<= 0) fin = true;
            } else {
                // Avatar ataca
//                ControlMainUI.getHome().getStarTrek().getStatusLabel().setText("Enviando daño");
                  UI_Controlador.getGolpe().getST_Estado().setText("Atacando!");
//                ControlMainUI.getHome().getStarWars().getStatusLabel().setText("Recibiendo daño");
                  UI_Controlador.getGolpe().getSW_Estado().setText("Recibiendo daño");
                golpe = calcularAtaque(StarTrek, StarWars);
                StarWars.recibirGolpe(golpe);
//                ControlMainUI.getHome().getStarWars().getHPLabel().setText(String.valueOf(StarWars.getHitPoints()));
                  UI_Controlador.getGolpe().getSW_HP().setText(String.valueOf(this.StarWars.getHP()));
                if (StarWars.getHP()<= 0) fin = true;
            }

            // Alterna el turno para el próximo ciclo
            turnoStartWars = !turnoStartWars;
//            ControlMainUI.getHome().getStarTrek().getHPLabel().setText(String.valueOf(StarTrek.getHitPoints()));
//            ControlMainUI.getHome().getStarWars().getHPLabel().setText(String.valueOf(StarWars.getHitPoints()));

            // Simula una pausa por ronda
            try {
                Thread.sleep(1000); // Ajusta según necesidad para permitir actualización de UI
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (fin) break; // Salir del bucle si el combate terminó.
        }
        
        if (!fin) {
            if (StarWars.getHP()> StarTrek.getHP()) {
                this.victoriasStarWars++;
//                ControlMainUI.getHome().getTvPanelUI1().getVictoriesLabel().setText(String.valueOf(this.victoriesRegularShow));
                  UI_Controlador.getGolpe().getSW_Victorias().setText(String.valueOf(this.victoriasStarWars));
                return StarWars;
            } else if (StarWars.getHP()< StarTrek.getHP()) {
                this.victoriasStarTrek++;
//                ControlMainUI.getHome().getTvPanelUI2().getVictoriesLabel().setText(String.valueOf(this.victoriesAvatar));
                  UI_Controlador.getGolpe().getST_Victorias().setText(String.valueOf(this.victoriasStarTrek));
                return StarTrek;
            } else {
                return null;
            }
        }

        // Determinar ganador basado en HP restante.
        if (StarWars.getHP() > 0) {
            this.victoriasStarWars++;
//            ControlMainUI.getHome().getTvPanelUI1().getVictoriesLabel().setText(String.valueOf(this.victoriesRegularShow));
              UI_Controlador.getGolpe().getSW_Victorias().setText(String.valueOf(this.victoriasStarWars));
            return StarWars;
        } else if (StarTrek.getHP() > 0) {
            this.victoriasStarTrek++;
//            ControlMainUI.getHome().getTvPanelUI2().getVictoriesLabel().setText(String.valueOf(this.victoriesAvatar));
              UI_Controlador.getGolpe().getST_Victorias().setText(String.valueOf(this.victoriasStarTrek));
            return StarTrek;
        } else {
            return null;
        }
    }
    
    
    // HAY QUE VER CUALES HABILIDADES HAY PA CALUCLAR EL DANIOOO
    private int calcularAtaque(Personaje golpeador, Personaje golpeado) {
         int ataque = golpeador.getFP();
         switch (golpeador.getHabilidad()) {
             case "curacion":
                 int healAmount = ataque / 2;
                 golpeador.curacion(healAmount);
                 break;
             case "ataque critico":
                 ataque *= 1.5;
                 break;
             default:
                 break;
         }
         switch (golpeado.getHabilidad()) {
             case "intimidar":
                 int danio = ataque / 2;
                 golpeado.curacion(danio);
                 break;
             case "tank":
                 ataque *= 0.75;
                 break;
             default:
                 break;
         }
         return ataque;
     } 
    
        public  void clearFightersUI() {
        //ControlMainUI.getHome().getIaStatusLabel().setText("Esperando nuevos personajes...");
        UI_Controlador.getGolpe().getAI_Estado().setText("Se aproxima un combate!");
        //ControlMainUI.getHome().getWinnerLabelID().setText("");
        //ControlMainUI.getHome().getRegularShowFighter().clearFightersLabels();
        UI_Controlador.getGolpe().getSW_ID().setText("Esperando");
        UI_Controlador.getGolpe().getSW_HP().setText("Esperando");
        UI_Controlador.getGolpe().getSW_Estado().setText("Esperando");
        UI_Controlador.getGolpe().quitarFotoPeleadores(UI_Controlador.getGolpe().getSW_Peleador(), "src/FotosArena/cargando.gif");
        //ControlMainUI.getHome().getAvatarFighter().clearFightersLabels();
        UI_Controlador.getGolpe().getST_ID().setText("Esperando");
        UI_Controlador.getGolpe().getST_HP().setText("Esperando");
        UI_Controlador.getGolpe().getST_Estado().setText("Esperando");
        UI_Controlador.getGolpe().quitarFotoPeleadores(UI_Controlador.getGolpe().getST_Peleador(), "src/FotosArena/cargando.gif");
        
    }
    
    
    
    
        public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Personaje getStarWars() {
        return StarWars;
    }

    public void setStarWars(Personaje StarWars) {
        this.StarWars = StarWars;
    }

    public Personaje getStarTrek() {
        return StarTrek;
    }

    public void setStarTrek(Personaje StarTrek) {
        this.StarTrek = StarTrek;
    }

    public int getVictoriasStarWars() {
        return victoriasStarWars;
    }

    public void setVictoriasStarWars(int victoriasStarWars) {
        this.victoriasStarWars = victoriasStarWars;
    }

    public int getVictoriasStarTrek() {
        return victoriasStarTrek;
    }

    public void setVictoriasStarTrek(int victoriasStarTrek) {
        this.victoriasStarTrek = victoriasStarTrek;
    }

    public Semaphore getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaphore semaforo) {
        this.semaforo = semaforo;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
}


// curacion, ataque critico, intimidar, tanque