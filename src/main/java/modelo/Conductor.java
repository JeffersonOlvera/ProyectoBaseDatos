
package modelo;

public class Conductor extends Cliente{

    private String modeloCamion = "";
    private String numPlaca = "";
    
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
   
}

