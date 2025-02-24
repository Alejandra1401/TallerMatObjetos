public class punto6 
{
    public void punto6SuperMec(int d)
    {
        objSuperMerc ob = new objSuperMerc();
        objSuperMerc[][] ma = ob.llenarMaSupMerc(d);
        ob.mostrarMatSupMerc(ma);
        objSuperMerc[][] maDispo = ob.matFiltradaDisp(ma);
        System.out.println("Productos disponibles");
        for (int i = 0; i < maDispo.length; i++) 
        {
            for (int j = 0; j < maDispo[i].length; j++) 
            {
                if(maDispo[i][j] != null)
                {
                    System.out.println("Nombre del producto: " + maDispo[i][j].getNombre());
                    System.out.println("Precio del producto: " + maDispo[i][j].getPrecio());
                    System.out.println("Disponible: " + maDispo[i][j].isDisponible());
                    System.out.println("\n");
                }
            }   
        }
    }
    
}
