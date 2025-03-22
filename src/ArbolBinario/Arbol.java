package ArbolBinario;
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato < padre.valorNodo()) {
            if (padre.GetSubarbolIzdo() == null) {
                padre.izdo = new Nodo(dato);
            } else {
                insertar(padre.izdo, dato);
            }
        } else if (dato > padre.valorNodo()) {
            if (padre.GetSubarbolDcho() == null) {
                padre.dcho = new Nodo(dato);
            } else {
                insertar(padre.dcho, dato);
            }
        }
    }

    // Método para recorrido en postorden (CORREGIDO)
    public void postorden() {
        System.out.print("Postorden = ");
        postorden(this.raiz);
        System.out.println(); // Nueva línea al final
    }

    private void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.GetSubarbolIzdo()); // Primero izquierdo
            postorden(nodo.GetSubarbolDcho()); // Luego derecho
            System.out.print(nodo.valorNodo()); // Finalmente raíz

            // Agregar coma si no es el último nodo (raíz)
            if (nodo != this.raiz) {
                System.out.print(",");
            }
        }
    }

    // Método para recorrido en preorden
    public void preorden() {
        System.out.print("Preorden = ");
        preorden(this.raiz);
        System.out.println(); // Nueva línea al final
    }

    private void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valorNodo()); // Primero raíz

            // Agregar coma si tiene hijos
            if (nodo.GetSubarbolIzdo() != null || nodo.GetSubarbolDcho() != null) {
                System.out.print(",");
            }

            preorden(nodo.GetSubarbolIzdo());  // Luego izquierdo
            preorden(nodo.GetSubarbolDcho());  // Finalmente derecho
        }
    }

    // Método para recorrido en inorden
    public void inorden() {
        System.out.print("Inorden = ");
        inorden(this.raiz);
        System.out.println(); // Nueva línea al final
    }

    private void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.GetSubarbolIzdo());  // Primero izquierdo
            System.out.print(nodo.valorNodo()); // Luego raíz

            // Agregar coma si no es el último recorrido
            if (nodo.GetSubarbolDcho() != null || nodo != this.raiz) {
                System.out.print(",");
            }

            inorden(nodo.GetSubarbolDcho());  // Finalmente derecho
        }
    }

    // Obtener la altura del árbol
    private int obtenerAltura(Nodo nodo) {
        if (nodo == null) return 0;
        return Math.max(obtenerAltura(nodo.GetSubarbolIzdo()),
                obtenerAltura(nodo.GetSubarbolDcho())) + 1;
    }

    // Método para visualizar el árbol estéticamente en la consola
    public void visualizarArbol() {
        int altura = obtenerAltura(this.raiz);
        int anchura = (int)Math.pow(2, altura) * 2 - 1;

        String[][] matriz = new String[altura * 2][anchura];

        // Inicializar matriz con espacios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = " ";
            }
        }

        // Llenar la matriz con el árbol
        llenarMatriz(matriz, this.raiz, 0, anchura / 2, anchura / 4);

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            StringBuilder linea = new StringBuilder();
            for (int j = 0; j < matriz[0].length; j++) {
                linea.append(matriz[i][j]);
            }
            // Eliminar espacios en blanco al final de la línea
            System.out.println(linea.toString().replaceFirst("\\s+$", ""));
        }
    }

    private void llenarMatriz(String[][] matriz, Nodo nodo, int fila, int columna, int offset) {
        if (nodo == null) return;

        // Colocar el valor del nodo actual
        matriz[fila][columna] = "(" + nodo.valorNodo() + ")";

        if (nodo.GetSubarbolIzdo() != null) {
            // Calcular posición del hijo izquierdo
            int filaHijo = fila + 2;  // Dejar espacio para las líneas
            int columnaHijo = columna - offset;

            // Dibujar la línea diagonal hacia el hijo izquierdo
            matriz[fila + 1][columna - offset/2] = "/";

            // Dibujar el hijo izquierdo
            llenarMatriz(matriz, nodo.GetSubarbolIzdo(), filaHijo, columnaHijo, offset / 2);
        }

        if (nodo.GetSubarbolDcho() != null) {
            // Calcular posición del hijo derecho
            int filaHijo = fila + 2;  // Dejar espacio para las líneas
            int columnaHijo = columna + offset;

            // Dibujar la línea diagonal hacia el hijo derecho
            matriz[fila + 1][columna + offset/2] = "\\";

            // Dibujar el hijo derecho
            llenarMatriz(matriz, nodo.GetSubarbolDcho(), filaHijo, columnaHijo, offset / 2);
        }
    }
}