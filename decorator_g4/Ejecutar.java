package p61.decorator_g4;

public class Ejecutar
{
    public static void main(String[] args)
    {
    String [] vector = new String[2];
    Filtro objFiltro = new Filtro();
    FiltroUbicacion objUbicacion = new FiltroUbicacion(objFiltro);
    objUbicacion.setUbicacion(10.0, 15.545);
    FiltroPrecio objPrecio = new FiltroPrecio(objUbicacion);
    objPrecio.setRango(10,30);
    FiltroProducto objProducto = new FiltroProducto(objPrecio);
    objProducto.setCategoria("carros");
        String[] res= objProducto.filtrar(vector);


        for (String resp: res)
        {
            System.out.println("resultado Final: "+ resp);
        }

    }
}
