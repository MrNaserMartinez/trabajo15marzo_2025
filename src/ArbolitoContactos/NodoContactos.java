package ArbolitoContactos;

import ArbolBinario.Nodo;

public class NodoContactos {

    protected String nombre;
    protected String telefono;
    protected NodoContactos izdo;
    protected NodoContactos dcho;

    public NodoContactos(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.izdo = null;
        this.dcho = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public NodoContactos getSubarbolIzdo() {
        return izdo;
    }

    public NodoContactos getSubarbolDcho() {
        return dcho;
    }
}