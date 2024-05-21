package Clases;

import java.util.List;

public class Escala {
    private List<Nota> notas;
    private List<Integer> progresion;
    private String nombre;
    private int id;

    public Escala(List<Nota> notas, List<Integer> progresion, String nombre, int id) {
        this.notas = notas;
        this.progresion = progresion;
        this.nombre = nombre;
        this.id = id;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public List<Integer> getProgresion() {
        return progresion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
