package TXT;

import Clases.Personaje;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andre
 */
public class Txt {
    
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
                                parts[5].split(";")[0]
                        );
 
                        // Clasificar el personaje en la linkedList correspondiente
                        if (line.contains("yellow.png") && "Regular Show".equals(currentShow)) {
                            personaje.setPrioridad(1);
                           // this.getYellowRegularShow().addEnd(character);
                        } else if (line.contains("green.png") && "Regular Show".equals(currentShow)) {
                            personaje.setPrioridad(2);
                            //this.getGreenRegularShow().addEnd(character);
                        } else if (line.contains("red.png") && "Regular Show".equals(currentShow)) {
                            personaje.setPrioridad(3);
                            //this.getRedRegularShow().addEnd(character);
                        } else if (line.contains("yellow.png") && "Avatar".equals(currentShow)) {
                            personaje.setPrioridad(1);
                            //this.getYellowAvatar().addEnd(character);
                        } else if (line.contains("green.png") && "Avatar".equals(currentShow)) {
                            personaje.setPrioridad(2);
                            //this.getGreenAvatar().addEnd(character);
                        } else if (line.contains("red.png") && "Avatar".equals(currentShow)) {
                            personaje.setPrioridad(3);
                            //this.getRedAvatar().addEnd(character);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    

