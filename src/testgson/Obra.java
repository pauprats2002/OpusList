/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgson;


/**
 *
 * @author DevMike
 */
public class Obra {

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImgen(String imagen) {
        this.imagen = imagen;
    }

    public Obra(String registre, String titol, String any, String format, String autor, String imagen) {
        this.registre = registre;
        this.titol = titol;
        this.any = any;
        this.format = format;
        this.autor = autor;
        this.imagen = imagen;
    }
    
    private String registre;
    private String titol;
    private String any;
    private String format;
    private String autor;
    private String imagen;

    @Override
    public String toString() {
        return registre + ": " + titol + ", " + any + " (" + format + "). " + autor + ", " + imagen; 
    }
    
    
}
