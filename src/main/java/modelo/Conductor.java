package modelo;

import java.util.ArrayList;

public class Conductor extends Usuario {

    private String modeloCamion = "";
    private String numPlaca = "";
    private ArrayList historialEnvios = new ArrayList();

    /**
     * @return the modeloCamion
     */
    public String getModeloCamion() {
        return modeloCamion;
    }

    /**
     * @param modeloCamion the modeloCamion to set
     */
    public void setModeloCamion(String modeloCamion) {
        this.modeloCamion = modeloCamion;
    }

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

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

}
