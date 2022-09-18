package DuocUC.DTO;

import java.util.Date;

public class Usuario {
    private int ID;
    private String Nombre;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Password;

    public Usuario() {
        this.ID = 0;
        this.Nombre = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = 0;
        this.Email = "";
        this.NombreUsuario = "";
        this.Password = "";
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getRut() {
        return Rut;
    }
    public void setRut(int rut) {
        Rut = rut;
    }
    public String getDv() {
        return Dv;
    }
    public void setDv(String dv) {
        Dv = dv;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}