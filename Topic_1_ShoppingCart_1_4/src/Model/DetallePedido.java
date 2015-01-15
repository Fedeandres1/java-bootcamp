/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Frederic
 */
public class DetallePedido {
    private Product producto;
    private int quantity;
    private double price;

    public DetallePedido(Product producto, int quantity, double price) {
        this.producto = producto;
        this.quantity = quantity;
        this.price = price;
    }

    public DetallePedido() {
    }
   
    public Product getProducto() {
        return producto;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
}
