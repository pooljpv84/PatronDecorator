package p61.decorator_g4;

public class FiltroUbicacion extends FiltroDecorator
{


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    double lat;
    double longi;
    @Override
    public String[] filtrar(String[] vector)
    {
        String[] vectorX;
        vectorX = decorado.filtrar(vector);
        for(int i = 0; i < vectorX.length; i++){
            vectorX[i] = "Ubicacion entre:"+getLat() +" -- "+getLongi();
        }
       return vectorX;
    }

    public FiltroUbicacion(IFiltro decorado) {
        super(decorado);

    }

    public void setUbicacion(double lat, double longi)
    {
        this.lat = lat;
        this.longi = longi;
    }

    @Override
    public String toString() {
        return "FiltroUbicacion{" +
                "lat=" + lat +
                ", longi=" + longi +
                '}';
    }
}
