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

    //Metodo para recorrido en postorden
    public void postorden(){
        postorden(this.raiz);
    }

    private void postorden(Nodo nodo){
        if (nodo !=null){
            postorden(nodo.GetSubarbolDcho());
            postorden(nodo.GetSubarbolDcho());
            System.out.println(nodo.valorNodo());
        }
    }

    //metodo para recorrido en preorden
    public void preorden(){
        preorden(this.raiz);
    }

    private void preorden(Nodo nodo){
        if (nodo !=null){
            System.out.println(nodo.valorNodo()+ "");
            preorden(nodo.GetSubarbolIzdo());
            preorden(nodo.GetSubarbolDcho());
        }
    }

    public void inorden(){
        inorden(this.raiz);
    }

    private void inorden(Nodo nodo){
        if (nodo !=null){

            inorden(nodo.GetSubarbolIzdo());
            System.out.println(nodo.valorNodo() + "");
            inorden(nodo.GetSubarbolDcho());
        }
    }
}
