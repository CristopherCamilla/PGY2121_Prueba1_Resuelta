package DuocUC.DTO;

import java.text.NumberFormat;

public class ClubDeportivo {
    private static int Correlativo = 10;

    private String Rol_ID;
    private String Nombre;
    private String Fundador;
    private int AnioFundacion;
    private String Pais;
    private String Lema;
    private String Colores;
    private int ValorSuscripcion;

    public ClubDeportivo() {
        this.Rol_ID = "";
        this.Nombre = "";
        this.Fundador = "";
        this.AnioFundacion = 0;
        this.Pais = "";
        this.Lema = "";
        this.Colores = "";
        this.ValorSuscripcion = 0;
    }

    public String getRol_ID() {
        if(!this.Nombre.isEmpty())
        {
            Rol_ID = (this.Nombre.substring(0, 2).toUpperCase())
                +"H"
                +(++Correlativo);
            return Rol_ID;
        }
        return "SIN ROL VÁLIDO";
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getFundador() {
        return Fundador;
    }
    public void setFundador(String fundador) {
        Fundador = fundador;
    }
    public int getAnioFundacion() {
        return AnioFundacion;
    }
    public void setAnioFundacion(int anioFundacion) {
        AnioFundacion = anioFundacion;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
    public String getLema() {
        return Lema;
    }
    public void setLema(String lema) {
        Lema = lema;
    }
    public String getColores() {
        return Colores;
    }
    public void setColores(String colores) {
        Colores = colores;
    }
    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }
    public void setValorSuscripcion(int valorSuscripcion) {
        ValorSuscripcion = valorSuscripcion;
    }

    @Override
    public String toString(){
        NumberFormat valorFormateado = NumberFormat.getCurrencyInstance();
        return this.getRol_ID() + " " + valorFormateado.format(this.ValorSuscripcion);
    }
}