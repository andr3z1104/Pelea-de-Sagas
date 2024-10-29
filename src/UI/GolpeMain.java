/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import EDD.NodoPersonaje;
import EDD.Queue;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author andre
 */
public class GolpeMain extends javax.swing.JFrame {
    
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;

    /**
     * Creates new form GolpeMain
     */
    public GolpeMain() {
        initComponents();
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.SW_Prioridad_2.setViewportView(panel2);
        this.SW_Prioridad_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.SW_Prioridad_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

     
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.SW_Prioridad_1.setViewportView(panel1);
        this.SW_Prioridad_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.SW_Prioridad_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.SW_Prioridad_3.setViewportView(panel3);
        this.SW_Prioridad_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.SW_Prioridad_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.SW_Reserva.setViewportView(panel4);
        this.SW_Reserva.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.SW_Reserva.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        
        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.ST_Prioridad_1.setViewportView(panel5);
        this.ST_Prioridad_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.ST_Prioridad_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel6 = new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.ST_Prioridad_2.setViewportView(panel6);
        this.ST_Prioridad_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.ST_Prioridad_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel7 = new JPanel();
        panel7.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.ST_Prioridad_3.setViewportView(panel7);
        this.ST_Prioridad_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.ST_Prioridad_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel8 = new JPanel();
        panel8.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.ST_Reserva.setViewportView(panel8);
        this.ST_Reserva.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        this.ST_Reserva.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Round = new javax.swing.JLabel();
        AI_Estado = new javax.swing.JLabel();
        Tiempo_Slider = new javax.swing.JSlider();
        VS_Label = new javax.swing.JLabel();
        SW_Peleador = new javax.swing.JLabel();
        SW_ID = new javax.swing.JLabel();
        SW_Estado = new javax.swing.JLabel();
        SW_HP = new javax.swing.JLabel();
        ST_ID = new javax.swing.JLabel();
        ST_Estado = new javax.swing.JLabel();
        ST_HP = new javax.swing.JLabel();
        ST_Peleador = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ST_ColaDePrioridad_4 = new javax.swing.JLabel();
        ST_ColaDePrioridad_3 = new javax.swing.JLabel();
        ST_ColaDePrioridad_2 = new javax.swing.JLabel();
        ST_ColaDePrioridad_1 = new javax.swing.JLabel();
        SW_ColaDePrioridad_4 = new javax.swing.JLabel();
        SW_ColaDePrioridad_3 = new javax.swing.JLabel();
        SW_ColaDePrioridad_2 = new javax.swing.JLabel();
        SW_ColaDePrioridad_1 = new javax.swing.JLabel();
        SW_Victorias = new javax.swing.JLabel();
        ST_Victorias = new javax.swing.JLabel();
        StarWarslTitulo = new javax.swing.JLabel();
        StraTrekTitulo = new javax.swing.JLabel();
        SW_Reserva = new javax.swing.JScrollPane();
        SW_Prioridad_3 = new javax.swing.JScrollPane();
        SW_Prioridad_2 = new javax.swing.JScrollPane();
        SW_Prioridad_1 = new javax.swing.JScrollPane();
        ST_Reserva = new javax.swing.JScrollPane();
        ST_Prioridad_3 = new javax.swing.JScrollPane();
        ST_Prioridad_2 = new javax.swing.JScrollPane();
        ST_Prioridad_1 = new javax.swing.JScrollPane();
        Fondo_StarWars = new javax.swing.JLabel();
        Fondo_StarWars1 = new javax.swing.JLabel();
        FondoArena = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Round.setBackground(new java.awt.Color(0, 0, 0));
        Round.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Round.setForeground(new java.awt.Color(255, 255, 255));
        Round.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Round.setText("Round: X");
        Round.setOpaque(true);
        getContentPane().add(Round, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 120, 40));

        AI_Estado.setBackground(new java.awt.Color(255, 204, 204));
        AI_Estado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AI_Estado.setForeground(new java.awt.Color(0, 0, 0));
        AI_Estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AI_Estado.setText("Recalculando:");
        AI_Estado.setOpaque(true);
        getContentPane().add(AI_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 210, 290));

        Tiempo_Slider.setMajorTickSpacing(1);
        Tiempo_Slider.setMaximum(19);
        Tiempo_Slider.setMinimum(1);
        Tiempo_Slider.setPaintLabels(true);
        Tiempo_Slider.setPaintTicks(true);
        Tiempo_Slider.setSnapToTicks(true);
        Tiempo_Slider.setToolTipText("");
        Tiempo_Slider.setValue(10);
        Tiempo_Slider.setOpaque(true);
        getContentPane().add(Tiempo_Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 310, 60));

        VS_Label.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        VS_Label.setForeground(new java.awt.Color(255, 0, 0));
        VS_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VS_Label.setText("VS");
        getContentPane().add(VS_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 70, 50));

        SW_Peleador.setText("jLabel1");
        SW_Peleador.setOpaque(true);
        getContentPane().add(SW_Peleador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 190, 130));

        SW_ID.setBackground(new java.awt.Color(0, 0, 0));
        SW_ID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SW_ID.setForeground(new java.awt.Color(255, 255, 255));
        SW_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_ID.setText("ID: X");
        SW_ID.setOpaque(true);
        getContentPane().add(SW_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 190, 30));

        SW_Estado.setBackground(new java.awt.Color(0, 0, 0));
        SW_Estado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SW_Estado.setForeground(new java.awt.Color(255, 255, 255));
        SW_Estado.setText("Estado: X");
        SW_Estado.setOpaque(true);
        getContentPane().add(SW_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, 40));

        SW_HP.setBackground(new java.awt.Color(0, 0, 0));
        SW_HP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SW_HP.setForeground(new java.awt.Color(255, 255, 255));
        SW_HP.setText("HP: X");
        SW_HP.setOpaque(true);
        getContentPane().add(SW_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, 40));

        ST_ID.setBackground(new java.awt.Color(0, 0, 0));
        ST_ID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ST_ID.setForeground(new java.awt.Color(255, 255, 255));
        ST_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_ID.setText("ID: X");
        ST_ID.setOpaque(true);
        getContentPane().add(ST_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 190, 30));

        ST_Estado.setBackground(new java.awt.Color(0, 0, 0));
        ST_Estado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ST_Estado.setForeground(new java.awt.Color(255, 255, 255));
        ST_Estado.setText("Estado: X");
        ST_Estado.setOpaque(true);
        getContentPane().add(ST_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 150, 40));

        ST_HP.setBackground(new java.awt.Color(0, 0, 0));
        ST_HP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ST_HP.setForeground(new java.awt.Color(255, 255, 255));
        ST_HP.setText("HP: X");
        ST_HP.setOpaque(true);
        getContentPane().add(ST_HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 150, 40));

        ST_Peleador.setText("jLabel1");
        ST_Peleador.setOpaque(true);
        getContentPane().add(ST_Peleador, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 190, 130));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1180, 20));

        ST_ColaDePrioridad_4.setBackground(new java.awt.Color(0, 0, 0));
        ST_ColaDePrioridad_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ST_ColaDePrioridad_4.setForeground(new java.awt.Color(255, 255, 255));
        ST_ColaDePrioridad_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_ColaDePrioridad_4.setText("Refuerzos");
        ST_ColaDePrioridad_4.setOpaque(true);
        getContentPane().add(ST_ColaDePrioridad_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 200, 20));

        ST_ColaDePrioridad_3.setBackground(new java.awt.Color(0, 0, 0));
        ST_ColaDePrioridad_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ST_ColaDePrioridad_3.setForeground(new java.awt.Color(255, 255, 255));
        ST_ColaDePrioridad_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_ColaDePrioridad_3.setText("Cola de Prioridad N°3");
        ST_ColaDePrioridad_3.setOpaque(true);
        getContentPane().add(ST_ColaDePrioridad_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 200, 20));

        ST_ColaDePrioridad_2.setBackground(new java.awt.Color(0, 0, 0));
        ST_ColaDePrioridad_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ST_ColaDePrioridad_2.setForeground(new java.awt.Color(255, 255, 255));
        ST_ColaDePrioridad_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_ColaDePrioridad_2.setText("Cola de Prioridad N°2");
        ST_ColaDePrioridad_2.setOpaque(true);
        getContentPane().add(ST_ColaDePrioridad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 200, 20));

        ST_ColaDePrioridad_1.setBackground(new java.awt.Color(0, 0, 0));
        ST_ColaDePrioridad_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ST_ColaDePrioridad_1.setForeground(new java.awt.Color(255, 255, 255));
        ST_ColaDePrioridad_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_ColaDePrioridad_1.setText("Cola de Prioridad N°1");
        ST_ColaDePrioridad_1.setOpaque(true);
        getContentPane().add(ST_ColaDePrioridad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 200, 20));

        SW_ColaDePrioridad_4.setBackground(new java.awt.Color(0, 0, 0));
        SW_ColaDePrioridad_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SW_ColaDePrioridad_4.setForeground(new java.awt.Color(255, 255, 255));
        SW_ColaDePrioridad_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_ColaDePrioridad_4.setText("Refuerzos");
        SW_ColaDePrioridad_4.setOpaque(true);
        getContentPane().add(SW_ColaDePrioridad_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 200, 20));

        SW_ColaDePrioridad_3.setBackground(new java.awt.Color(0, 0, 0));
        SW_ColaDePrioridad_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SW_ColaDePrioridad_3.setForeground(new java.awt.Color(255, 255, 255));
        SW_ColaDePrioridad_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_ColaDePrioridad_3.setText("Cola de Prioridad N°3");
        SW_ColaDePrioridad_3.setOpaque(true);
        getContentPane().add(SW_ColaDePrioridad_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 200, 20));

        SW_ColaDePrioridad_2.setBackground(new java.awt.Color(0, 0, 0));
        SW_ColaDePrioridad_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SW_ColaDePrioridad_2.setForeground(new java.awt.Color(255, 255, 255));
        SW_ColaDePrioridad_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_ColaDePrioridad_2.setText("Cola de Prioridad N°2");
        SW_ColaDePrioridad_2.setOpaque(true);
        getContentPane().add(SW_ColaDePrioridad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 20));

        SW_ColaDePrioridad_1.setBackground(new java.awt.Color(0, 0, 0));
        SW_ColaDePrioridad_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SW_ColaDePrioridad_1.setForeground(new java.awt.Color(255, 255, 255));
        SW_ColaDePrioridad_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_ColaDePrioridad_1.setText("Cola de Prioridad N°1");
        SW_ColaDePrioridad_1.setOpaque(true);
        getContentPane().add(SW_ColaDePrioridad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, -1));

        SW_Victorias.setBackground(new java.awt.Color(0, 0, 0));
        SW_Victorias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SW_Victorias.setForeground(new java.awt.Color(255, 232, 31));
        SW_Victorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SW_Victorias.setText("Victorias: X");
        SW_Victorias.setOpaque(true);
        getContentPane().add(SW_Victorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 150, 40));

        ST_Victorias.setBackground(new java.awt.Color(0, 0, 0));
        ST_Victorias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ST_Victorias.setForeground(new java.awt.Color(0, 153, 255));
        ST_Victorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ST_Victorias.setText("Victorias: X");
        ST_Victorias.setOpaque(true);
        getContentPane().add(ST_Victorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 150, 40));

        StarWarslTitulo.setBackground(new java.awt.Color(0, 0, 0));
        StarWarslTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        StarWarslTitulo.setForeground(new java.awt.Color(255, 232, 31));
        StarWarslTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StarWarslTitulo.setText("Star Wars");
        StarWarslTitulo.setOpaque(true);
        getContentPane().add(StarWarslTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 60));

        StraTrekTitulo.setBackground(new java.awt.Color(0, 0, 0));
        StraTrekTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        StraTrekTitulo.setForeground(new java.awt.Color(51, 102, 255));
        StraTrekTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StraTrekTitulo.setText("Star Trek");
        StraTrekTitulo.setOpaque(true);
        getContentPane().add(StraTrekTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 220, 60));
        getContentPane().add(SW_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 360, 100));
        getContentPane().add(SW_Prioridad_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 360, 100));
        getContentPane().add(SW_Prioridad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 360, 100));

        SW_Prioridad_1.setBackground(new java.awt.Color(0, 0, 0));
        SW_Prioridad_1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(SW_Prioridad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 360, 100));
        getContentPane().add(ST_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 360, 100));
        getContentPane().add(ST_Prioridad_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 360, 100));
        getContentPane().add(ST_Prioridad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 360, 100));
        getContentPane().add(ST_Prioridad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 360, 100));

        Fondo_StarWars.setBackground(new java.awt.Color(204, 255, 204));
        Fondo_StarWars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosStarTrek/FondoStarTrek (2).jpg"))); // NOI18N
        Fondo_StarWars.setToolTipText("");
        Fondo_StarWars.setOpaque(true);
        getContentPane().add(Fondo_StarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 590, 560));

        Fondo_StarWars1.setBackground(new java.awt.Color(204, 204, 255));
        Fondo_StarWars1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosStarWars/FondoStarWars (1).png"))); // NOI18N
        Fondo_StarWars1.setToolTipText("");
        Fondo_StarWars1.setOpaque(true);
        getContentPane().add(Fondo_StarWars1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 590, 560));

        FondoArena.setBackground(new java.awt.Color(153, 153, 153));
        FondoArena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosArena/FondoArena.jpeg"))); // NOI18N
        FondoArena.setToolTipText("");
        FondoArena.setOpaque(true);
        getContentPane().add(FondoArena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 770));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarColasUI_StarWars(Queue cola1, Queue cola2, Queue cola3){
        actualizarColaUI_StarWars_Prioridad_1(cola1);
        actualizarColaUI_StarWars_Prioridad_2(cola2);
        actualizarColaUI_StarWars_Prioridad_3(cola3);
    }
    
    public void iniciarColasUI_StarTrek(Queue cola1, Queue cola2, Queue cola3){
        actualizarColaUI_StarTrek_Prioridad_1(cola1);
        actualizarColaUI_StarTrek_Prioridad_2(cola2);
        actualizarColaUI_StarTrek_Prioridad_3(cola3);
    }
    
    
    
    
    public void actualizarColasUI_StarWars(Queue cola1, Queue cola2, Queue cola3, Queue cola4){
        actualizarColaUI_StarWars_Prioridad_1(cola1);
        actualizarColaUI_StarWars_Prioridad_2(cola2);
        actualizarColaUI_StarWars_Prioridad_3(cola3);
        actualizarColaUI_StarWars_Refuerzo(cola4);
    }
    
    public void actualizarColasUI_StarTrek(Queue cola1, Queue cola2, Queue cola3, Queue cola4){
        actualizarColaUI_StarTrek_Prioridad_1(cola1);
        actualizarColaUI_StarTrek_Prioridad_2(cola2);
        actualizarColaUI_StarTrek_Prioridad_3(cola3);
        actualizarColaUI_StarTrek_Refuerzo(cola4);
    }
    
        public void quitarFotoPeleadores(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
       // Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight()));
        labelName.setIcon(image);
        this.repaint();
    }
    
    
 
        public void actualizarColaUI_StarWars_Prioridad_1(Queue cola){
            
            this.panel1.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta2 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel1.add(etiqueta2);
                pointer = pointer.getNext();
            }

          //  this.SW_Prioridad_1.add(panel2);

            this.SW_Prioridad_1.revalidate();
            this.SW_Prioridad_1.repaint();
    }
        
        
           
    public void actualizarColaUI_StarWars_Prioridad_2(Queue cola){
        
        this.panel2.removeAll();
        NodoPersonaje pointer = cola.getHead();
        for (int i = 0; i < cola.getLength(); i++) {
            JLabel etiqueta = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
            panel2.add(etiqueta);
            pointer = pointer.getNext();
        }
        
        //this.SW_Prioridad_2.add(panel);
        
        this.SW_Prioridad_2.revalidate();
        this.SW_Prioridad_2.repaint();
    }
    
        
        
        public void actualizarColaUI_StarWars_Prioridad_3(Queue cola){
            
            this.panel3.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta3 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel3.add(etiqueta3);
                pointer = pointer.getNext();
            }

           // this.SW_Prioridad_3.add(panel3);

            this.SW_Prioridad_3.revalidate();
            this.SW_Prioridad_3.repaint();
    }
        
        public void actualizarColaUI_StarWars_Refuerzo(Queue cola){
            
            this.panel4.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta4 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel4.add(etiqueta4);
                pointer = pointer.getNext();
            }

           // this.SW_Prioridad_3.add(panel3);

            this.SW_Reserva.revalidate();
            this.SW_Reserva.repaint();
    }
        
        public void actualizarColaUI_StarTrek_Prioridad_1(Queue cola){
            
            this.panel5.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta5 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel5.add(etiqueta5);
                pointer = pointer.getNext();
            }

          //  this.SW_Prioridad_1.add(panel2);

            this.ST_Prioridad_1.revalidate();
            this.ST_Prioridad_1.repaint();
    }
        
        
           
    public void actualizarColaUI_StarTrek_Prioridad_2(Queue cola){
        
        this.panel6.removeAll();
        NodoPersonaje pointer = cola.getHead();
        for (int i = 0; i < cola.getLength(); i++) {
            JLabel etiqueta6 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
            panel6.add(etiqueta6);
            pointer = pointer.getNext();
        }
        
        //this.SW_Prioridad_2.add(panel);
        
        this.ST_Prioridad_2.revalidate();
        this.ST_Prioridad_2.repaint();
    }
    
        
        
        public void actualizarColaUI_StarTrek_Prioridad_3(Queue cola){
            
            this.panel7.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta7 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel7.add(etiqueta7);
                pointer = pointer.getNext();
            }

           // this.SW_Prioridad_3.add(panel3);

            this.ST_Prioridad_3.revalidate();
            this.ST_Prioridad_3.repaint();
    }
        
               public void actualizarColaUI_StarTrek_Refuerzo(Queue cola){
            
            this.panel8.removeAll();
            NodoPersonaje pointer = cola.getHead();
            for (int i = 0; i < cola.getLength(); i++) {
                JLabel etiqueta8 = new JLabel("Pelador:"+pointer.getElement().getHP()+i);
                panel8.add(etiqueta8);
                pointer = pointer.getNext();
            }

           // this.SW_Prioridad_3.add(panel3);

            this.ST_Reserva.revalidate();
            this.ST_Reserva.repaint();
    }
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GolpeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GolpeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GolpeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GolpeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GolpeMain().setVisible(true);
            }
        });
    }

    public JLabel getAI_Estado() {
        return AI_Estado;
    }

    public void setAI_Estado(JLabel AI_Estado) {
        this.AI_Estado = AI_Estado;
    }

    public JLabel getFondoArena() {
        return FondoArena;
    }

    public void setFondoArena(JLabel FondoArena) {
        this.FondoArena = FondoArena;
    }

    public JLabel getFondo_StarWars() {
        return Fondo_StarWars;
    }

    public void setFondo_StarWars(JLabel Fondo_StarWars) {
        this.Fondo_StarWars = Fondo_StarWars;
    }

    public JLabel getFondo_StarWars1() {
        return Fondo_StarWars1;
    }

    public void setFondo_StarWars1(JLabel Fondo_StarWars1) {
        this.Fondo_StarWars1 = Fondo_StarWars1;
    }

    public JLabel getRound() {
        return Round;
    }

    public void setRound(JLabel Round) {
        this.Round = Round;
    }

    public JLabel getST_ColaDePrioridad_1() {
        return ST_ColaDePrioridad_1;
    }

    public void setST_ColaDePrioridad_1(JLabel ST_ColaDePrioridad_1) {
        this.ST_ColaDePrioridad_1 = ST_ColaDePrioridad_1;
    }

    public JLabel getST_ColaDePrioridad_2() {
        return ST_ColaDePrioridad_2;
    }

    public void setST_ColaDePrioridad_2(JLabel ST_ColaDePrioridad_2) {
        this.ST_ColaDePrioridad_2 = ST_ColaDePrioridad_2;
    }

    public JLabel getST_ColaDePrioridad_3() {
        return ST_ColaDePrioridad_3;
    }

    public void setST_ColaDePrioridad_3(JLabel ST_ColaDePrioridad_3) {
        this.ST_ColaDePrioridad_3 = ST_ColaDePrioridad_3;
    }

    public JLabel getST_ColaDePrioridad_4() {
        return ST_ColaDePrioridad_4;
    }

    public void setST_ColaDePrioridad_4(JLabel ST_ColaDePrioridad_4) {
        this.ST_ColaDePrioridad_4 = ST_ColaDePrioridad_4;
    }

    public JLabel getST_Estado() {
        return ST_Estado;
    }

    public void setST_Estado(JLabel ST_Estado) {
        this.ST_Estado = ST_Estado;
    }

    public JLabel getST_HP() {
        return ST_HP;
    }

    public void setST_HP(JLabel ST_HP) {
        this.ST_HP = ST_HP;
    }

    public JLabel getST_ID() {
        return ST_ID;
    }

    public void setST_ID(JLabel ST_ID) {
        this.ST_ID = ST_ID;
    }

    public JLabel getST_Peleador() {
        return ST_Peleador;
    }

    public void setST_Peleador(JLabel ST_Peleador) {
        this.ST_Peleador = ST_Peleador;
    }

    public JScrollPane getST_Prioridad_1() {
        return ST_Prioridad_1;
    }

    public void setST_Prioridad_1(JScrollPane ST_Prioridad_1) {
        this.ST_Prioridad_1 = ST_Prioridad_1;
    }

    public JScrollPane getST_Prioridad_2() {
        return ST_Prioridad_2;
    }

    public void setST_Prioridad_2(JScrollPane ST_Prioridad_2) {
        this.ST_Prioridad_2 = ST_Prioridad_2;
    }

    public JScrollPane getST_Prioridad_3() {
        return ST_Prioridad_3;
    }

    public void setST_Prioridad_3(JScrollPane ST_Prioridad_3) {
        this.ST_Prioridad_3 = ST_Prioridad_3;
    }

    public JScrollPane getST_Reserva() {
        return ST_Reserva;
    }

    public void setST_Reserva(JScrollPane ST_Reserva) {
        this.ST_Reserva = ST_Reserva;
    }

    public JLabel getST_Victorias() {
        return ST_Victorias;
    }

    public void setST_Victorias(JLabel ST_Victorias) {
        this.ST_Victorias = ST_Victorias;
    }

    public JLabel getSW_ColaDePrioridad_1() {
        return SW_ColaDePrioridad_1;
    }

    public void setSW_ColaDePrioridad_1(JLabel SW_ColaDePrioridad_1) {
        this.SW_ColaDePrioridad_1 = SW_ColaDePrioridad_1;
    }

    public JLabel getSW_ColaDePrioridad_2() {
        return SW_ColaDePrioridad_2;
    }

    public void setSW_ColaDePrioridad_2(JLabel SW_ColaDePrioridad_2) {
        this.SW_ColaDePrioridad_2 = SW_ColaDePrioridad_2;
    }

    public JLabel getSW_ColaDePrioridad_3() {
        return SW_ColaDePrioridad_3;
    }

    public void setSW_ColaDePrioridad_3(JLabel SW_ColaDePrioridad_3) {
        this.SW_ColaDePrioridad_3 = SW_ColaDePrioridad_3;
    }

    public JLabel getSW_ColaDePrioridad_4() {
        return SW_ColaDePrioridad_4;
    }

    public void setSW_ColaDePrioridad_4(JLabel SW_ColaDePrioridad_4) {
        this.SW_ColaDePrioridad_4 = SW_ColaDePrioridad_4;
    }

    public JLabel getSW_Estado() {
        return SW_Estado;
    }

    public void setSW_Estado(JLabel SW_Estado) {
        this.SW_Estado = SW_Estado;
    }

    public JLabel getSW_HP() {
        return SW_HP;
    }

    public void setSW_HP(JLabel SW_HP) {
        this.SW_HP = SW_HP;
    }

    public JLabel getSW_ID() {
        return SW_ID;
    }

    public void setSW_ID(JLabel SW_ID) {
        this.SW_ID = SW_ID;
    }

    public JLabel getSW_Peleador() {
        return SW_Peleador;
    }

    public void setSW_Peleador(JLabel SW_Peleador) {
        this.SW_Peleador = SW_Peleador;
    }

    public JScrollPane getSW_Prioridad_1() {
        return SW_Prioridad_1;
    }

    public void setSW_Prioridad_1(JScrollPane SW_Prioridad_1) {
        this.SW_Prioridad_1 = SW_Prioridad_1;
    }

    public JScrollPane getSW_Prioridad_2() {
        return SW_Prioridad_2;
    }

    public void setSW_Prioridad_2(JScrollPane SW_Prioridad_2) {
        this.SW_Prioridad_2 = SW_Prioridad_2;
    }

    public JScrollPane getSW_Prioridad_3() {
        return SW_Prioridad_3;
    }

    public void setSW_Prioridad_3(JScrollPane SW_Prioridad_3) {
        this.SW_Prioridad_3 = SW_Prioridad_3;
    }

    public JScrollPane getSW_Reserva() {
        return SW_Reserva;
    }

    public void setSW_Reserva(JScrollPane SW_Reserva) {
        this.SW_Reserva = SW_Reserva;
    }

    public JLabel getSW_Victorias() {
        return SW_Victorias;
    }

    public void setSW_Victorias(JLabel SW_Victorias) {
        this.SW_Victorias = SW_Victorias;
    }

    public JLabel getStarWarslTitulo() {
        return StarWarslTitulo;
    }

    public void setStarWarslTitulo(JLabel StarWarslTitulo) {
        this.StarWarslTitulo = StarWarslTitulo;
    }

    public JLabel getStraTrekTitulo() {
        return StraTrekTitulo;
    }

    public void setStraTrekTitulo(JLabel StraTrekTitulo) {
        this.StraTrekTitulo = StraTrekTitulo;
    }

    public JSlider getTiempo_Slider() {
        return Tiempo_Slider;
    }

    public void setTiempo_Slider(JSlider Tiempo_Slider) {
        this.Tiempo_Slider = Tiempo_Slider;
    }

    public JLabel getVS_Label() {
        return VS_Label;
    }

    public void setVS_Label(JLabel VS_Label) {
        this.VS_Label = VS_Label;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AI_Estado;
    private javax.swing.JLabel FondoArena;
    private javax.swing.JLabel Fondo_StarWars;
    private javax.swing.JLabel Fondo_StarWars1;
    private javax.swing.JLabel Round;
    private javax.swing.JLabel ST_ColaDePrioridad_1;
    private javax.swing.JLabel ST_ColaDePrioridad_2;
    private javax.swing.JLabel ST_ColaDePrioridad_3;
    private javax.swing.JLabel ST_ColaDePrioridad_4;
    private javax.swing.JLabel ST_Estado;
    private javax.swing.JLabel ST_HP;
    private javax.swing.JLabel ST_ID;
    private javax.swing.JLabel ST_Peleador;
    private javax.swing.JScrollPane ST_Prioridad_1;
    private javax.swing.JScrollPane ST_Prioridad_2;
    private javax.swing.JScrollPane ST_Prioridad_3;
    private javax.swing.JScrollPane ST_Reserva;
    private javax.swing.JLabel ST_Victorias;
    private javax.swing.JLabel SW_ColaDePrioridad_1;
    private javax.swing.JLabel SW_ColaDePrioridad_2;
    private javax.swing.JLabel SW_ColaDePrioridad_3;
    private javax.swing.JLabel SW_ColaDePrioridad_4;
    private javax.swing.JLabel SW_Estado;
    private javax.swing.JLabel SW_HP;
    private javax.swing.JLabel SW_ID;
    private javax.swing.JLabel SW_Peleador;
    private javax.swing.JScrollPane SW_Prioridad_1;
    private javax.swing.JScrollPane SW_Prioridad_2;
    private javax.swing.JScrollPane SW_Prioridad_3;
    private javax.swing.JScrollPane SW_Reserva;
    private javax.swing.JLabel SW_Victorias;
    private javax.swing.JLabel StarWarslTitulo;
    private javax.swing.JLabel StraTrekTitulo;
    private javax.swing.JSlider Tiempo_Slider;
    private javax.swing.JLabel VS_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
