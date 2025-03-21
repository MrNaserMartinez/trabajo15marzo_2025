# Proyecto: Árbol de Contactos 🌳📞

## Descripción General 📄
Este proyecto implementa un **árbol binario de búsqueda (BST)** en Java para gestionar contactos. Cada contacto se almacena con un **nombre** y un **número de teléfono**, organizándose automáticamente en el árbol según el orden alfabético del nombre.

---

## Características Principales ✨

### 1. Inserción de Contactos 📥
- Los contactos se insertan en el árbol manteniendo un orden alfabético.
- Si el árbol está vacío, el primer contacto se convierte en la raíz.
- Si no, se coloca en la posición correcta (izquierda si el nombre es "menor", derecha si es "mayor").

### 2. Búsqueda de Contactos 🔍
- Permite buscar un contacto por su nombre.
- Devuelve el número de teléfono si el nombre existe.
- Devuelve `null` si el nombre no se encuentra.

### 3. Estructura del Árbol 🌿
- Cada nodo (`NodoContactos`) almacena un nombre, un teléfono y referencias a sus subárboles izquierdo y derecho.
- El árbol mantiene un orden alfabético para una búsqueda eficiente.

### 4. Métodos Implementados ⚙️
- **`insertar`**: Añade un nuevo contacto al árbol.
- **`buscarTelefono`**: Busca un contacto por nombre y devuelve su teléfono.

---

## Próximos Pasos (Opcional) 🚀
- Implementar recorridos del árbol (inorden, preorden, postorden).
- Agregar funcionalidad para eliminar contactos.
- Validar entradas para evitar datos vacíos o incorrectos.

---

¡Un proyecto ideal para gestionar contactos de manera eficiente y organizada! 📚✨
