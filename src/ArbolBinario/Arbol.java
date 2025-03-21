package ArbolBinario;

public class Arbol {

    private Nodo raiz;

    public Arbol(){
        this.raiz = null;
    }

    public void insertar(int dato){
        if(this.raiz == null){
            this.raiz = new Nodo(dato);
        }else {
            this.insertar(this.raiz,dato);
        }
    }

    private void insertar(Nodo padre, int dato){
        if (dato < padre.valorNodo()){
            if (padre.GetSubarbolIzdo() == null){
                padre.izdo = new Nodo(dato);
            }else{
                insertar(padre.izdo, dato);
            }
        }else if (dato > padre.valorNodo()){
            if (padre.GetSubarbolDcho() == null){
                padre.dcho = new Nodo(dato);
            }else{
                insertar(padre.dcho, dato);
            }
        }
    }
}
