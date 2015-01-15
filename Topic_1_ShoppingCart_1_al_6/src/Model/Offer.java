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
public class Offer {
//this is a offer, its has a array of detailOffer where you have the price and the other atribute of the product
    // the name of the offer and the price final of the offer.
    //The method toString() is like : Offer name ...$price
    //and then the detailOffer llike : Product name...$price
    private Offer oferta[];
    private String name;
    private DetailOffer[] detalleOferta;
    private double precioOferta=0;

    public Offer(Offer[] oferta, String name, DetailOffer[] detalleOferta, double precioOferta) {
        this.oferta = oferta;
        this.name = name;
        this.detalleOferta = detalleOferta;
        this.precioOferta = precioOferta;
    }

    public Offer() {
    }

    public Offer[] getOferta() {
        return oferta;
    }

    public String getName() {
        return name;
    }

    public DetailOffer[] getDetalleOferta() {
        return detalleOferta;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setOferta(Offer[] oferta) {
        this.oferta = oferta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetalleOferta(DetailOffer[] detalleOferta) {
        this.detalleOferta = detalleOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    @Override
    public String toString() {
       StringBuilder respuesta = new StringBuilder();
       respuesta.append("La Oferta "+name+"...$"+precioOferta+"\n");
       for(int i =0 ;i<detalleOferta.length;i++){
       respuesta.append(detalleOferta[i].toString()+"\n");
       }
       
       return respuesta.toString();
    }

    public void calcularPrecioOferta() {
        // Se podria calcularAlgun precio distinto que a la suma de los precios de los productos
        for (int i = 0; i < detalleOferta.length; i++) {
            precioOferta = precioOferta + detalleOferta[i].getProducto().getPrice();
        }
    }
    

}
