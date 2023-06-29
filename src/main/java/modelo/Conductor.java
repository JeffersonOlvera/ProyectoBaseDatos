
package modelo;

import java.util.ArrayList;

public class Conductor extends Usuario{

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
     * @return the numPlaca
     */
    public String getNumPlaca() {
        return numPlaca;
    }

    /**
     * @param numPlaca the numPlaca to set
     */
    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
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
   
}

