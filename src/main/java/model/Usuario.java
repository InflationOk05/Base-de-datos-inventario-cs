package model;

public class Usuario {
    private String NombreUsuario;
    private String NombreSteam;
    private int IdSteam;
    private String TradeLink;

    public Usuario() {//no se para que pero se recomienda crearlo
    }
    public Usuario(String NombreUsuario, String NombreSteam, int IdSteam, String TradeLink){
        this.NombreUsuario=NombreUsuario;
        this.NombreSteam=NombreSteam;
        this.IdSteam=IdSteam;
        this.TradeLink=TradeLink;        
    }
        //getters y Setters
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getNombreSteam() {
        return NombreSteam;
    }

    public void setNombreSteam(String NombreSteam) {
        this.NombreSteam = NombreSteam;
    }

    public int getIdSteam() {
        return IdSteam;
    }

    public void setIdSteam(int IdSteam) {
        this.IdSteam = IdSteam;
    }

    public String getTradeLink() {
        return TradeLink;
    }

    public void setTradeLink(String TradeLink) {
        this.TradeLink = TradeLink;
    }
}
