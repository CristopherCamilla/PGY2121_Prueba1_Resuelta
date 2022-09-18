package DuocUC.DTO;

import java.util.Date;

public class Suscripcion {
    private int Numero;
    private Date Fecha;
    private int Precio;
    private String Equipos;
    private Usuario Usuario;
    
    public Suscripcion() {
        this.Numero = 0;
        this.Fecha = new Date();
        this.Precio = 0;
        this.Equipos = "";
        this.Usuario = new Usuario();
    }

    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public String getEquipos() {
        return Equipos;
    }
    public void setEquipos(String equipos) {
        Equipos = equipos;
    }
    public Usuario getUsuario() {
        return Usuario;
    }
    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    public void agregarClub(ClubDeportivo cd){
        this.Precio += cd.getValorSuscripcion();
        if(!this.Equipos.isEmpty()){
            this.Equipos += "; ";
        }
        this.Equipos += cd.toString();
    }
}