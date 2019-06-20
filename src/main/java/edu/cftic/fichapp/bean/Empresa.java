package edu.cftic.fichapp.bean;

import java.io.Serializable;

public class Empresa implements Serializable {
    private int id_empresa;
    private String cif;
    private String nombre_empresa;
    private String responsable;
    private String email;
    private String rutalogo;

    public Empresa() {
    }

    public Empresa(String cif, String nombre_empresa, String responsable, String email, String rutalogo) {
        this.cif = cif;
        this.nombre_empresa = nombre_empresa;
        this.responsable = responsable;
        this.email = email;
        this.rutalogo = rutalogo;
    }

    public Empresa(int id_empresa, String cif, String nombre_empresa, String responsable, String email, String rutalogo) {
        this.id_empresa = id_empresa;
        this.cif = cif;
        this.nombre_empresa = nombre_empresa;
        this.responsable = responsable;
        this.email = email;
        this.rutalogo = rutalogo;

    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRutalogo() {
        return rutalogo;
    }

    public void setRutalogo(String rutalogo) {
        this.rutalogo = rutalogo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id_empresa=" + id_empresa +
                ", cif='" + cif + '\'' +
                ", nombre_empresa='" + nombre_empresa + '\'' +
                ", responsable='" + responsable + '\'' +
                ", email='" + email + '\'' +
                ", rutalogo='" + rutalogo + '\'' +
                '}';
    }
}
