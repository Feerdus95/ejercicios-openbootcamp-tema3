public class Main {
    public static void main(String[] args) {
        /*Parte 1*/
        int num1 = 2;
        int num2 = 4;
        int num3 = 8;

        var resultado = suma_de_3(num1,num2,num3);
        System.out.print("El resultado de la suma de 3 números es: " +resultado);

        /*Parte 2*/
        Coche miCoche = new Coche();
        miCoche.ponerPuerta();
        System.out.println("\nLas puertas actuales del coche son: " +miCoche.puertas);

    }

    /*Función Parte 1*/
    public static int suma_de_3(int a,int b,int c){
        return a+b+c;
    }

}

/*Clase y Función Parte 2*/
class Coche {
    public int puertas = 2;

    public void ponerPuerta(){
        this.puertas++;
    }
}