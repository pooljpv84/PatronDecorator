package p61.decorator_g4;

public class FiltroPrecio extends FiltroDecorator
{
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    int max;
    int min;
    @Override
    public String[] filtrar(String[] vector)
    {
        String[] vectorX;
        vectorX = decorado.filtrar(vector);
        for(int i = 0; i < vectorX.length; i++){
            vectorX[i] = "Rango entre:"+getMin() +" -- "+getMax() + '\'' +
                    ", decorado=" + decorado +
                    '}';
        }
       return vectorX;
    }

    public FiltroPrecio(IFiltro decorado) {
        super(decorado);

    }

    public void setRango(int max, int min)
    {
        this.max = max;
        this.min = min;
    }

    @Override
    public String toString() {
        return "FiltroPrecio{" +
                "min=" + min + ", max=" + max +
                ", decorado=" + decorado +
                '}';
    }
}
