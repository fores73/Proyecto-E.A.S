/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modelo.dto;

/**
 *
 * @author 901540-g1
 */
public class Propietario {
    private String dispositivosIdDispositivo;
    private String usuarioNumeroDocumento;
    private String usuarioTipoDocumento;

    public Propietario() {
    }
    

    public String getDispositivosIdDispositivo() {
        return dispositivosIdDispositivo;
    }

    public void setDispositivosIdDispositivo(String dispositivosIdDispositivo) {
        this.dispositivosIdDispositivo = dispositivosIdDispositivo;
    }

    public String getUsuarioNumeroDocumento() {
        return usuarioNumeroDocumento;
    }

    public void setUsuarioNumeroDocumento(String usuarioNumeroDocumento) {
        this.usuarioNumeroDocumento = usuarioNumeroDocumento;
    }

    public String getUsuarioTipoDocumento() {
        return usuarioTipoDocumento;
    }

    public void setUsuarioTipoDocumento(String usuarioTipoDocumento) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
    }
    
    
    
}
