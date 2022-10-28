package p61.decorator_g4;

public class FiltroProducto extends FiltroDecorator
{
    String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public FiltroProducto(IFiltro decorado) {
        super(decorado);
    }
    @Override
    public String[] filtrar(String[] vector) {
        String[] vectorX;
        vectorX = decorado.filtrar(vector);
        for(int i = 0; i < vectorX.length; i++){
            vectorX[i] = "Categoria: "+getCategoria()+ '\'' +
                    ", decorado=" + decorado +
                    '}';
        }
        return vectorX;
    }

    @Override
    public String toString() {
        return "FiltroProducto{" +
                "categoria='" + categoria + '\'' +
                ", decorado=" + decorado +
                '}';
    }
}
