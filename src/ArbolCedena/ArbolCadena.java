//package ArbolCedena;
//
//public class ArbolCadena {
//
//    private Nodo raiz;
//
//    public ArbolCadena() {
//        this.raiz = null;
//    }
//
////    public void insertar(String dato) {
////        if (this.raiz == null) {
////            this.raiz = new Nodo(dato);
////        } else {
////            this.insertar(this.raiz, dato);
////        }
////    }
//
//    private void insertar(Nodo padre, String dato) {
//        if (dato.compareTo(padre.valorNodo()) < 0) {
//            if (padre.getSubarbolIzdo() == null) {
//                padre.izdo = new Nodo(dato);
//            } else {
//                insertar(padre.izdo, dato);
//            }
//        } else if (dato.compareTo(padre.valorNodo()) > 0) {
//            if (padre.getSubarbolDcho() == null) {
//                padre.dcho = new Nodo(dato);
//            } else {
//                insertar(padre.dcho, dato);
//            }
//        }
//    }
//}