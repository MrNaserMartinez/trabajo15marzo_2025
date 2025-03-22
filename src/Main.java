import ArbolBinario.Arbol;
import ArbolBinario.Arbol;
import ArbolitoContactos.ArbolContactos;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Insertar los valores como en tu imagen
        arbol.insertar(4);
        arbol.insertar(2);
        arbol.insertar(6);
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(5);
        arbol.insertar(7);

        System.out.println("Árbol creado exitosamente!\n");

        // Mostrar recorridos como en tu imagen
        arbol.postorden();  // 1,3,2,5,7,6,4
        arbol.inorden();    // 1,2,3,4,5,6,7

        // Visualizar el árbol estéticamente en la consola
        System.out.println("\nVisualizando el árbol:");
        arbol.visualizarArbol();
    }
}