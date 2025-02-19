import java.util.Scanner;

public class metodos 
{
    public objProducto[][] llenarMatrProd(int d)
    {
        Scanner sc = new Scanner(System.in);
        objProducto[][] matProd = new objProducto[d][d];
        for (int i = 0; i < matProd.length; i++) 
        {
            for (int j = 0; j < matProd.length; j++) 
            {
                objProducto obj = new objProducto(); //Siempre se crea y se pregunda dentro del for interno para que me llene y se renueve para la sgtre persona
                System.out.println("Ingrese el nombre del producto " + (i+1));
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto "  + (i+1));
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad de productos "  + (i+1));
                obj.setCantidad(sc.nextInt());
                matProd[i][j] = obj;
            }
        }
        return matProd;
    }
    public void mostrarMatObjeto(objProducto[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre:" + m[i][j].getNombre());
                System.out.println("Precio:" + m[i][j].getPrecio());
                System.out.println("Cantidad:" + m[i][j].getCantidad());
                System.out.println("\n");
            }
        }
    }
    public void encontrarProd(objProducto[][] m, String nprod)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                if(m[i][j].getNombre().toLowerCase().equals(nprod.toLowerCase()))
                {
                    System.out.println("El producto se encuentra en la fila " + i + ", columna " + j);
                }
            }
        }
    }
}
