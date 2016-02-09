/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modelo.dto;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ADSI - 901540
 */
public class RegistroEquipo {

    private Date fechaEntrada;
    private Time horaEntrada;
    private Date fechaSalida;
    private Time horaSalida;
    private int registroIdRegistro;
    private String propietarioDispositivoIdDispositivo;
    private long propietarioUsuarioNumeroDocumento;
    private String propietarioUsuarioTipoDocumento;

    public RegistroEquipo() {
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getRegistroIdRegistro() {
        return registroIdRegistro;
    }

    public void setRegistroIdRegistro(int registroIdRegistro) {
        this.registroIdRegistro = registroIdRegistro;
    }

    public String getPropietarioDispositivoIdDispositivo() {
        return propietarioDispositivoIdDispositivo;
    }

    public void setPropietarioDispositivoIdDispositivo(String propietarioDispositivoIdDispositivo) {
        this.propietarioDispositivoIdDispositivo = propietarioDispositivoIdDispositivo;
    }

    public long getPropietarioUsuarioNumeroDocumento() {
        return propietarioUsuarioNumeroDocumento;
    }

    public void setPropietarioUsuarioNumeroDocumento(long propietarioUsuarioNumeroDocumento) {
        this.propietarioUsuarioNumeroDocumento = propietarioUsuarioNumeroDocumento;
    }

    public String getPropietarioUsuarioTipoDocumento() {
        return propietarioUsuarioTipoDocumento;
    }

    public void setPropietarioUsuarioTipoDocumento(String propietarioUsuarioTipoDocumento) {
        this.propietarioUsuarioTipoDocumento = propietarioUsuarioTipoDocumento;
    }

}
