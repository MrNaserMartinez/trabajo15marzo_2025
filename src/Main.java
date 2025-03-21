import ArbolBinario.Arbol;
import ArbolCedena.ArbolCadena;
import ArbolitoContactos.ArbolContactos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {

//    Arbol arbol = new Arbol();
//    arbol.insertar(1);
//    arbol.insertar(2);
//    arbol.insertar(3);
//    arbol.insertar(10);
//    arbol.insertar(15);
//    arbol.insertar(6);
//    arbol.insertar(8);
//    arbol.insertar(5);
//    arbol.insertar( 11);
//    System.out.println("fin");

//    ArbolCadena ar = new ArbolCadena();
//    ar.insertar("Farore");
//    ar.insertar("Impa");
//    ar.insertar("Navi");
//    ar.insertar("Zelda");
//    ar.insertar("Link");
//    ar.insertar("Ganon");
//
//    System.out.println("Recorrido inorden:");

    ArbolContactos arbol = new ArbolContactos();

    arbol.insertar("Farore", "123456789");
    arbol.insertar("Impa", "987654321");
    arbol.insertar("Navi", "555555555");
    arbol.insertar("Zelda", "111111111");
    arbol.insertar("Link", "999999999");
    arbol.insertar("Ganon", "000000000");

    String telefono = arbol.buscarTelefono("Navi");
    if (telefono != null) {
        System.out.println("Teléfono de Navi: " + telefono);
    } else {
        System.out.println("Navi no está en el árbol.");
    }
}



}
