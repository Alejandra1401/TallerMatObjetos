import java.util.Scanner;

public class punto5 
{
    public void punto5Tiendas(int d)
    {
        metodos m = new metodos();
        objTiendas o = new objTiendas();
        Scanner sc = new Scanner(System.in);
        int f1 = 0, c1 = 0, f2 = 0, c2 = 0;
        System.out.println("Ingrese las filas de la matriz 1: ");
        f1 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 1:");
        c1 = sc.nextInt();
        System.out.println("Ingrese las filas de la matriz 2: ");
        f2 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 2:");
        c2 = sc.nextInt();
        objTiendas [][] M1 = new objTiendas[f1][c1];
        objTiendas[][] M2 = new objTiendas[f2][c2];
        M1 = o.llenarMatrizTiendasp5(f1, c1);
        M2 = o.llenarMatrizTiendasp5(f2, c2);
        if ((M1.length * M1[0].length) > (M2.length * M2[0].length)) 
        {
            M1 = o.SumarStock(M1, M2);
            o.MostrarMatrizObjPunto5(M1);
        }
        else if ((M1.length * M1[0].length) < (M2.length * M2[0].length)) 
        {
            M2 = o.SumarStock(M1, M2);
            o.MostrarMatrizObjPunto5(M2);
        }
        else 
        {
            M1 = o.SumarStock(M1, M2);
            o.MostrarMatrizObjPunto5(M1);
        }
        
    }
    
}
