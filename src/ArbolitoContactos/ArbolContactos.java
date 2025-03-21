package ArbolitoContactos;

public class ArbolContactos {

    private NodoContactos raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insertar(String nombre, String telefono) {
        if (this.raiz == null) {
            this.raiz = new NodoContactos(nombre, telefono);
        } else {
            this.insertar(this.raiz, nombre, telefono);
        }
    }
    private void insertar(NodoContactos padre, String nombre, String telefono) {
        if (nombre.compareTo(padre.getNombre()) < 0) {
            if (padre.getSubarbolIzdo() == null) {
                padre.izdo = new NodoContactos(nombre, telefono);
            } else {
                insertar(padre.izdo, nombre, telefono);
            }
        } else if (nombre.compareTo(padre.getNombre()) > 0) {
            if (padre.getSubarbolDcho() == null) {
                padre.dcho = new NodoContactos(nombre, telefono);
            } else {
                insertar(padre.dcho, nombre, telefono);
            }
        }
    }

    public String buscarTelefono(String nombre) {
        return buscarTelefono(this.raiz, nombre);
    }

    private String buscarTelefono(NodoContactos nodo, String nombre) {
        if (nodo == null) {
            return null;
        }
        if (nombre.equals(nodo.getNombre())) {
            return nodo.getTelefono();
        } else if (nombre.compareTo(nodo.getNombre()) < 0) {
            return buscarTelefono(nodo.getSubarbolIzdo(), nombre);
        } else {
            return buscarTelefono(nodo.getSubarbolDcho(), nombre);
        }
    }
}