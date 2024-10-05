package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Clases.Enciclopedia;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

public class Teoria extends javax.swing.JFrame {

    private LinkedHashMap<String, Supplier<String>> temasMap = new LinkedHashMap<>();
    Enciclopedia informacion = new Enciclopedia();

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
        AreaInfo.setBackground(Color.red);
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
        CmbIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecciona un Tema --" }));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 770, 500));

        LabelWallpaper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initTemasMap() {
        int Indice=0;
        //Introducción
        Indice = 0;
        temasMap.put((Indice = Indice+1)+"- Historia", informacion::Historia);
        temasMap.put((Indice = Indice+1)+"- Ritmos", informacion::Ritmos);
        temasMap.put((Indice = Indice+1)+"- Familias de Ritmos", informacion::Familias);
        temasMap.put((Indice = Indice+1)+"- Musicos", informacion::Musicos);
        //Tecnica
        Indice = 0;
        temasMap.put("-- Técnicas --", informacion::Tecnicas);
        temasMap.put((Indice = Indice+1)+"- Dinamicas", informacion::Dinamicas);
        temasMap.put((Indice = Indice+1)+"- Quebrado", informacion::Quebrado);
        temasMap.put((Indice = Indice+1)+"- Trecillo", informacion::Trecillo);
        temasMap.put((Indice = Indice+1)+"- Legato", informacion::Legato);
        temasMap.put((Indice = Indice+1)+"- Staccato", informacion::Staccato);
        temasMap.put((Indice = Indice+1)+"- Portato", informacion::Portato);
        temasMap.put((Indice = Indice+1)+"- Tenuto", informacion::Tenuto);
        temasMap.put((Indice = Indice+1)+"- Marcato", informacion::Marcato);
        temasMap.put((Indice = Indice+1)+"- Accento", informacion::Accento);
        temasMap.put((Indice = Indice+1)+"- Sforzando", informacion::Sforzando);
        temasMap.put((Indice = Indice+1)+"- Spiccato", informacion::Spiccato);
        temasMap.put((Indice = Indice+1)+"- Trino", informacion::Trino);
        temasMap.put((Indice = Indice+1)+"- Apoyatura", informacion::Apoyatura);
        temasMap.put((Indice = Indice+1)+"- Mordente", informacion::Mordente);
        temasMap.put((Indice = Indice+1)+"- Gruppo", informacion::Gruppo);
        temasMap.put((Indice = Indice+1)+"- Grace Notes", informacion::GraceNotes);
        temasMap.put((Indice = Indice+1)+"- Vibrato", informacion::Vibrato);
        temasMap.put((Indice = Indice+1)+"- Sul Ponticello", informacion::SulPonticello);
        temasMap.put((Indice = Indice+1)+"- Sul Tasto", informacion::SulTasto);
        temasMap.put((Indice = Indice+1)+"- Col Legno", informacion::ColLegno);
        temasMap.put((Indice = Indice+1)+"- Double Stopping", informacion::DoubleStopping);
        temasMap.put((Indice = Indice+1)+"- Pizzicato", informacion::Pizzicato);
        temasMap.put((Indice = Indice+1)+"- Arco", informacion::Arco);
        temasMap.put((Indice = Indice+1)+"- Circular Breathing", informacion::CircularBreathing);
        temasMap.put((Indice = Indice+1)+"- Multifonicos", informacion::Multifonicos);
        temasMap.put((Indice = Indice+1)+"- Slap Tongue", informacion::SlapTongue);
        temasMap.put((Indice = Indice+1)+"- apping", informacion::Tapping);
        temasMap.put((Indice = Indice+1)+"- Palm Mute", informacion::PalmMute);
        temasMap.put((Indice = Indice+1)+"- Pedal Tone", informacion::PedalTone);
        temasMap.put((Indice = Indice+1)+"- Portamento", informacion::Portamento);
        temasMap.put((Indice = Indice+1)+"- Scordatura", informacion::Scordatura);
        // Composición
        Indice = 0;
        temasMap.put("-- Composición --", informacion::Composicion);
        temasMap.put((Indice = Indice+1)+"- Composicion De Circulos", informacion::ComposicionDeCirculos);
        temasMap.put((Indice = Indice+1)+"- Composicion De Acordes", informacion::ComposicionDeAcordes);
        temasMap.put((Indice = Indice+1)+"- Estructura De La Forma Musical", informacion::EstructuraDeLaFormaMusical);
        temasMap.put((Indice = Indice+1)+"- Ornamentacion", informacion::Ornamentacion);
        // Teoria Músical
        Indice = 0;
        temasMap.put("-- Teoria Musical --", informacion::TeoriaMusical);
        temasMap.put((Indice = Indice+1)+"- Escalas Mayores Y Menores", informacion::EscalasMayoresYMenores);
        temasMap.put((Indice = Indice+1)+"- Tonalidad Y Modalidad", informacion::TonalidadYModalidad);
        temasMap.put((Indice = Indice+1)+"- Modos", informacion::Modos);
        temasMap.put((Indice = Indice+1)+"- Intervalos", informacion::Intervalos);
        temasMap.put((Indice = Indice+1)+"- Alteraciones Accidentales", informacion::AlteracionesAccidentales);
        temasMap.put((Indice = Indice+1)+"- Acordes Maj", informacion::AcordesMaj);
        temasMap.put((Indice = Indice+1)+"- Acordes Invertidos", informacion::AcordesInvertidos);
        temasMap.put((Indice = Indice+1)+"- Acordes Añadidos", informacion::AcordesAñadidos);
        temasMap.put((Indice = Indice+1)+"- Acordes Sobre", informacion::AcordesSobre);
        temasMap.put((Indice = Indice+1)+"- Cadencias", informacion::Cadencias);
        temasMap.put((Indice = Indice+1)+"- Modulacion", informacion::Modulacion);
        temasMap.put((Indice = Indice+1)+"- Notacion Musical", informacion::NotacionMusical);
        temasMap.put((Indice = Indice+1)+"- Ritmo Y Metrica", informacion::RitmoYMetrica);
        temasMap.put((Indice = Indice+1)+"- Figuras Ritmicas", informacion::FigurasRitmicas);
        temasMap.put((Indice = Indice+1)+"- Contrapunto", informacion::Contrapunto);
        temasMap.put((Indice = Indice+1)+"- Polifonia", informacion::Polifonia);
        temasMap.put((Indice = Indice+1)+"- Textura Musical", informacion::TexturaMusical);
        temasMap.put((Indice = Indice+1)+"- Compass", informacion::Compass);
        temasMap.put((Indice = Indice+1)+"- Armonicos", informacion::Armonicos);
        temasMap.put((Indice = Indice+1)+"- Contratiempo", informacion::Contratiempo);
        temasMap.put((Indice = Indice+1)+"- Transposicion", informacion::Transposicion);
        // Teoria Avanzada
        Indice = 0;
        temasMap.put("-- Teoria Avanzada --", informacion::TeoriaAvanzada);
        temasMap.put((Indice = Indice+1)+"- Analisis Formal De Obras Complejas", informacion::AnalisisFormalDeObrasComplejas);
        temasMap.put((Indice = Indice+1)+"- Analisis De Composiciones Del Siglo XX", informacion::AnalisisDeComposicionesDelSigloXX);
        temasMap.put((Indice = Indice+1)+"- Analisis De Texturas Musicales Complejas", informacion::AnalisisDeTexturasMusicalesComplejas);
        temasMap.put((Indice = Indice+1)+"- Desarrollo De Temas Y Motivos", informacion::DesarrolloDeTemasYMotivos);
        temasMap.put((Indice = Indice+1)+"- Improvisacion Avanzada En Diferentes Generos", informacion::ImprovisacionAvanzadaEnDiferentesGeneros);
        temasMap.put((Indice = Indice+1)+"- Polifonia Compleja Y Contrapunto Avanzado", informacion::PolifoniaComplejaYContrapuntoAvanzado);
        temasMap.put((Indice = Indice+1)+"- Teoria Del Jazz Y Armonia Extendida", informacion::TeoriaDelJazzYArmoniaExtendida);
        temasMap.put((Indice = Indice+1)+"- Teoria De La Armonia Extendida", informacion::TeoriaDeLaArmoniaExtendida);
        temasMap.put((Indice = Indice+1)+"- Teoria De Los Conjuntos Armónicos", informacion::TeoriaDeLosConjuntosArmónicos);
        temasMap.put((Indice = Indice+1)+"- Composicion Serial Y Aleatoria", informacion::ComposicionSerialYAleatoria);
        temasMap.put((Indice = Indice+1)+"- Composicion Serial Y Muzica Aleatoria", informacion::ComposicionSerialYMuzicaAleatoria);
        temasMap.put((Indice = Indice+1)+"- Musica Minimalista Y Su Impacto", informacion::MusicaMinimalistaYSuImpacto);
        temasMap.put((Indice = Indice+1)+"- Estilos Musicales Contemporaneos", informacion::EstilosMusicalesContemporaneos);
        temasMap.put((Indice = Indice+1)+"- Sistemas De Notacion Alternativa", informacion::SistemasDeNotacionAlternativa);
        temasMap.put((Indice = Indice+1)+"- Policoralidad Y Multitonalidad", informacion::PolicoralidadYMultitonalidad);
        temasMap.put((Indice = Indice+1)+"- Interaccion Entre Musica Y Tecnologia", informacion::InteraccionEntreMusicaYTecnologia);
        temasMap.put((Indice = Indice+1)+"- Musicologia Y Contexto Historico", informacion::MusicologiaYContextoHistorico);
        temasMap.put((Indice = Indice+1)+"- Estudios Sobre La Psicologia De La Musica", informacion::EstudiosSobreLaPsicologiaDeLaMusica);
        temasMap.put((Indice = Indice+1)+"- Oido Musical Y Absoluto", informacion::OidoMusicalYAbsoluto);
        // Tipos de Instrumento
        Indice = 0;
        temasMap.put("-- Tipos De Instrumentos --", informacion::TiposDeInstrumentos);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Teclado", informacion::EjemplosDeInstrumentosDeTeclado);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Cuerda", informacion::EjemplosDeInstrumentosDeCuerda);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Viento Madera", informacion::EjemplosDeInstrumentosDeVientoMadera);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Viento Metal", informacion::EjemplosDeInstrumentosDeVientoMetal);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Percusion Afinada", informacion::EjemplosDeInstrumentosDePercusionAfinada);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos De Percusion No Afinada", informacion::EjemplosDeInstrumentosDePercusionNoAfinada);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos Electroacusticos", informacion::EjemplosDeInstrumentosElectroacusticos);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos Digitales", informacion::EjemplosDeInstrumentosDigitales);
        temasMap.put((Indice = Indice+1)+"- Ejemplos De Instrumentos Experimentales", informacion::EjemplosDeInstrumentosExperimentales);
        temasMap.put("-- Carta --", informacion::Carta);

        for (String tema : temasMap.keySet()) {
            CmbIndex.addItem(tema);
            //System.out.println(tema);
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
