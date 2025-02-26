public class punto8
{
    public void EstanteriaP8 (int d)
    {
        metodos m = new metodos();
        objEstanteriap8 ob = new objEstanteriap8();
        objEstanteriap8[][] ma = ob.llenarMatrP8(d);
        objEstanteriap8[] vectUni = m.CategoriasUnicasTienda(ma);
        m.matrizXCategorias(ma, vectUni);
    }
}