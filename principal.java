import java.util.Scanner;
public class principal
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int opt =0, d = 0;
        boolean continua = true;//BANDERA
        while (continua) 
        { 
            System.out.println("Ingrese la opción " +"\n" +
           "a continuación los puntos as validar" + "\n" + 
           "1: Mostrar la ubicación fila columna del producto" +"\n" +
           "2: Mostrar la cantidad de inventario en una tienda " + "\n" +
           "3: Mostrar precio más alto de una libreria " + "\n"+
           "4: Mostrar ordenado asientos de un teatro" + "\n");
            
            while (!sc.hasNextInt()) 
            {
               System.out.println("Dato incorrecto, intente con otra opcion");
               sc.next(); 
            }
            opt =sc.nextInt();
            System.out.println("Ingrese la dimesion de la matriz");
            d = sc.nextInt();

            switch (opt) 
            {
                case 1:
                    System.out.println("Es el punto 1");
                    punto1 p1 = new punto1();
                    p1.punto1buscProd(d);
                    break;
                case 2:
                    System.out.println("Es el punto 2");
                    punto2 p2 = new punto2();
                    p2.punto2SumCant(d);
                    break;
                case 3:
                    System.out.println("Es el punto 3");
                    punto3 p3 = new punto3();
                    p3.punto3Libros(d);
                    break;
                case 4: 
                    System.out.println("Es el punto 4");
                    punto4 p4 = new punto4();
                    p4.punto4Teatro();
                    break;
                case 5:
                    System.out.println("Es el punto 5");
                    punto5 p5 = new punto5();
                    p5.punto5Tiendas(d);
                    break;
                case 6:
                    System.out.println("Es el punto 6");
                    punto6 p6 = new punto6();
                    p6.punto6SuperMec(d);
                    break;
                default:
                    System.out.println("Pagina en mantenimiento ");
                    continua = false;//BANDERA
                break;
            }
        }
        
    }
}