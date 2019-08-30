package Restaurante_UML;

public class Motivo {
    private String nombreMotivo;
    private String descripcionMotivo;

    public String getNombreMotivo() {
        return nombreMotivo;
    }

    public String getDescripcionMotivo() {
        return descripcionMotivo;
    }

    public void setNombreMotivo(String nombreMotivo) {
        this.nombreMotivo = nombreMotivo;
    }

    public void setDescripcionMotivo(String descripcionMotivo) {
        this.descripcionMotivo = descripcionMotivo;
    }

    public Motivo(String nombreMotivo, String descripcionMotivo) {
        this.nombreMotivo = nombreMotivo;
        this.descripcionMotivo = descripcionMotivo;
    }
}
