/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Reproductor;
import Modelo.Cancion;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Frederic
 */
public class PantallaReproductorFAS extends javax.swing.JFrame {

    private DefaultListModel modelo = new DefaultListModel();
    private Reproductor reproductor;
    private Timer tiempo;
    private TimerTask task;
    private int speed = 1000;
    private File arch;

    /**
     * Creates new form PantallaReproductorFAS
     */
    public PantallaReproductorFAS() {

        initComponents();
        this.setTitle("FASReproductor");

       
        this.setLocationRelativeTo(null);
        reproductor = new Reproductor();

        arch = null;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de audio MP3 (*.mp3)", "mp3");
        this.elegirArchivo.setFileFilter(filter);
        this.elegirArchivo.setAcceptAllFileFilterUsed(false);
        this.elegirArchivo.setMultiSelectionEnabled(true);

        /* FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Lista de reproduccion de ChickenPlayer (*.chl)", "chl");
         elegidorArchivo.setFileFilter(filter2);
         elegidorArchivo.setAcceptAllFileFilterUsed(false);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirArchivo = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        btn_cambiar_atras = new javax.swing.JButton();
        btn_cambiar_adelante = new javax.swing.JButton();
        btn_play = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        l_cancion = new javax.swing.JLabel();
        slider_cancion = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btn_cambiar_atras.setBackground(new java.awt.Color(51, 51, 51));
        btn_cambiar_atras.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_cambiar_atras.setForeground(new java.awt.Color(255, 153, 0));
        btn_cambiar_atras.setText("<<");
        btn_cambiar_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiar_atrasActionPerformed(evt);
            }
        });

        btn_cambiar_adelante.setBackground(new java.awt.Color(51, 51, 51));
        btn_cambiar_adelante.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_cambiar_adelante.setForeground(new java.awt.Color(255, 153, 0));
        btn_cambiar_adelante.setText(">>");
        btn_cambiar_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiar_adelanteActionPerformed(evt);
            }
        });

        btn_play.setBackground(new java.awt.Color(51, 51, 51));
        btn_play.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_play.setForeground(new java.awt.Color(255, 153, 0));
        btn_play.setText(">");
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        btn_stop.setBackground(new java.awt.Color(51, 51, 51));
        btn_stop.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_stop.setForeground(new java.awt.Color(255, 153, 0));
        btn_stop.setText("■");
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });

        l_cancion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        l_cancion.setForeground(new java.awt.Color(255, 255, 255));
        l_cancion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        slider_cancion.setValue(50
        );
        slider_cancion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                slider_cancionAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        slider_cancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slider_cancionMouseClicked(evt);
            }
        });
        slider_cancion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                slider_cancionCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        slider_cancion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                slider_cancionPropertyChange(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Frederic\\Documents\\NetBeansProjects\\FASReproductor\\src\\Modelo\\img\\img_reproductor.png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slider_cancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_cancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cambiar_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cambiar_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cambiar_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cambiar_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Lista de Reproducción");

        btn_agregar.setBackground(new java.awt.Color(51, 51, 51));
        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 153, 0));
        btn_agregar.setText("+");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_quitar.setBackground(new java.awt.Color(51, 51, 51));
        btn_quitar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_quitar.setForeground(new java.awt.Color(255, 153, 0));
        btn_quitar.setText("-");
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(51, 51, 51));
        btn_borrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 153, 0));
        btn_borrar.setText("C");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jList1.setModel(modelo);
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_quitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(696, 696, 696))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 420, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cambiar_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_adelanteActionPerformed
        reproductor.buscar_sig();
        this.l_cancion.setText(reproductor.getCancionActual().toString());


    }//GEN-LAST:event_btn_cambiar_adelanteActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        if (this.jList1.getSelectedValue() != null) {
            if (reproductor.getEstado() == 0) {

                this.btn_play.setText("||");
                reproductor.setEstado(1);
                Cancion cancion = (Cancion) this.jList1.getSelectedValue();
                if (cancion == null) {
                    cancion = (Cancion) modelo.getElementAt(0);
                }
                reproductor.reproducir(cancion);
                this.l_cancion.setText("Reproduciendo " + reproductor.getCancionActual().toString());
                startAnimation();
            } else {
                if (reproductor.getEstado() == 1) {

                    this.btn_play.setText(">");
                    reproductor.setEstado(2);
                    reproductor.pausar();
                } else {

                    this.btn_play.setText("||");
                    reproductor.setEstado(1);
                    reproductor.continuar();

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, Seleccione una canción");
        }


    }//GEN-LAST:event_btn_playActionPerformed
    public void startAnimation() {
// Maneja el Slider de la canción
        tiempo = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                int act = (int) reproductor.get_duracionActual();
                int total = (int) reproductor.get_duracionTotal();
                //calculamos el tiempo de la animacion por 100%
                //frame = (int) Math.round((act * 100)/total);
                //cuando ambos sean iguales quiere decir que e video a alcanzado el final de la reproduccion
                if (act == total) {
                    stopAnimation();
                } else // sino
                {
                    // se actualiza el nuevo valor del Slider
                    slider_cancion.setMaximum(total);
                    slider_cancion.setValue(act);

                }
            }
        };
        //se inicia la animacion
        tiempo.schedule(task, 0, speed);
    }

    //detiene la animacion
    public void stopAnimation() {
        tiempo.cancel();
        task.cancel();
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        File ruta[];
        int estadoJC = elegirArchivo.showOpenDialog(null);
        if (estadoJC == JFileChooser.APPROVE_OPTION) {

            ruta = elegirArchivo.getSelectedFiles();
            try {
                // TODO add your handling code here:
                Modelo.Archivo.cargar_canciones(reproductor, ruta);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PantallaReproductorFAS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        rellenar_jlist();
        if (arch != null) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        modelo.removeAllElements();
        reproductor.borrar();
        reproductor.parar();
        l_cancion.setText("");
        this.btn_play.setText(">");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        reproductor.parar();

        this.l_cancion.setText("");
        this.btn_play.setText(">");
        reproductor.setEstado(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_stopActionPerformed

    private void slider_cancionCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_slider_cancionCaretPositionChanged
       int pos = slider_cancion.getValue();
        reproductor.ir_a_posicion(pos);
    }//GEN-LAST:event_slider_cancionCaretPositionChanged

    private void slider_cancionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slider_cancionPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionPropertyChange

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        Cancion c = (Cancion) jList1.getSelectedValue();
        reproductor.eliminar_cancion(c);
        modelo.removeElement(c);
        if (c == reproductor.getCancionActual()) {
            reproductor.parar();
        }
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void btn_cambiar_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_atrasActionPerformed

        reproductor.buscar_ant();
        this.l_cancion.setText(reproductor.getCancionActual().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cambiar_atrasActionPerformed

    private void slider_cancionAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_slider_cancionAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionAncestorMoved

    private void slider_cancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_cancionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slider_cancionMouseClicked

    public void rellenar_jlist() {

        Cancion aux;
        Iterator<Cancion> it = reproductor.get_playlist().iterator();
        modelo.removeAllElements();
        while (it.hasNext()) {
            aux = it.next();
            modelo.addElement(aux);
        }

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
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaReproductorFAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaReproductorFAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cambiar_adelante;
    private javax.swing.JButton btn_cambiar_atras;
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JButton btn_stop;
    private javax.swing.JFileChooser elegirArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_cancion;
    private javax.swing.JSlider slider_cancion;
    // End of variables declaration//GEN-END:variables
}
