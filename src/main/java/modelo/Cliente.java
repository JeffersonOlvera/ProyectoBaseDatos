package modelo;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private ArrayList historialEnvios = new ArrayList();

    /**
     * @return the historialEnvios
     */
    public ArrayList getHistorialEnvios() {
        return historialEnvios;
    }

    /**
     * @param historialEnvios the historialEnvios to set
     */
    public void setHistorialEnvios(ArrayList historialEnvios) {
        this.historialEnvios = historialEnvios;
    }

}
