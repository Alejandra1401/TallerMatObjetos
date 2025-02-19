public class punto2 
{
    public void punto2SumCant(int d)
    {
        metodos m = new metodos();
        objProducto[][] ma = new objProducto[d][d];
        ma = m.llenarMatrProdPunto2(d);
        m.mostrarMatObjPunto2(ma);
        int sumProduc = m.sumarMatriz(ma);
        System.out.println("La cantidad de productos es: " + sumProduc);
    }
    
}
