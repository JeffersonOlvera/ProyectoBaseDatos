package modelo;

import java.util.ArrayList;

public class Conductor extends Usuario {

    private int ID;
    private String modeloCamion = "";
    private String numPlaca = "";
    private ArrayList historialEnvios = new ArrayList();
    private double calificacion;

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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
