import java.util.Scanner;

public class objp10ofertaprod 
{
    Scanner sc = new Scanner(System.in);
    private String nombreprod;
    private boolean oferta;
    public objp10ofertaprod() {
    }
    public objp10ofertaprod(String nombreprod, boolean oferta) {
        this.nombreprod = nombreprod;
        this.oferta = oferta;
    }
    public String getNombreprod() {
        return nombreprod;
    }
    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }
    public boolean isOferta() {
        return oferta;
    }
    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
    public objp10ofertaprod[][] llenarMatrp10(int d)
    {
        
        objp10ofertaprod[][] matProd = new objp10ofertaprod[d][d];
        for (int i = 0; i < matProd.length; i++) 
        {
            for (int j = 0; j < matProd.length; j++) 
            {
                objp10ofertaprod obj = new objp10ofertaprod(); //Siempre se crea, no olvidar colocarlo 
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombreprod(sc.next());
                System.out.println("Ingrese si el producto esta en oferta(True o False) ");
                obj.setOferta(sc.nextBoolean());
                matProd[i][j] = obj;
            }
        }
        return matProd;
    }
    public void mostrarMatp10(objp10ofertaprod[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre del producto:" + m[i][j].getNombreprod());
                System.out.println("En oferta o no" + m[i][j].isOferta());
                System.out.println("\n");
            }
        }
    }
    public void cantProdenOferta (objp10ofertaprod[][] m)
    {
        int cont = 0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[i].length; j++) 
            {
                if( m[i][j].isOferta())//coge los true 
                                        //Contar los productos que no están en oferta
                                        // if (!productos[i][1].equalsIgnoreCase("si"))contadorNoOferta++; PARA MATRICES
                                        // if (!productos[i].isEnOferta()) PARA MATOBJETUALES 
                {
                    cont++;
                }
                
            }  
        }
        System.out.println("La cantidad de productos en oferta es " + cont);
    }
    
}
