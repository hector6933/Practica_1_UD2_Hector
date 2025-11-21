public class Figures {
// Clase figures
    public static char Asterisk = '*';

    public static void writeSquare(int a) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.printf("*");
            }

            System.out.println("");
        }
    }

    public static void writeSquare(int longitud, char caracter) {

        System.out.println("Figura del cuadrado");
        writeSquare(5);

    }

    public static void writeInvertedPyramid(int num) {

        System.out.println("Dibujo triángulo invertido");

    }

}