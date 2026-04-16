public class Producto {

    static String tienda = "Lideratec Market";

    String nombre;
    double precio;
    int stock =100;
    boolean disponible = true;
    char categoria = 'A';

    Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarNombre() {
        System.out.println(nombre );
    }

    void validarStock(){
        int nuevaStock = stock - 20;
        System.out.println(nuevaStock);
    }


    void mostrarPrecio(){
        System.out.println(this.precio);
    }


    void mostrarCategoria(){
        System.out.println(this.categoria);
    }

}

