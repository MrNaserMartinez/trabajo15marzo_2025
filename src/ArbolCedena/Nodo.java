package ArbolCedena;

public class Nodo {
    protected String dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(String valor) {
        dato = valor;
        izdo = null;
        dcho = null;
    }

    public Nodo(Nodo ramaIzdo, String valor, Nodo ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public String valorNodo() {
        return dato;
    }

    public Nodo getSubarbolIzdo() {
        return izdo;
    }

    public Nodo getSubarbolDcho() {
        return dcho;
    }
}

