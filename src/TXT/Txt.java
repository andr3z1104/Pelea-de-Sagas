package TXT;

import Clases.Personaje;
import EDD.Lista;
import EDD.NodoPersonaje;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andre
 */
public class Txt {
    
    private final Lista oroStarWars= new Lista();
    private final Lista plataStarWars = new Lista();
    private final Lista bronceStarWars = new Lista();

    private final Lista oroStarTrek = new Lista();
    private final Lista plataStarTrek = new Lista();
    private final Lista bronceStarTrek= new Lista();
    
    public void leerTxt(String file){
        String line;

        // Rellenar los arrays con las instancias de Character
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String currentShow = null;

            while ((line = br.readLine()) != null) {
                if (!(line.isEmpty())) {
                    if (line.startsWith("[")) {
                        currentShow = line.substring(1, line.length() - 1);

                    } else {
                        String[] parts = line.split(",");

                        Personaje personaje = new Personaje(
                                0,
                                parts[0],
                                Integer.parseInt(parts[1]),
                                Integer.parseInt(parts[2]),
                                Integer.parseInt(parts[3]),
                                parts[4],
                                parts[5].split(";")[0]
                        );
 
                        // Clasificar el personaje en la linkedList correspondiente
                        if (line.contains("oro.png") && "StarWars".equals(currentShow)) {
                            personaje.setPrioridad(1);
                            this.oroStarWars.insertFinale(personaje);
                        } else if (line.contains("plata.png") && "StarWars".equals(currentShow)) {
                            personaje.setPrioridad(2);
                            this.plataStarWars.insertFinale(personaje);
                        } else if (line.contains("bronce.png") && "StarWars".equals(currentShow)) {
                            personaje.setPrioridad(3);
                            this.bronceStarWars.insertFinale(personaje);
                        } else if (line.contains("oro.png") && "StarTrek".equals(currentShow)) {
                            personaje.setPrioridad(1);
                           this.oroStarTrek.insertFinale(personaje);
                        } else if (line.contains("plata.png") && "StarTrek".equals(currentShow)) {
                            personaje.setPrioridad(2);
                            this.plataStarTrek.insertFinale(personaje);
                        } else if (line.contains("bronce.png") && "StarTrek".equals(currentShow)) {
                            personaje.setPrioridad(3);
                            this.bronceStarTrek.insertFinale(personaje);
                        }
                    }
                }
            }
            
        NodoPersonaje pointer = this.oroStarWars.getHead();
        while(pointer != null){
            System.out.print(" [ " +  pointer.getElement().getFoto()+ " ] ");
            pointer = pointer.getNext();
        }
        
            System.out.println("plata");
                NodoPersonaje pointer2 = this.plataStarWars.getHead();
        while(pointer2 != null){
            System.out.print(" [ " +  pointer2.getElement().getFoto()+ " ] ");
            pointer2 = pointer2.getNext();
        }
        
                    System.out.println("bronce");
                NodoPersonaje pointer3 = this.bronceStarWars.getHead();
        while(pointer3 != null){
            System.out.print(" [ " +  pointer3.getElement().getFoto()+ " ] ");
            pointer3 = pointer3.getNext();
        }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Lista getOroStarWars() {
        return oroStarWars;
    }

    public Lista getPlataStarWars() {
        return plataStarWars;
    }

    public Lista getBronceStarWars() {
        return bronceStarWars;
    }

    public Lista getOroStarTrek() {
        return oroStarTrek;
    }

    public Lista getPlataStarTrek() {
        return plataStarTrek;
    }

    public Lista getBronceStarTrek() {
        return bronceStarTrek;
    }
    
    
    
    
    
    
    
    
    
    }
    

