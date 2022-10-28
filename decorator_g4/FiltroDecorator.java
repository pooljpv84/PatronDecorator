package p61.decorator_g4;

public class FiltroDecorator implements IFiltro
{
    IFiltro decorado;

    public FiltroDecorator(IFiltro decorado) {
        this.decorado = decorado;
    }

    @Override
    public String[] filtrar(String[] vector)
    {
        return decorado.filtrar(vector);
    }
}
