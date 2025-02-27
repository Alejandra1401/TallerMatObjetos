import java.util.Scanner;

public class objVendedorAño 
{
    Scanner sc = new Scanner(System.in);
    private String nombrevendedor;
    private double valorventa;
    public objVendedorAño() {
    }
    
    public objVendedorAño(String nombrevendedor, double valorventa) {
        this.nombrevendedor = nombrevendedor;
        this.valorventa = valorventa;
    }
    public String getNombrevendedor() {
        return nombrevendedor;
    }
    public void setNombrevendedor(String nombrevendedor) {
        this.nombrevendedor = nombrevendedor;
    }
    
    public double getValorventa() {
        return valorventa;
    }

    public void setValorventa(double valorventa) {
        this.valorventa = valorventa;
    }

    public objVendedorAño[][] llenarMatrp9()
    {  
        int f ,c;
        System.out.println("Ingrese la cantidas de filas");
        f = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        c = sc.nextInt();
        objVendedorAño[][] ventas = new objVendedorAño[f][c + 1];
        for (int i = 0; i < ventas.length; i++) 
        {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1 ) + ":");
            String nombre = sc.next();//Guardamos el nombre en una variable 
            //Guardamos el nombre en la primera celda de la fila 
            ventas[i][0] = new objVendedorAño();
            ventas[i][0].setNombrevendedor(nombre);
            //Llenar las ventas(meses)
            for (int j = 0; j < ventas.length; j++) 
            {
                ventas[i][j] = new objVendedorAño();//crear un nuevo objeto para cada celda
                ventas[i][j].setNombrevendedor(nombre);//reasignamos el nombre en cada objeto
                System.out.println("Ingrese la venta del mes " + j );
                ventas[i][j].setValorventa(sc.nextDouble());
            }
        }
        return ventas;
    }
    public void sumaXFilasVentasYMayVendedor(objVendedorAño[][] ma )
    {
        double myventa = 0;
        String mayVendedor = "";
        for (int i = 0; i < ma.length; i++) 
        {
            double sumaVentas = 0;//Se inicializa aqui porque son las ventas de cada vendedor que va por filas 
            for (int j = 0; j < ma[i].length; j++) 
            {
                sumaVentas += ma[i][j].getValorventa();
            }
            if(sumaVentas > myventa)//Comparamos despues de haber echo la suma de cada fila
            {
                myventa = sumaVentas;
                mayVendedor = ma[i][0].getNombrevendedor();//toma la fila nada mas 
            } 
        }
        System.out.println("El vendedor " + mayVendedor + " fue el que mas vendio con: " + myventa );
    }
   
    
}
