import java.util.Scanner;

public class metodos 
{
    Scanner sc = new Scanner(System.in);
    public objProducto[][] llenarMatrProd(int d)
    {
        Scanner sc = new Scanner(System.in);
        objProducto[][] matProd = new objProducto[d][d];
        for (int i = 0; i < matProd.length; i++) 
        {
            for (int j = 0; j < matProd.length; j++) 
            {
                objProducto obj = new objProducto(); //Siempre se crea y se pregunda dentro del for interno para que me llene y se renueve para la sgtre persona
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad de productos ");
                obj.setCantidad(sc.nextInt());
                matProd[i][j] = obj;
            }
        }
        return matProd;
    }
    public objProducto[][] llenarMatrProdPunto2(int d)
    {
        
        objProducto[][] matProd = new objProducto[d][d];
        for (int i = 0; i < matProd.length; i++) 
        {
            for (int j = 0; j < matProd.length; j++) 
            {
                objProducto obj = new objProducto(); //Siempre se crea, no olvidar colocarlo 
                System.out.println("Ingrese la cantidad de productos ");
                obj.setCantidad(sc.nextInt());
                matProd[i][j] = obj;
            }
        }
        return matProd;
    }
    public void mostrarMatObjPunto2(objProducto[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Cantidad:" + m[i][j].getCantidad());
                System.out.println("\n");
            }
        }
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
    public int sumarMatriz (objProducto[][] ma)
    {
        int acumProd= 0;
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[0].length; j++) 
            {
                acumProd += ma[i][j].getCantidad(); 
            }
        }
        return acumProd;
    }
    public ObjLibreriap3[][] llenarMatPunto3(ObjLibreriap3[][] ma)
    {
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                ObjLibreriap3 obj = new ObjLibreriap3(); //Siempre se crea y se pregunda dentro del for interno para que me llene y se renueve para la sgtre persona
                System.out.println("Ingrese el titulo del libro ");
                obj.setAutor(sc.next());
                System.out.println("Ingrese el autor del libro");
                obj.setAutor(sc.next());
                System.out.println("Ingrese el precio del libro ");
                obj.setPrecio(sc.nextInt());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public void mostrarMatLibP3(ObjLibreriap3[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Titulo del libro:" + m[i][j].getTitulo());
                System.out.println("Autor del libro:" + m[i][j].getAutor());
                System.out.println("Precio del libro:" + m[i][j].getPrecio());
                System.out.println("\n");
            }
        }
    }
    public ObjLibreriap3 mayorlibro(ObjLibreriap3[][] m)
    {
        ObjLibreriap3 precMay =m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                if( m[i][j].getPrecio() > precMay.getPrecio())
                {
                    precMay = m[i][j];
                }
            }
        }
        return precMay;
    }
}
