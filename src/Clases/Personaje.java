
package Clases;

/**
 *
 * @author andre
 */
public class Personaje {
    
    private int ID; //ID unico del personaje
    private final String nombrePersonaje;
    private int Prioridad; 
    private int contador = 0;
    private int HP; //VIDA DEL PERSONAJE (Health Points)
    private int FP; // FUERZA DE ATAQUE DEL PERSONAJE (Fight Points)
    private int AP; // VELOCIDAD DEL PERSONAJE (Agility Points)
    private String Habilidad; // Habilidad del Personaje
    private final String foto;

    public Personaje(int ID, String nombrePersonaje, int HP, int FP, int AP, String Habilidad, String foto) {
        this.ID = ID;
        this.nombrePersonaje = nombrePersonaje;
        this.HP = HP;
        this.FP = FP;
        this.AP = AP;
        this.Habilidad = Habilidad;
        this.foto = foto;
    }
    
    //Aumenta en 1 el contador cada vez que se complete un round, Cuando llegue a 8, aumenta la prioridad del personaje.
    public void aumentarContador(){
        this.contador +=1;
    }
    
    public void recibirGolpe(int ataque){
        this.HP -= ataque;
        
        //Esto evita que su vida caiga a negativo
        if(this.HP < 0 ){
            this.HP =0;
        }
    }
    
    
    //Si el personaje posee la hablidad CURACION, usa esta funcion
    public void Curacion(int sanacion){
        int maxHP = 200;
        this.HP += sanacion;
        
        if(this.HP > maxHP){
            this.HP = maxHP;
        }
        
    }
    
    //Si el personaje posee la habilidad ATAQUE CRITICO, usa esta funcion
    public int  potenciarAtaque(){
          this.FP *= 1.5; 
          return FP;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getFP() {
        return FP;
    }

    public void setFP(int FP) {
        this.FP = FP;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
