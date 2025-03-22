package ArbolCedena;

public class Nodo {
    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(int valor) {
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo(int valor, Nodo izquierdo, Nodo derecho) {
        dato = valor;
        izdo = izquierdo;
        dcho = derecho;
    }

    // Operaciones de acceso
    public int valorNodo() {
        return dato;
    }

    public Nodo GetSubarbolIzdo() {
        return izdo;
    }

    public Nodo GetSubarbolDcho() {
        return dcho;
    }

    public void nuevoValor(int d) {
        dato = d;
    }

    public void ramaIzdo(Nodo n) {
        izdo = n;
    }

    public void ramaDcho(Nodo n) {
        dcho = n;
    }
}