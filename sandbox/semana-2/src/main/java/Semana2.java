public class Semana2 {

    public static void main(String[] args) {

        Producto p = new Producto("Arroz", 25);

        p.mostrarNombre();
        p.validarStock();
        p.mostrarPrecio();
        p.mostrarCategoria();

        Producto p1 = new Producto("Papa", 40);
        p1.mostrarNombre();
        p1.validarStock();
        p1.mostrarPrecio();

        Producto p2 = new Producto("Camote",60);
        p2.mostrarNombre();
        p2.validarStock();
        p2.mostrarPrecio();


        Alumno a = new Alumno("Jhonatan", 50,18,10);
        a.calcularPromedio();

    }
}
