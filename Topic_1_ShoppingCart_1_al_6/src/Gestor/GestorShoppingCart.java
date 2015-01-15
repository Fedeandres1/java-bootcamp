/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Model.*;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederic
 */
public class GestorShoppingCart {

    // Todos estos datos vendrian de la Pantalla y los ingresaria el cliente, es para probar nomás
    private static int nroPedido;
    private double monto;
    private double[] montos;
    private String formaDePago = "CreditCard";
    private IStrategyPayment payment;
    private Product p = new Product();
    private Product p2 = new Product();
    private Product p3 = new Product();
    private Product p4 = new Product();
    private Date fecha = new Date("12/05/1990");
    private Pedido pedido;
    private DetallePedido[] detalle;
    private DetailOffer [] detalleOferta;
    private Offer oferta;

    //Con un metodo estaria mejr cargar los productos
    //Hay más clases que las que uso, las deje para el proyecto final
    public Pedido crearPedido() {
        calcularNumeroPedido();
        p.setNombre("Zapatilla");
        p.setDescripcion("roja");
        p.setPrice(125.8);
        p2.setNombre("Notebook");
        p2.setDescripcion("roja");
        p2.setPrice(1225.8);
        p3.setNombre("Pitter Pan");
        p3.setDescripcion("2dsa");
        p3.setPrice(1123321312.432);
        p4.setNombre("Zapatero");
        p4.setDescripcion("21dsa");
        p4.setPrice(12212125.2138);

        if (formaDePago.compareTo("CreditCard") == 0) {
            payment = new StrategyCreditCard("Pedro Picapiedra", 12543);

        } else {
            if (formaDePago.compareTo("Cash") == 0) {
                payment = new StrategyCash();
            } else {
                payment = new StrategyPayPal("Pedro_picapiedra@hotmail.com", "piedradura");

            }

        }
        detalle = new DetallePedido[4];

        detalle[0] = new DetallePedido(p, 1, 20);

        detalle[1] = new DetallePedido(p4, 2, 312);

        detalle[2] = new DetallePedido(p2, 3, 321);
        detalle[3] = new DetallePedido(p3, 4, 321321);
        montos = new double[detalle.length];
        for (int i = 0; i < detalle.length; i++) {

            montos[i] = detalle[i].getProducto().getPrice();

        }
        monto = payment.calDescountFormaPayment(montos);

        pedido = new Pedido(nroPedido, fecha, monto, detalle, payment);

        return pedido;
    }

    public Offer createOffer() { //these method is a test for prube the code of the offer and the point 5 of the topic
        p.setNombre("Mouse");
        p.setDescripcion("Negro");
        p.setPrice(50);
        p2.setNombre("Notebook");
        p2.setDescripcion("roja");
        p2.setPrice(1999);
        p3.setNombre("Pitter Pan");
        p3.setDescripcion("hola");
        p3.setPrice(1234);
        p4.setNombre("Zapatero");
        p4.setDescripcion("Si");
        p4.setPrice(1234);
        detalleOferta = new DetailOffer[4];
        detalleOferta[0] = new DetailOffer(p);
        detalleOferta[1] = new DetailOffer(p4);
        detalleOferta[2] = new DetailOffer(p2);
        detalleOferta[3] = new DetailOffer(p3);
        oferta = new Offer();
        oferta.setDetalleOferta(detalleOferta);
        oferta.setName("Promoción de Navidad");
        oferta.calcularPrecioOferta();
        
        
        
        
 return oferta;
    }

    public static void calcularNumeroPedido() {

        SingletonNumeroPedido single = null;
        single = single.getInstancia();
        nroPedido = single.getNumero();

    }

}
