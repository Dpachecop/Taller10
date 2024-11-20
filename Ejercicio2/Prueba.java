package Taller10.Ejercicio2;

public class Prueba {
   
        public static void main(String[] args) {
           
            Vehiculo vehiculo = new Vehiculo();
            System.out.println("Movimiento del Vehículo:");
            vehiculo.moverse();
    
            System.out.println();
    
           
            Vehiculo bicicleta = new Bicicleta(); 
            System.out.println("Movimiento de la Bicicleta:");
            bicicleta.moverse();
        }
    
    
}
