package modelo;

public class PagoTarjetaCredito implements MetodoPago {

    String nombre = "";
    String numeroTarjeta = "";
    String fechaVencimiento = "";
    String codigoSeguridad = "";

    @Override
    public double realizarPago(double montoTotal) {
        
        return montoTotal;
    }

}
