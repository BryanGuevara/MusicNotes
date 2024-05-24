/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Escala;
import Clases.Nota;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINEDUCYT
 */
public class GaleriaEscalas extends javax.swing.JFrame {

    DefaultTableModel escala = new DefaultTableModel();
    DefaultTableModel circulo = new DefaultTableModel();

    /**
     * Creates new form ArmadorEscalas
     */
    public GaleriaEscalas() {
        initComponents();

        setSize(600, 500);
        setResizable(false);
        setTitle(" Escalas");
        this.setLocationRelativeTo(null);

        TableNotas = new JTable(escala);
        jScrollPane1.setViewportView(TableNotas);

        escala.addColumn("1°");
        escala.addColumn("2°");
        escala.addColumn("3°");
        escala.addColumn("4°");
        escala.addColumn("5°");
        escala.addColumn("6°");
        escala.addColumn("7°");
        escala.addColumn("8°");

        TableCirculo = new JTable(circulo);
        jScrollPane2.setViewportView(TableCirculo);

        circulo.addColumn("Tonica");
        circulo.addColumn("Tension°");
        circulo.addColumn("Acompañante");
        circulo.addColumn("Complemento");
    }
    
@Override
public Image getIconImage() {
    URL resourceUrl = ClassLoader.getSystemResource("img/icono.png");
    if (resourceUrl != null) {
        Image retValue = Toolkit.getDefaultToolkit().getImage(resourceUrl);
        return retValue;
    } else {
        System.err.println("No se pudo encontrar el recurso 'icono.png'");
        return null;
    }
}
    public static String[] EscalaGenerada(List<Nota> notas, String notaInicial, List<Integer> progresion) {
        String[] escala = new String[progresion.size() + 1];

        int posInicial = -1;
        for (Nota nota : notas) {
            if (nota.getNombre().equalsIgnoreCase(notaInicial)) {
                posInicial = nota.getNumero() - 1;
                break;
            }
        }

        if (posInicial == -1) {
            return null;
        }

        escala[0] = notas.get(posInicial).getNombre();
        int posicionActual = posInicial;
        for (int i = 0; i < progresion.size(); i++) {
            posicionActual += progresion.get(i);
            if (posicionActual >= notas.size()) {
                posicionActual -= notas.size();
            }
            escala[i + 1] = notas.get(posicionActual).getNombre();
        }

        return escala;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableNotas = new javax.swing.JTable();
        CmbEscala = new javax.swing.JComboBox<>();
        CmbNota = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCirculo = new javax.swing.JTable();
        LabelEscala = new javax.swing.JLabel();
        LabelNota = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LabelSecuencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());

        TableNotas.setBackground(new java.awt.Color(51, 51, 51));
        TableNotas.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TableNotas.setForeground(new java.awt.Color(255, 255, 255));
        TableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableNotas.setToolTipText("");
        jScrollPane1.setViewportView(TableNotas);

        CmbEscala.setBackground(new java.awt.Color(51, 51, 51));
        CmbEscala.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CmbEscala.setForeground(new java.awt.Color(255, 255, 255));
        CmbEscala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor", "Menor" }));
        CmbEscala.setToolTipText("");
        CmbEscala.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbEscalaItemStateChanged(evt);
            }
        });

        CmbNota.setBackground(new java.awt.Color(51, 51, 51));
        CmbNota.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CmbNota.setForeground(new java.awt.Color(255, 255, 255));
        CmbNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI" }));
        CmbNota.setToolTipText("");
        CmbNota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbNotaItemStateChanged(evt);
            }
        });

        TableCirculo.setBackground(new java.awt.Color(51, 51, 51));
        TableCirculo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TableCirculo.setForeground(new java.awt.Color(255, 255, 255));
        TableCirculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableCirculo.setToolTipText("");
        jScrollPane2.setViewportView(TableCirculo);

        LabelEscala.setBackground(new java.awt.Color(255, 255, 255));
        LabelEscala.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LabelEscala.setForeground(new java.awt.Color(51, 51, 51));
        LabelEscala.setText("Escala");

        LabelNota.setBackground(new java.awt.Color(255, 255, 255));
        LabelNota.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LabelNota.setForeground(new java.awt.Color(51, 51, 51));
        LabelNota.setText("Circulo");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Esta escala se arma usando la secuencia:");

        LabelSecuencia.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNota)
                    .addComponent(LabelEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CmbEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbNota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbNota, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(LabelEscala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbNotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbNotaItemStateChanged

    }//GEN-LAST:event_CmbNotaItemStateChanged

    private void CmbEscalaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbEscalaItemStateChanged

    }//GEN-LAST:event_CmbEscalaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int notaIndex = CmbNota.getSelectedIndex();
        int escalaindex = CmbEscala.getSelectedIndex();

        Nota[] notas = {
            new Nota(1, "DO"),
            new Nota(2, "Do#"),
            new Nota(3, "RE"),
            new Nota(4, "RE#"),
            new Nota(5, "MI"),
            new Nota(6, "FA"),
            new Nota(7, "FA#"),
            new Nota(8, "SOL"),
            new Nota(9, "SOL#"),
            new Nota(10, "LA"),
            new Nota(11, "LA#"),
            new Nota(12, "SI")
        };

        List<Integer> progresion = null;
        String tipoEscala = "";

        if (escalaindex == 0) { // Escala Mayor
            progresion = Arrays.asList(2, 2, 1, 2, 2, 2, 1);
            tipoEscala = "Mayor";
        } else if (escalaindex == 1) { // Escala Menor
            progresion = Arrays.asList(2, 1, 2, 2, 1, 2, 2);
            tipoEscala = "Menor";
        }

        if (progresion != null) {
            List<Nota> notasList = Arrays.asList(notas);
            Escala escalaSeleccionada = new Escala(notasList, progresion, tipoEscala, escalaindex);
            String notaInicial = notas[notaIndex].getNombre();
            String[] escalaGenerada = escalaGenerada(notasList, notaInicial, progresion);

            // Limpiar la tabla antes de agregar nuevas filas
            while (escala.getRowCount() > 0) {
                escala.removeRow(0);
            }

            while (circulo.getRowCount() > 0) {
                circulo.removeRow(0);
            }

            if (escalaGenerada != null) {
                escala.addRow(escalaGenerada);
            } else {
                System.out.println("La nota inicial no es válida para la escala " + tipoEscala + ".");
            }
        }

        if (notaIndex == 0) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"DO", "FA", "SOL", "REm / LAm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"DOm", "FAm", "SOL", "REm / LAm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 1) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"DO#", "FA#", "SOL#", "RE#m / LA#m"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"DO#m", "FA#m", "SOL#", "RE#m / LA#m"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 2) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"RE", "SOL", "LA", "MIm / SIm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"REm", "SOLm", "LA", "MIm / SIm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 3) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"RE#", "SOL#", "LA#", "FAm / DOm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"RE#m", "SOL#m", "LA#", "FAm / DOm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 4) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"MI", "LA", "SI", "FA#m / REm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"MIm", "LAm", "SI", "FA#m / DO#m"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 5) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"FA", "LA#", "DO", "SOLm / REm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"FAm", "LA#m", "DO", "SOLm / REm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 6) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"FA#", "SI", "DO#", "SOL#m / RE#m"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"FA#m", "SIm", "DO#", "SOL#m / RE#m"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 7) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"SOL", "DO", "RE", "LAm /  MIm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"SOL", "DO", "RE", "LAm /  MIm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 8) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"SOL#", "DO#", "RE#", "LA#m / FAm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"SOL#m", "DO#m", "RE#", "LA#m / FAm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 9) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"LA", "RE", "MI", "SIm / FA#m"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"LAm", "REm", "MI", "SIm / FA#m"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }

        if (notaIndex == 10) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"LA#", "RE#", "FA", "DOm / SOLm"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"LA#m", "RE#m", "FA", "DOm / SOLm"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }
        if (notaIndex == 11) {
            if (escalaindex == 0) {
                circulo.addRow(new Object[]{"SI", "MI", "FA#", "DO#m / SOL#m"});
                LabelSecuencia.setText("Tono - Tono - SemiTono - Tono- Tono - Tono - SemiTono");
            } else {
                circulo.addRow(new Object[]{"SIm", "MIm", "FA#", "DO#m / SOL#m"});
                LabelSecuencia.setText("Tono - SemiTono - Tono - Tono- SemiTono - Tono - Tono");
            }
        }
    }

    public static String[] escalaGenerada(List<Nota> notas, String notaInicial, List<Integer> progresion) {
        String[] escala = new String[progresion.size() + 1];

        int posInicial = -1;
        for (Nota nota : notas) {
            if (nota.getNombre().equalsIgnoreCase(notaInicial)) {
                posInicial = nota.getNumero() - 1;
                break;
            }
        }

        if (posInicial == -1) {
            return null;
        }

        escala[0] = notas.get(posInicial).getNombre();
        int posicionActual = posInicial;
        for (int i = 0; i < progresion.size(); i++) {
            posicionActual += progresion.get(i);
            if (posicionActual >= notas.size()) {
                posicionActual -= notas.size();
            }
            escala[i + 1] = notas.get(posicionActual).getNombre();
        }

        return escala;

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GaleriaEscalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaleriaEscalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaleriaEscalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaleriaEscalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaleriaEscalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbEscala;
    private javax.swing.JComboBox<String> CmbNota;
    private javax.swing.JLabel LabelEscala;
    private javax.swing.JLabel LabelNota;
    private javax.swing.JLabel LabelSecuencia;
    private javax.swing.JTable TableCirculo;
    private javax.swing.JTable TableNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
