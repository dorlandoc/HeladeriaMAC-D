/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author marii
 */
public class Pedido {
  private int ncliente;
  private Date fecha;
  private int cantidad;
  private String tipoprod;
  private String tipoentr;
  private int codconfirmacion;

    public Pedido() {
    }

    public Pedido(int ncliente, Date fecha, int cantidad, String tipoprod, String tipoentr, int codconfirmacion) {
        this.ncliente = ncliente;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoprod = tipoprod;
        this.tipoentr = tipoentr;
        this.codconfirmacion = codconfirmacion;
    }

    /**
     * @return the ncliente
     */
    public int getNcliente() {
        return ncliente;
    }

    /**
     * @param ncliente the ncliente to set
     */
    public void setNcliente(int ncliente) {
        this.ncliente = ncliente;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipoprod
     */
    public String getTipoprod() {
        return tipoprod;
    }

    /**
     * @param tipoprod the tipoprod to set
     */
    public void setTipoprod(String tipoprod) {
        this.tipoprod = tipoprod;
    }

    /**
     * @return the tipoentr
     */
    public String getTipoentr() {
        return tipoentr;
    }

    /**
     * @param tipoentr the tipoentr to set
     */
    public void setTipoentr(String tipoentr) {
        this.tipoentr = tipoentr;
    }

    /**
     * @return the codconfirmacion
     */
    public int getCodconfirmacion() {
        return codconfirmacion;
    }

    /**
     * @param codconfirmacion the codconfirmacion to set
     */
    public void setCodconfirmacion(int codconfirmacion) {
        this.codconfirmacion = codconfirmacion;
    }
}
