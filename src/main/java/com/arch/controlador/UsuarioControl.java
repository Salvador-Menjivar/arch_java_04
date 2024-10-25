package com.arch.controlador;

import com.arch.model.Usuario;
import com.arch.model.UsuarioNegocio;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UsuarioControl implements Serializable {  
    private Usuario usuario = new Usuario();
    //SELECT PARA UN USUARIO EN ESPECIFICO
    //SELECT * FROM USUARIO WHERE ID_USUARIO = 1
    //usuario = se asignarian los datos que vengan de la base 

    private UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
    private String resultado = "";


    // Método para registrar el usuario
    public String registrarUsuario() {
        resultado = usuarioNegocio.registrarUsuario(usuario);  // Llama a la capa de negocio
        return "usuario";  // Redirige a la página resultado.xhtml
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para obtener el objeto Usuario
    public Usuario getUsuario() {
        return usuario;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}