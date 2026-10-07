private class Main {
    private static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.nombre = "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo = false;

        dispositivo2.nombre = "Impresora";
        dispositivo2.tipo = "Periferico";
        //dispositivo2.activo = false;
        dispositivo2.activar();
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();

        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();
    }
}