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
public class DetailOffer {
    private Product producto;
    
    public DetailOffer() {
    }

    public DetailOffer(Product producto) {
        this.producto = producto;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return producto.getNombre()+"...$"+producto.getPrice();
    }

    
    
    
    
    
    
    
    
    
    
    
}
