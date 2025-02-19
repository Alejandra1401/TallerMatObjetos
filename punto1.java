import java.util.Scanner;

public class punto1 
{
    Scanner sc = new Scanner(System.in);
    public void punto1buscProd(int d)
    {
        String nomProdBusc = "";
        metodos m = new metodos();
        objProducto[][] mat = new objProducto[d][d];
        mat = m.llenarMatrProd(d);
        m.mostrarMatObjeto(mat);
        System.out.println("Nombre del producto que desea buscar");
        nomProdBusc= sc.nextLine();
        m.encontrarProd(mat, nomProdBusc);

    }
    
    
}
