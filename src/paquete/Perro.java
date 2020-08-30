package paquete;

public class Perro {

    private int codigo;
    private String nombreP;
    private String raza;
    private String localidad;
    private int cedula;
    private String nombreD;

    public Perro() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(nombreP);
        sb.append("\nCodigo: ");
        sb.append(codigo);
        sb.append("\nRaza: ");
        sb.append(raza);
        sb.append("\nLocalidad: ");
        sb.append(localidad);
        sb.append("\nCedula del dueño: ");
        sb.append(cedula);
        sb.append("\nNombre del dueño: ");
        sb.append(nombreD);
        return sb.toString();
    }

    void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
