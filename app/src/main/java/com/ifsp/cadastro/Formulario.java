package com.ifsp.cadastro;

public class Formulario {

    private String name;
    private String phone;
    private String email;
    private boolean checkoutEmails;
    private String sexo;
    private String city;
    private String uf;

    public Formulario(String name, String phone, String email, boolean checkoutEmails, String sexo, String city, String uf) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.checkoutEmails = checkoutEmails;
        this.sexo = sexo;
        this.city = city;
        this.uf = uf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCheckoutEmails() {
        return checkoutEmails;
    }

    public void setCheckoutEmails(boolean checkoutEmails) {
        this.checkoutEmails = checkoutEmails;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "Nome='" + name + '\'' +
                ", Telefone='" + phone + '\'' +
                ", E-mail='" + email + '\'' +
                ", Checagem de E-mail=" + checkoutEmails +
                ", Sexo do Usuáio='" + sexo + '\'' +
                ", Didade='" + city + '\'' +
                ", Estado='" + uf + '\'' +
                '}';
    }
}
