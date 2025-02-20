public class punto3 
{
    public void punto3Libros(int d)
    {
        metodos m = new metodos();
        ObjLibreriap3[][] ma = new ObjLibreriap3[d][d];
        ma = m.llenarMatPunto3(ma);
        m.mostrarMatLibP3(ma);
        ObjLibreriap3 preciomy = m.mayorlibro(ma);
        System.out.println("El libro con el mayor precio es " + preciomy.getTitulo() + " con un precio de " + preciomy.getPrecio());
    }
    
    
}
