package DuocUC.DTO;

import java.time.Period;
import java.util.Date;
import java.time.LocalDate;

public class Usuario {
    private static int Correlativo = 1000;
    private int ID;
    private String Nombre;
    private int Rut;
    private String Dv;
    private LocalDate FechaNacimiento;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Password;

    public Usuario() {
        this.ID = 0;
        this.Nombre = "No válido";
        this.Rut = 0;
        this.Dv = "No válido";
        this.FechaNacimiento = LocalDate.now();
        this.Telefono = 0;
        this.Email = "No válido";
        this.NombreUsuario = "No válido";
        this.Password = "No válido";
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
        if(ID < 0){
            this.ID = 0;
        }
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
    public void setRut(int Rut, char Dv) {
        if(validaRut(Rut, Dv)){
            this.Rut = Rut;
            this.Dv = Dv + "";
        }
    }

    public String getDv() {
        return Dv;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        Period periodo = Period.between(LocalDate.now(), fechaNacimiento);
        if(periodo.getYears() > 18){
            FechaNacimiento = fechaNacimiento;
        }
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        String strTelefono = telefono +"";
        if(strTelefono.length() > 6 && strTelefono.startsWith("56")){
            Telefono = telefono;
        }
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        if(email.contains("@") ||email.contains(".com") || email.contains(".")){
            Email = email;
        }
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        if(nombreUsuario.length() >= 4){
            NombreUsuario = nombreUsuario;
        }
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        if(validaPassword(password)){
            Password = password;
        }
    }

    private boolean validaPassword(String password){
        boolean resultSimbolos = false;
        boolean resultMayuscula = false;
        boolean resultNumeros = false;

        if(password.length() < 6){
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                resultMayuscula = true;
            }
            else if(Character.isDigit(c)){
                resultNumeros = true;
            }
            else if(Character.isLowerCase(c)){
                // hacer nada
            }
            else{
                resultSimbolos = true;
            }
        }

        return resultSimbolos && resultMayuscula && resultNumeros;
    }

    public boolean validaRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}