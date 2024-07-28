public class LlamadasTelefonicas{
    private  int Clave;
    private  String Zona;
    private  double  Precio;

    public LlamadasTelefonicas(int Clave, String Zona, double Precio){
        this.Clave = Clave;
        this.Zona = Zona;
        this.Precio =  Precio;
    }

    public int getClave(){
        return Clave;
    }
    public void setClave (int Clave){
        this.Clave = Clave;
    }

    public String getZona(){
        return Zona;
    }
    public void setZona(String Zona){
        this.Zona = Zona;
    }

    public double  getPrecio(){
        return Precio;
    }
    public void setPrecio(double  Precio) {
        this.Precio= Precio;
    }
}