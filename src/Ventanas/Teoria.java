package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Clases.Enciclopedia;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.swing.JComboBox;

public class Teoria extends javax.swing.JFrame {

    private LinkedHashMap<String, Supplier<String>> temasMap = new LinkedHashMap<>();
    Enciclopedia informacion = new Enciclopedia();
    private boolean cssCargado = false;

    public Teoria() {
        initComponents();
        initTemasMap();
        this.setLocationRelativeTo(null);
        AreaInfo.setText(informacion.CSS());

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
        CmbIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccone un Tema --" }));
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

    public void initTemasMap() {
        temasMap.put("Historia", informacion::Historia);
        temasMap.put("Musicas", informacion::Musicas);
        temasMap.put("Musicos", informacion::Musicos);
        temasMap.put("-- Tecnicas --", informacion::Tecnicas);
        temasMap.put("Legato", informacion::Legato);
        temasMap.put("Staccato", informacion::Staccato);
        temasMap.put("Trecillo", informacion::Trecillo);
        temasMap.put("Quebrado", informacion::Quebrado);
        temasMap.put("Dinamicas", informacion::Dinamicas);
        temasMap.put("-- Composicion --", informacion::Composicion);
        temasMap.put("Composicion De Circulos", informacion::ComposicionDeCirculos);
        temasMap.put("Estructura De La Forma Musical", informacion::EstructuraDeLaFormaMusical);
        temasMap.put("Ornamentacion", informacion::Ornamentacion);
        temasMap.put("Composicion De Acordes", informacion::ComposicionDeAcordes);
        temasMap.put("-- Teoria Musical --", informacion::TeoriaMusical);
        temasMap.put("Escalas Mayores Y Menores", informacion::EscalasMayoresYMenores);
        temasMap.put("Tonalidad Y Modalidad", informacion::TonalidadYModalidad);
        temasMap.put("Modos", informacion::Modos);
        temasMap.put("Intervalos", informacion::Intervalos);
        temasMap.put("Compass", informacion::Compass);
        temasMap.put("Acordes Invertidos", informacion::AcordesInvertidos);
        temasMap.put("Acordes Añadidos", informacion::AcordesAñadidos);
        temasMap.put("Acordes Maj", informacion::AcordesMaj);
        temasMap.put("Acordes Sobre", informacion::AcordesSobre);
        temasMap.put("Alteraciones Accidentales", informacion::AlteracionesAccidentales);
        temasMap.put("Modulacion", informacion::Modulacion);
        temasMap.put("Cadencias", informacion::Cadencias);
        temasMap.put("Notacion Musical", informacion::NotacionMusical);
        temasMap.put("Contrapunto", informacion::Contrapunto);
        temasMap.put("Polifonia", informacion::Polifonia);
        temasMap.put("Textura Musical", informacion::TexturaMusical);
        temasMap.put("Armonicos", informacion::Armonicos);
        temasMap.put("Contratiempo", informacion::Contratiempo);
        temasMap.put("Transposicion", informacion::Transposicion);
        temasMap.put("Figuras Ritmicas", informacion::FigurasRitmicas);
        temasMap.put("Ritmo Y Metrica", informacion::RitmoYMetrica);
        temasMap.put("-- Teoria Avanzada --", informacion::TeoriaAvanzada);
        temasMap.put("Analisis Formal De Obras Complejas", informacion::AnalisisFormalDeObrasComplejas);
        temasMap.put("Sistemas De Notacion Alternativa", informacion::SistemasDeNotacionAlternativa);
        temasMap.put("Policoralidad Y Multitonalidad", informacion::PolicoralidadYMultitonalidad);
        temasMap.put("Teoria Del Jazz Y Armonia Extendida", informacion::TeoriaDelJazzYArmoniaExtendida);
        temasMap.put("Composicion Serial Y Aleatoria", informacion::ComposicionSerialYAleatoria);
        temasMap.put("Analisis De Composiciones Del Siglo XX", informacion::AnalisisDeComposicionesDelSigloXX);
        temasMap.put("Composicion Serial Y Muzica Aleatoria", informacion::ComposicionSerialYMuzicaAleatoria);
        temasMap.put("Teoria De La Armonia Extendida", informacion::TeoriaDeLaArmoniaExtendida);
        temasMap.put("Polifonia Compleja Y Contrapunto Avanzado", informacion::PolifoniaComplejaYContrapuntoAvanzado);
        temasMap.put("Tecnicas De Composicion Electronica", informacion::TecnicasDeComposicionElectronica);
        temasMap.put("Musicologia Y Contexto Historico", informacion::MusicologiaYContextoHistorico);
        temasMap.put("Estudios Sobre La Psicologia De La Musica", informacion::EstudiosSobreLaPsicologiaDeLaMusica);
        temasMap.put("Interaccion Entre Musica Y Tecnologia", informacion::InteraccionEntreMusicaYTecnologia);
        temasMap.put("Musica Minimalista Y Su Impacto", informacion::MusicaMinimalistaYSuImpacto);
        temasMap.put("Estilos Musicales Contemporaneos", informacion::EstilosMusicalesContemporaneos);
        temasMap.put("Teoria De Los Conjuntos Armónicos", informacion::TeoriaDeLosConjuntosArmónicos);
        temasMap.put("Desarrollo De Temas Y Motivos", informacion::DesarrolloDeTemasYMotivos);
        temasMap.put("Musica Y Cultura Global", informacion::MusicaYCulturaGlobal);
        temasMap.put("Analisis De Texturas Musicales Complejas", informacion::AnalisisDeTexturasMusicalesComplejas);
        temasMap.put("Improvisacion Avanzada En Diferentes Generos", informacion::ImprovisacionAvanzadaEnDiferentesGeneros);
        temasMap.put("Oido Musical Y Absoluto", informacion::OidoMusicalYAbsoluto);
        temasMap.put("-- Tipos De Instrumentos --", informacion::TiposDeInstrumentos);
        temasMap.put("Ejemplos De Instrumentos De Teclado", informacion::EjemplosDeInstrumentosDeTeclado);
        temasMap.put("Ejemplos De Instrumentos De Cuerda", informacion::EjemplosDeInstrumentosDeCuerda);
        temasMap.put("Ejemplos De Instrumentos De Viento Madera", informacion::EjemplosDeInstrumentosDeVientoMadera);
        temasMap.put("Ejemplos De Instrumentos De Viento Metal", informacion::EjemplosDeInstrumentosDeVientoMetal);
        temasMap.put("Ejemplos De Instrumentos De Percusion Afinada", informacion::EjemplosDeInstrumentosDePercusionAfinada);
        temasMap.put("Ejemplos De Instrumentos De Percusion No Afinada", informacion::EjemplosDeInstrumentosDePercusionNoAfinada);
        temasMap.put("Ejemplos De Instrumentos Electroacusticos", informacion::EjemplosDeInstrumentosElectroacusticos);
        temasMap.put("Ejemplos De Instrumentos Digitales", informacion::EjemplosDeInstrumentosDigitales);
        temasMap.put("Ejemplos De Instrumentos Experimentales", informacion::EjemplosDeInstrumentosExperimentales);
        temasMap.put("Carta", informacion::Carta);

        for (String tema : temasMap.keySet()) {
            CmbIndex.addItem(tema);
        }
    }


    private void CmbIndexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbIndexItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            String selectedTema = (String) CmbIndex.getSelectedItem();

            if (CmbIndex.getSelectedIndex() == 0) {
                AreaInfo.setVisible(false);
                AreaInfo.setText("");
            }

            if (temasMap.containsKey(selectedTema)) {
                AreaInfo.setText(temasMap.get(selectedTema).get());
                AreaInfo.setVisible(true);
                AreaInfo.setCaretPosition(0);
            } else {
                System.err.println("Error: Tema no encontrado en el mapa");
                AreaInfo.setText("Tema no encontrado");
            }
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
