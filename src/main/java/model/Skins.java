package model;
public class Skins {
    //atributos de las skins 
    private String Nombre;
    private String Estado;
    private String Calidad;
    private String Coleccion;
    private String Arma;
    private double NivelFloat;
    private double PrecioCompra;
    
    public Skins(String Nombre, String Estado, String Calidad, String Coleccion, String Arma, double NivelFloat, double PrecioCompra ){
        this.Nombre=Nombre;
        this.Estado=Estado;
        this.Calidad=Calidad;
        this.Coleccion=Coleccion;
        this.Arma=Arma;
        this.NivelFloat=NivelFloat; 
        this.PrecioCompra=PrecioCompra;       
    }
    //getter y setter de cada atributi
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public String getColeccion() {
        return Coleccion;
    }

    public void setColeccion(String Coleccion) {
        this.Coleccion = Coleccion;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    public double getNivelFloat() {
        return NivelFloat;
    }

    public void setNivelFloat(double Float) {
        this.NivelFloat = Float;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    
}

//     public void insertar(){
//         System.out.println("Ingrese el nombre de la skin");
//     }
// }
