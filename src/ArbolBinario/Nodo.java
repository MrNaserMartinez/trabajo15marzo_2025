package ArbolBinario;

public class Nodo {

    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(int valor) {
        dato = valor;
        izdo = null;
    }
    public Nodo(Nodo ramaIzdo, int valor, Nodo ramadcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramadcho;
    }

    public Nodo(String nombre, String telefono) {
    }
    public int valorNodo() {
        return dato;
    }

    public Nodo GetSubarbolIzdo() {
        return izdo;
    }

    public Nodo GetSubarbolDcho() {
        return dcho;
    }

}