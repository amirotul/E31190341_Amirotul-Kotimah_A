package com.example.tokooleh2.Model;

public class ModelData {
    String username, email, nama, password;
    public ModelData(){}

    public ModelData(String username, String nama, String password, String email) {
        this.username = username;
        this.email = email;
        this.nama = nama;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
