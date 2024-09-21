package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Clases.Enciclopedia;

public class Teoria extends javax.swing.JFrame {

    public Teoria() {
        initComponents();

        this.setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/img/wallpaperLibreria.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));
        LabelWallpaper.setIcon(icon);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        AreaInfo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CmbIndex = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaInfo = new javax.swing.JTextPane();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CmbIndex.setBackground(new java.awt.Color(51, 51, 51));
        CmbIndex.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CmbIndex.setForeground(new java.awt.Color(255, 255, 255));
        CmbIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Seleccione un tema ---", "Historia", "Músicas", "Músicos", "--- Tecnicas ---", "Legato", "Staccato", "Trecillo", "Quebrado", "Dinámicas", "--- Composicion ---", "Composición de Círculos", "Estructura de la Forma Musical", "Ornamentación", "Composición de Acordes", "--- Teoria Musical ---", "Escalas Mayores y Menores", "Tonalidad y Modalidad", "Profundizando en las Escalas Modales", "Intervalos", "Compass", "Acordes Invertidos", "Acordes Añadidos", "Acordes Maj", "Acordes sobre", "Alteraciones Accidentales", "Modulación", "Cadencias", "Notación Musical", "Contrapunto", "Polifonía", "Textura Musical", "Armonicos", "Contratiempo", "Transposición", "Figuras Rítmicas", "Ritmo y Metrica", "--- Tipos de Instrumentos ---", "Ejemplos de Instrumentos de Teclado", "Ejemplos de Instrumentos de Cuerda", "Ejemplos de Instrumentos de Viento Madera", "Ejemplos de Instrumentos de Viento Metal", "Ejemplos de Instrumentos de Percusión Afinada", "Ejemplos de Instrumentos de Percusión No Afinada", "Ejemplos de Instrumentos Electroacústicos", "Ejemplos de Instrumentos Digitales", "Ejemplos de Instrumentos Experimentales", "--- Teoria avanzada ---", "Análisis Formal de Obras Complejas", "Sistemas de Notación Alternativa", "Policoralidad y Multitonalidad", "Teoría del Jazz y Armonía Extendida", "Composición Serial y Aleatoria", "Análisis de Composiciones del Siglo XX", "Composición Serial y Música Aleatoria", "Teoría de la Armonía Extendida", "Polifonía Compleja y Contrapunto Avanzado", "Técnicas de Composición Electrónica", "Musicología y Contexto Histórico", "Estudios sobre la Psicología de la Música", "Interacción entre Música y Tecnología", "Música Minimalista y su Impacto", "Estilos Musicales Contemporáneos", "Teoría de los Conjuntos Armónicos", "Desarrollo de Temas y Motivos", "Música y Cultura Global", "Análisis de Texturas Musicales Complejas", "Improvisación Avanzada en Diferentes Géneros", "Oido Musical y Absoluto", "--- Carta a los Musicos ---" }));
        CmbIndex.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CmbIndex.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbIndexItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 60));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 40));

        AreaInfo.setEditable(false);
        AreaInfo.setBackground(new java.awt.Color(56, 56, 56));
        AreaInfo.setContentType("text/html"); // NOI18N
        AreaInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AreaInfo.setForeground(new java.awt.Color(0, 0, 0));
        AreaInfo.setCaretColor(new java.awt.Color(56, 56, 56));
        jScrollPane1.setViewportView(AreaInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 500));

        LabelWallpaper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbIndexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbIndexItemStateChanged
        int Index = CmbIndex.getSelectedIndex();
        Enciclopedia informacion = new Enciclopedia();

        AreaInfo.setVisible(false);
        AreaInfo.setText("");

        if (Index == 1) {
            AreaInfo.setText(informacion.Historia());
        } else if (Index == 2) {
            AreaInfo.setText(informacion.Musicas());
        } else if (Index == 3) {
            AreaInfo.setText(informacion.Musicos());
        } else if (Index == 4) {
            AreaInfo.setText(informacion.Tecnicas());
        } else if (Index == 5) {
            AreaInfo.setText(informacion.Legato());
        } else if (Index == 6) {
            AreaInfo.setText(informacion.Staccato());
        } else if (Index == 7) {
            AreaInfo.setText(informacion.Trecillo());
        } else if (Index == 8) {
            AreaInfo.setText(informacion.Quebrado());
        } else if (Index == 9) {
            AreaInfo.setText(informacion.Dinamicas());
        } else if (Index == 10) {
            AreaInfo.setText(informacion.Composicion());
        } else if (Index == 11) {
            AreaInfo.setText(informacion.ComposicionDeCirculos());
        } else if (Index == 12) {
            AreaInfo.setText(informacion.EstructuraDeLaFormaMusical());
        } else if (Index == 13) {
            AreaInfo.setText(informacion.Ornamentacion());
        } else if (Index == 14) {
            AreaInfo.setText(informacion.ComposicionDeAcordes());
        } else if (Index == 15) {
            AreaInfo.setText(informacion.TeoriaMusical());
        } else if (Index == 16) {
            AreaInfo.setText(informacion.EscalasMayoresYMenores());
        } else if (Index == 17) {
            AreaInfo.setText(informacion.TonalidadYModalidad());
        } else if (Index == 18) {
            AreaInfo.setText(informacion.Modos());
        } else if (Index == 19) {
            AreaInfo.setText(informacion.Intervalos());
        } else if (Index == 20) {
            AreaInfo.setText(informacion.Compass());
        } else if (Index == 21) {
            AreaInfo.setText(informacion.AcordesInvertidos());
        } else if (Index == 22) {
            AreaInfo.setText(informacion.AcordesAñadidos());
        } else if (Index == 23) {
            AreaInfo.setText(informacion.AcordesMaj());
        } else if (Index == 24) {
            AreaInfo.setText(informacion.AcordesSobre());
        } else if (Index == 25) {
            AreaInfo.setText(informacion.AlteracionesAccidentales());
        } else if (Index == 26) {
            AreaInfo.setText(informacion.Modulacion());
        } else if (Index == 27) {
            AreaInfo.setText(informacion.Cadencias());
        } else if (Index == 28) {
            AreaInfo.setText(informacion.NotacionMusical());
        } else if (Index == 29) {
            AreaInfo.setText(informacion.Contrapunto());
        } else if (Index == 30) {
            AreaInfo.setText(informacion.Polifonia());
        } else if (Index == 31) {
            AreaInfo.setText(informacion.TexturaMusical());
        } else if (Index == 32) {
            AreaInfo.setText(informacion.Armonicos());
        } else if (Index == 33) {
            AreaInfo.setText(informacion.Contratiempo());
        } else if (Index == 34) {
            AreaInfo.setText(informacion.Transposicion());
        } else if (Index == 35) {
            AreaInfo.setText(informacion.FigurasRitmicas());
        } else if (Index == 36) {
            AreaInfo.setText(informacion.RitmoYMetrica());
        } else if (Index == 37) {
            AreaInfo.setText(informacion.TiposDeInstrumentos());
        } else if (Index == 38) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDeTeclado());
        } else if (Index == 39) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDeCuerda());
        } else if (Index == 40) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDeVientoMadera());
        } else if (Index == 41) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDeVientoMetal());
        } else if (Index == 42) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDePercusionAfinada());
        } else if (Index == 43) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDePercusionNoAfinada());
        } else if (Index == 44) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosElectroacusticos());
        } else if (Index == 45) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosDigitales());
        } else if (Index == 46) {
            AreaInfo.setText(informacion.EjemplosDeInstrumentosExperimentales());
        } else if (Index == 47) {
            AreaInfo.setText(informacion.TeoriaAvanzada());
        } else if (Index == 48) {
            AreaInfo.setText(informacion.AnalisisFormalDeObrasComplejas());
        } else if (Index == 49) {
            AreaInfo.setText(informacion.SistemasDeNotacionAlternativa());
        } else if (Index == 50) {
            AreaInfo.setText(informacion.PolicoralidadYMultitonalidad());
        } else if (Index == 51) {
            AreaInfo.setText(informacion.TeoriaDelJazzYArmoniaExtendida());
        } else if (Index == 52) {
            AreaInfo.setText(informacion.ComposicionSerialYAleatoria());
        } else if (Index == 53) {
            AreaInfo.setText(informacion.AnalisisDeComposicionesDelSigloXX());
        } else if (Index == 54) {
            AreaInfo.setText(informacion.ComposicionSerialYMuzicaAleatoria());
        } else if (Index == 55) {
            AreaInfo.setText(informacion.TeoriaDeLaArmoniaExtendida());
        } else if (Index == 56) {
            AreaInfo.setText(informacion.PolifoniaComplejaYContrapuntoAvanzado());
        } else if (Index == 57) {
            AreaInfo.setText(informacion.TecnicasDeComposicionElectronica());
        } else if (Index == 58) {
            AreaInfo.setText(informacion.MusicologiaYContextoHistorico());
        } else if (Index == 59) {
            AreaInfo.setText(informacion.EstudiosSobreLaPsicologiaDeLaMusica());
        } else if (Index == 60) {
            AreaInfo.setText(informacion.InteraccionEntreMusicaYTecnologia());
        } else if (Index == 61) {
            AreaInfo.setText(informacion.MusicaMinimalistaYSuImpacto());
        } else if (Index == 62) {
            AreaInfo.setText(informacion.EstilosMusicalesContemporaneos());
        } else if (Index == 63) {
            AreaInfo.setText(informacion.TeoriaDeLosConjuntosArmónicos());
        } else if (Index == 64) {
            AreaInfo.setText(informacion.DesarrolloDeTemasYMotivos());
        } else if (Index == 65) {
            AreaInfo.setText(informacion.MusicaYCulturaGlobal());
        } else if (Index == 66) {
            AreaInfo.setText(informacion.AnalisisDeTexturasMusicalesComplejas());
        } else if (Index == 67) {
            AreaInfo.setText(informacion.ImprovisacionAvanzadaEnDiferentesGeneros());
        } else if (Index == 68) {
            AreaInfo.setText(informacion.OidoMusicalYAbsoluto());
        } else if (Index == 69) {
            AreaInfo.setText(informacion.Carta());
        }

        if (Index > 0) {
            AreaInfo.setVisible(true);
            AreaInfo.setCaretPosition(0);
        }
        
    }//GEN-LAST:event_CmbIndexItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AreaInfo;
    private javax.swing.JComboBox<String> CmbIndex;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
