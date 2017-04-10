/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroAbarca_ProyectoUno;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.awt.resources.awt;

/**
 *
 * @author Pedro
 */
public class Cuadrante extends javax.swing.JFrame {

    private Timer timerSemaforo;
    private int tiempo;
    boolean iniciado = false;
    int cont = 0;
    Color rojoOpaco;
    Color verdeOpaco;
    Color amarilloOpaco;

    LinkedList<Auto> viaSem1;
    LinkedList<Auto> viaSem2;
    LinkedList<Auto> viaSem3;
    LinkedList<Auto> viaSem4;

    LinkedList<Semaforo> semaforos;
    private int AnchoLuces = 15;
    List<Integer> orden = new ArrayList<>();

    public Cuadrante() {

        initComponents();

        tiempo = 5;
        rojoOpaco = new Color(102, 0, 0);
        verdeOpaco = new Color(0, 51, 0);
        amarilloOpaco = new Color(153, 153, 0);
        semaforos = new LinkedList<>();
        //carga semaforos
        semaforos.add(new Semaforo(340, 400, true, "apagado"));
        semaforos.add(new Semaforo(425, 340, true, "apagado"));
        semaforos.add(new Semaforo(340, 340, false, "apagado"));
        semaforos.add(new Semaforo(400, 430, false, "apagado"));
        //carga vias
        viaSem1 = new LinkedList<>();
        viaSem2 = new LinkedList<>();
        viaSem3 = new LinkedList<>();
        viaSem4 = new LinkedList<>();
        moverCarros();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        bttEjecutar.setForeground(new java.awt.Color(255, 51, 51));
        bttEjecutar.setText("Ejecutar ");
        bttEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEjecutarActionPerformed(evt);
            }
        });

        jButton1.setText("Carro ++");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Carro ++");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Carro ++");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carro ++");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("Programar Semaforo");

        jMenuItem2.setText("Orden de Semaforos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Tiempo de Cambio de Luces");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(343, 343, 343))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(bttEjecutar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttEjecutar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(277, 277, 277)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEjecutarActionPerformed
        iniciado = true;
        cambiarLuzSem();

    }//GEN-LAST:event_bttEjecutarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {

            int x = Integer.parseInt(JOptionPane.showInputDialog("Tiempo de cambio de Luces en Segundos?"));
            tiempo = x;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No es un numero");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int sm1;
        try {
            do {
                sm1 = Integer.parseInt(JOptionPane.showInputDialog(this, "Primer Semaforo?\nDigite:\n1 para que sea el Oeste\n2 el Este\n3 el Norte\n4 el Sur"));

            } while (sm1 > 4 || sm1 < 1);
            orden.add(sm1 - 1);

            int sm2;
            do {
                sm2 = Integer.parseInt(JOptionPane.showInputDialog(this, "Segundo Semaforo? 1, 2, 3, 4"));
            } while (orden.contains(sm2 - 1) || sm2 > 4 || sm2 < 1);
            orden.add(sm2 - 1);

            int sm3;
            do {
                sm3 = Integer.parseInt(JOptionPane.showInputDialog(this, "Tercero Semaforo? 1, 2, 3, 4"));
            } while (orden.contains(sm3 - 1) || sm3 > 4 || sm3 < 1);
            orden.add(sm3 - 1);

            int sm4;
            do {
                sm4 = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuarto Semaforo? 1, 2, 3, 4"));
            } while (orden.contains(sm4 - 1) || sm4 > 4 || sm4 < 1);
            orden.add(sm4 - 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dato invalido!!");
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void agregarAuto(int x, int y, int vel, int via) {
        try {

            if (via == 1) {
                if (viaSem1.size() > 0 && viaSem1.getLast().carro.getX() < 150) {

                    viaSem1.addLast(new Auto(viaSem1.getLast().carro.getX() - 50, y, vel));
                } else if (viaSem1.size() > 0 && viaSem1.getLast().carro.getX() > 50) {
                    viaSem1.add(new Auto(x, y, vel));
                } else {
                    viaSem1.add(new Auto(x, y, vel));
                }

            } else if (via == 2) {
                if (viaSem2.size() > 0 && viaSem2.getLast().carro.getX() > 150) {

                    viaSem2.addLast(new Auto(viaSem2.getLast().carro.getX() + 50, y, vel));
                } else if (viaSem1.size() > 0 && viaSem2.getLast().carro.getX() < 50) {
                    viaSem2.add(new Auto(x, y, vel));
                } else {
                    viaSem1.add(new Auto(x, y, vel));
                }

            } else if (via == 3) {

                viaSem3.add(new Auto(x, y, vel));

            } else if (via == 4) {

                viaSem4.add(new Auto(x, y, vel));
            }

        } catch (Exception e) {
        }
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int teclaPres = evt.getKeyCode();
        if (teclaPres == KeyEvent.VK_RIGHT) {
            agregarAuto(100, 400, 1, 1);
        } else if (teclaPres == KeyEvent.VK_LEFT) {
            agregarAuto(500, 338, 1, 2);
        } else if (teclaPres == KeyEvent.VK_UP) {
            agregarAuto(350, 100, 1, 3);
        } else if (teclaPres == KeyEvent.VK_DOWN) {
            agregarAuto(400, 490, 1, 4);
        }

    }//GEN-LAST:event_formKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        agregarAuto(100, 400, 1, 1);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregarAuto(500, 400, 1, 2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarAuto(350, 100, 1, 3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        agregarAuto(400, 490, 1, 4);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cuadrante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuadrante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuadrante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuadrante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuadrante().setVisible(true);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Dibuja cajon semaforo
        g.setColor(Color.DARK_GRAY.darker());
        g.fill3DRect(310, 398, 45, 20, rootPaneCheckingEnabled);//sem1
        g.fill3DRect(395, 338, 45, 20, rootPaneCheckingEnabled);//sem2
        g.fill3DRect(338, 310, 20, 45, rootPaneCheckingEnabled);//sem3
        g.fill3DRect(398, 400, 20, 45, rootPaneCheckingEnabled);//sem4
        dibujarSemaforos(g);
        dibujarCambioLuz(g);
        dibujarCarros(g);

        //dibuja cuadras
        g.setColor(Color.DARK_GRAY.darker());

        g.fillRoundRect(100, 100, 205, 205, 20, 20);
        g.fillRoundRect(445, 100, 205, 205, 20, 20);
        g.fillRoundRect(100, 445, 205, 205, 20, 20);
        g.fillRoundRect(445, 445, 205, 205, 20, 20);

        g.setColor(Color.white);//{
        //LineaVia1:
        g.draw3DRect(100, 374, 170, 2, rootPaneCheckingEnabled);
        //lineaDeParada:
        g.fill3DRect(295, 320, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(295, 340, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(295, 360, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(295, 380, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(295, 400, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(295, 420, 10, 5, rootPaneCheckingEnabled);

        //LineaVia2:
        g.draw3DRect(474, 374, 180, 2, rootPaneCheckingEnabled);
        //lineaDeParada:
        g.fill3DRect(445, 320, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(445, 340, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(445, 360, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(445, 380, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(445, 400, 10, 5, rootPaneCheckingEnabled);
        g.fill3DRect(445, 420, 10, 5, rootPaneCheckingEnabled);

        //LineaVia3:
        g.draw3DRect(374, 100, 2, 170, rootPaneCheckingEnabled);
        //lineaDeParada:
        g.fill3DRect(320, 295, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(340, 295, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(360, 295, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(380, 295, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(400, 295, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(420, 295, 5, 10, rootPaneCheckingEnabled);

        //LineaVia4:
        g.draw3DRect(370, 470, 2, 180, rootPaneCheckingEnabled);//Linea
        //lineaDeParada:
        g.fill3DRect(320, 445, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(340, 445, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(360, 445, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(380, 445, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(400, 445, 5, 10, rootPaneCheckingEnabled);
        g.fill3DRect(420, 445, 5, 10, rootPaneCheckingEnabled);
        //}

    }

    private void dibujarSemaforos(Graphics g) {

        //Dibuja semaforos sin luz 
        if (!iniciado) {

            g.setColor(verdeOpaco);//{
            //sem1
            g.fillOval(semaforos.get(0).getLuces().get(2).getX(), semaforos.get(0).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
            //sem2
            g.fillOval(semaforos.get(1).getLuces().get(0).getX(), semaforos.get(1).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
            //sem3
            g.fillOval(semaforos.get(2).getLuces().get(2).getX(), semaforos.get(2).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
            //sem4
            g.fillOval(semaforos.get(3).getLuces().get(0).getX(), semaforos.get(3).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
            //}

            g.setColor(amarilloOpaco);//{
            //sem1
            g.fillOval(semaforos.get(0).getLuces().get(1).getX(), semaforos.get(0).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
            //sem2
            g.fillOval(semaforos.get(1).getLuces().get(1).getX(), semaforos.get(1).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
            //sem3
            g.fillOval(semaforos.get(2).getLuces().get(1).getX(), semaforos.get(2).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
            //sem4
            g.fillOval(semaforos.get(3).getLuces().get(1).getX(), semaforos.get(3).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
            //}
            g.setColor(rojoOpaco);//{
            //sem1
            g.fillOval(semaforos.get(0).getLuces().get(0).getX(), semaforos.get(0).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
            //sem2
            g.fillOval(semaforos.get(1).getLuces().get(2).getX(), semaforos.get(1).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
            //sem3
            g.fillOval(semaforos.get(2).getLuces().get(0).getX(), semaforos.get(2).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
            //sem4
            g.fillOval(semaforos.get(3).getLuces().get(2).getX(), semaforos.get(3).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
        }
        // }
    }

    private void dibujarCambioLuz(Graphics g) {
        if (iniciado) {

            try {

                g.setColor(amarilloOpaco);//{
                //sem1
                g.fillOval(semaforos.get(0).getLuces().get(1).getX(), semaforos.get(0).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
                //sem2
                g.fillOval(semaforos.get(1).getLuces().get(1).getX(), semaforos.get(1).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
                //sem3
                g.fillOval(semaforos.get(2).getLuces().get(1).getX(), semaforos.get(2).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
                //sem4
                g.fillOval(semaforos.get(3).getLuces().get(1).getX(), semaforos.get(3).getLuces().get(1).getY(), AnchoLuces, AnchoLuces);
                //}

                if (orden.get(cont) == 0) {
                    g.setColor(Color.GREEN.brighter());//enciende luz verde
                    g.fillOval(semaforos.get(0).getLuces().get(2).getX(), semaforos.get(0).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    semaforos.get(0).setEstado("Verde");
                    semaforos.get(1).setEstado("rojo");
                    semaforos.get(2).setEstado("rojo");
                    semaforos.get(3).setEstado("rojo");


                    g.setColor(rojoOpaco);//apaga luz roja
                    g.fillOval(semaforos.get(0).getLuces().get(0).getX(), semaforos.get(0).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(verdeOpaco);//apagar verde
                    g.fillOval(semaforos.get(1).getLuces().get(0).getX(), semaforos.get(1).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(2).getLuces().get(2).getX(), semaforos.get(2).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(0).getX(), semaforos.get(3).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(Color.RED.brighter());//enciende luz roja
                    g.fillOval(semaforos.get(1).getLuces().get(2).getX(), semaforos.get(1).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(2).getLuces().get(0).getX(), semaforos.get(2).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(2).getX(), semaforos.get(3).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                } else if (orden.get(cont) == 1) {
                    g.setColor(Color.GREEN.brighter());//enciende luz verde
                    g.fillOval(semaforos.get(1).getLuces().get(0).getX(), semaforos.get(1).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    semaforos.get(1).setEstado("Verde");
                    semaforos.get(0).setEstado("rojo");
                    semaforos.get(2).setEstado("rojo");
                    semaforos.get(3).setEstado("rojo");

                    g.setColor(rojoOpaco);//apaga luz roja
                    g.fillOval(semaforos.get(1).getLuces().get(2).getX(), semaforos.get(1).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(verdeOpaco);//apagar verde
                    g.fillOval(semaforos.get(0).getLuces().get(2).getX(), semaforos.get(0).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(2).getLuces().get(2).getX(), semaforos.get(2).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(0).getX(), semaforos.get(3).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(Color.RED.brighter());//enciende luz roja
                    g.fillOval(semaforos.get(0).getLuces().get(0).getX(), semaforos.get(0).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(2).getLuces().get(0).getX(), semaforos.get(2).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(2).getX(), semaforos.get(3).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                } else if (orden.get(cont) == 2) {
                    semaforos.get(2).setEstado("Verde");
                    semaforos.get(1).setEstado("rojo");
                    semaforos.get(0).setEstado("rojo");
                    semaforos.get(3).setEstado("rojo");

                    g.setColor(Color.GREEN.brighter());//enciende luz verde
                    g.fillOval(semaforos.get(2).getLuces().get(2).getX(), semaforos.get(2).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(rojoOpaco);//apaga luz roja
                    g.fillOval(semaforos.get(2).getLuces().get(0).getX(), semaforos.get(2).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(verdeOpaco);//apagar verde
                    g.fillOval(semaforos.get(0).getLuces().get(2).getX(), semaforos.get(0).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(1).getLuces().get(0).getX(), semaforos.get(1).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(0).getX(), semaforos.get(3).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(Color.RED.brighter());//enciende luz roja
                    g.fillOval(semaforos.get(0).getLuces().get(0).getX(), semaforos.get(0).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(1).getLuces().get(2).getX(), semaforos.get(1).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(3).getLuces().get(2).getX(), semaforos.get(3).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                } else {
                    g.setColor(Color.GREEN.brighter());//enciende luz verde
                    g.fillOval(semaforos.get(3).getLuces().get(0).getX(), semaforos.get(3).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                     semaforos.get(3).setEstado("Verde");
                    semaforos.get(1).setEstado("rojo");
                    semaforos.get(2).setEstado("rojo");
                    semaforos.get(0).setEstado("rojo");

                    g.setColor(rojoOpaco);//apaga luz roja
                    g.fillOval(semaforos.get(3).getLuces().get(2).getX(), semaforos.get(3).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(verdeOpaco);//apagar verde
                    g.fillOval(semaforos.get(2).getLuces().get(2).getX(), semaforos.get(2).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(0).getLuces().get(2).getX(), semaforos.get(0).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(1).getLuces().get(0).getX(), semaforos.get(1).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                    g.setColor(Color.RED.brighter());//enciende luz roja
                    g.fillOval(semaforos.get(0).getLuces().get(0).getX(), semaforos.get(0).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(1).getLuces().get(2).getX(), semaforos.get(1).getLuces().get(2).getY(), AnchoLuces, AnchoLuces);
                    g.fillOval(semaforos.get(2).getLuces().get(0).getX(), semaforos.get(2).getLuces().get(0).getY(), AnchoLuces, AnchoLuces);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vaya a la barra del menu y Configure los semaforos!!");
            }
        }
    }

    public void cambiarLuzSem() {

        cont = 0;
        timerSemaforo = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                if (iniciado) {
                    cont++;
                    if (cont > 3) {
                        cont = 0;
                    }
                    repaint();
//                    setIgnoreRepaint(true);
                }

            }
        };

        timerSemaforo.schedule(task, 0, tiempo * 1000);
    }

    public void dibujarCarros(Graphics g) {
        try {
            for (int i = 0; i < viaSem1.size(); i++) {

                Auto car = viaSem1.get(i);
                g.setColor(Color.MAGENTA);
                g.fill3DRect(car.carro.getX(), car.carro.getY(), 20, 20, rootPaneCheckingEnabled);
            }
            for (int i = 0; i < viaSem2.size(); i++) {

                Auto car = viaSem2.get(i);
                g.setColor(Color.CYAN);
                g.fill3DRect(car.carro.getX(), car.carro.getY(), 20, 20, rootPaneCheckingEnabled);
            }
            for (int i = 0; i < viaSem3.size(); i++) {

                Auto car = viaSem3.get(i);
                g.setColor(Color.blue);
                g.fill3DRect(car.carro.getX(), car.carro.getY(), 20, 20, rootPaneCheckingEnabled);
            }
            for (int i = 0; i < viaSem4.size(); i++) {

                Auto car = viaSem4.get(i);
                g.setColor(Color.LIGHT_GRAY);
                g.fill3DRect(car.carro.getX(), car.carro.getY(), 20, 20, rootPaneCheckingEnabled);
            }

        } catch (Exception e) {
        }
    }

    public void moverCarros() {

        Timer timerCarros = new Timer();
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                try {

                    for (int i = 0; i < viaSem1.size(); i++) {

                        if (viaSem1.get(i).carro.getX() >= 280 && semaforos.get(0).estado.equals("Verde")) {
                            viaSem1.get(i).carro.setX((viaSem1.get(i).carro.getX()) + 1);
                        } else if (i > 0 && viaSem1.get(i).carro.getX() < 280 && viaSem1.get(i - 1).carro.getX() >= viaSem1.get(i).carro.getX() + 30) {
                            viaSem1.get(i).carro.setX((viaSem1.get(i).carro.getX()) + 1);
                        }else if (i == 0 && viaSem1.get(i).carro.getX() < 280) {
                            viaSem1.get(i).carro.setX((viaSem1.get(i).carro.getX()) + 1);
                        }else if (viaSem1.get(i).carro.getX() > 290) {
                            viaSem1.get(i).carro.setX((viaSem1.get(i).carro.getX()) + 1);
                        }

                    }
//                    for (int i = 0; i < viaSem2.size(); i++) {
//
//                        if (viaSem2.get(i).carro.getX() >= 280 && semaforos.get(1).estado.equals("Verde")) {
//                            viaSem2.get(i).carro.setX((viaSem2.get(i).carro.getX()) + 1);
//                        } else if (i > 0 && viaSem2.get(i).carro.getX() < 280 && viaSem2.get(i - 1).carro.getX() >= viaSem2.get(i).carro.getX() + 30) {
//                            viaSem2.get(i).carro.setX((viaSem1.get(i).carro.getX()) + 1);
//                        }else if (i == 0 && viaSem2.get(i).carro.getX() < 280) {
//                            viaSem2.get(i).carro.setX((viaSem2.get(i).carro.getX()) + 1);
//                        }else if (viaSem2.get(i).carro.getX() > 290) {
//                            viaSem2.get(i).carro.setX((viaSem2.get(i).carro.getX()) + 1);
//                        }
//
//                    }
                    for (int i = 0; i < viaSem3.size(); i++) {

                        if (viaSem3.get(i).carro.getY() >= 280 && semaforos.get(2).estado.equals("Verde")) {
                            viaSem3.get(i).carro.setY((viaSem3.get(i).carro.getY()) + 1);
                        } else if (i > 0 && viaSem3.get(i).carro.getY() < 280 && viaSem3.get(i - 1).carro.getY() >= viaSem3.get(i).carro.getY() + 30) {
                            viaSem3.get(i).carro.setY((viaSem3.get(i).carro.getY()) + 1);
                        }else if (i == 0 && viaSem3.get(i).carro.getY() < 280) {
                            viaSem3.get(i).carro.setY((viaSem3.get(i).carro.getY()) + 1);
                        }else if (viaSem3.get(i).carro.getY() > 290) {
                            viaSem3.get(i).carro.setY((viaSem3.get(i).carro.getY()) + 1);
                        }

                    }
//                    for (int i = 0; i < viaSem4.size(); i++) {
//
//                        if (viaSem4.get(i).carro.getX() >= 280 && semaforos.get(3).estado.equals("Verde")) {
//                            viaSem4.get(i).carro.setX((viaSem4.get(i).carro.getX()) + 1);
//                        } else if (i > 0 && viaSem4.get(i).carro.getX() < 280 && viaSem4.get(i - 1).carro.getX() >= viaSem4.get(i).carro.getX() + 30) {
//                            viaSem4.get(i).carro.setX((viaSem4.get(i).carro.getX()) + 1);
//                        }else if (i == 0 && viaSem4.get(i).carro.getX() < 280) {
//                            viaSem4.get(i).carro.setX((viaSem4.get(i).carro.getX()) + 1);
//                        }else if (viaSem4.get(i).carro.getX() > 290) {
//                            viaSem4.get(i).carro.setX((viaSem4.get(i).carro.getX()) + 1);
//                        }
//
//                    }
 repaint();
                } catch (Exception e) {
                }

            }
        };
        timerCarros.schedule(timerTask, 0, 1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEjecutar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
