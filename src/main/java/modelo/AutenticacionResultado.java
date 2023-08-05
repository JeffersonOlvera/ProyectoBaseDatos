package modelo;

public class AutenticacionResultado {

    private int idUsuario;
    private String tipoUsuario = "";

    public AutenticacionResultado(int idUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
