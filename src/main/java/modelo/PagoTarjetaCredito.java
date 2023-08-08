package modelo;

public class PagoTarjetaCredito implements MetodoPago {
    boolean esTarjet;
    String nombre = "";
    String numeroTarjeta = "";
    String fechaVencimiento = "";
    String codigoSeguridad = "";

    public boolean isEsTarjet() {
        return esTarjet;
    }

    public void setEsTarjet(boolean esTarjet) {
        this.esTarjet = esTarjet;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    
    
    @Override
    public double realizarPago(double montoTotal) {
        
        return montoTotal;
    }

}
