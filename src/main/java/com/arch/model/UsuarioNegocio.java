package com.arch.model;

public class UsuarioNegocio {
    
    //Método para validar si el usuario es mayor de edad
    public boolean esMayorDeEdad(Usuario usuario){
        return usuario.getEdad() >= 18;  //true false
    }

    //Metodo para registrar un usuario válido
    public String registrarUsuario(Usuario usuario){
        if(esMayorDeEdad(usuario)){
            return "El usuario " + usuario.getNombre() + " ha sido registrado correctamente ";
        }
        else{
            return "El usuario " + usuario.getNombre() + " es menor de edad y no puede ser registrado";
        }
    }
}
