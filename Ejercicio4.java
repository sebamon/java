public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 0;

        if(numero==0){
            System.out.println("El Numero es 0");
        }else{
            if(numero>0){
                System.out.println("El Numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
        }    
        
        /* --------------------- */
        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println("Numero While: "+numeroWhile);
            numeroWhile++;

        }

         /* --------------------- */
        int numeroDoWhile=3;
         do{
            System.out.println("Numero DoWhile: "+numeroDoWhile);
            numeroDoWhile++;
         }while(numeroDoWhile<3);

          /* --------------------- */

          for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("Numero For: "+numeroFor);
          }

          /* --------------------- */
          String estacion="otoño";

          switch(estacion){
            case "primavera": System.out.println("La estación es primavera");break;
            case "verano" : System.out.println("La estación es verano");break;
            case "otoño" : System.out.println("La estación es otoño");break;
            case "invierno" : System.out.println("La estación es invierno");break;
            default : System.out.println("La estación es incorrecta");
          }


    }
}
