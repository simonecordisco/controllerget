//Scrivi una applicazione web Spring Boot che alla endpoint GET v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON formato cosi:
//
//{
//    "nome": "Giuseppe",
//    "provincia": "Lombardia",
//    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
//}


package com.example.get;

public class Users {
    public String nome;
    public String provincia;
    public String saluto;

    public Users(String nome, String provincia,String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto=saluto;
    }


}
