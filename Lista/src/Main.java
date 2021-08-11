public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista.estaVacia());
        System.out.println(lista.tamano());


        for(int i=1; i<=11; i++)
        {
            lista.insertarFin(i);
        }
        lista.mostrarCircularAdelante(1);
        lista.mostrarReverso(1);


    }
}
