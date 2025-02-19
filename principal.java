import java.util.Scanner;
public class principal
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int opt =0, d = 0;
        System.out.println("Ingrese el punto que desea visualizar");
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
            default:
            System.out.println("Pagina en mantenimiento ");
                break;
        }
        
    }
}