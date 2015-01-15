/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Frederic
 */
public class Pedido {
    private int numero;
    private Date fechaPedido;
    private double monto;
    private DetallePedido []detalle;
    private IStrategyPayment formaPago;

    public Pedido(int numero, Date fechaPedido, double monto, DetallePedido[] detalle, IStrategyPayment formaPago) {
        this.numero = numero;
        this.fechaPedido = fechaPedido;
        this.monto = monto;
        this.detalle = detalle;
        this.formaPago = formaPago;
    }

    public Pedido() {
    }

    public int getNumero() {
        return numero;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public double getMonto() {
        return monto;
    }

    public DetallePedido[] getDetalle() {
        return detalle;
    }

    public IStrategyPayment getFormaPago() {
        return formaPago;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setDetalle(DetallePedido[] detalle) {
        this.detalle = detalle;
    }

    public void setFormaPago(IStrategyPayment formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        StringBuilder factura=new StringBuilder();
        factura.append("Numero: "+this.numero+"\n");
        factura.append("Detalle:\n");
        for( int i=0;i<detalle.length;i++){
         factura.append(detalle[i].getProducto().getNombre()+"...$"+detalle[i].getProducto().getPrice()+"\n");
         
        
        }
        factura.append("Total: "+this.getMonto()+"\n"+"\n");
        
        return factura.toString();
    }
    
    
}
