
package Modelo;

public class Empleado {
    //Atributos
        private String codigo;
        private String nombre;
        private int horas;
        private double tarifa;
        private double pago = 0;
        private Empleado sig, ant;
    
    //Metodos Contructor
    public Empleado(String codigo, String nombre, int horas, double tarifa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
        this.pago = this.horas * this.tarifa;
        this.sig = null;
        this.ant = null;
    }
    //metodos get and set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double getPago(){
        return pago;
    }

    public Empleado getSig() {
        return sig;
    }

    public void setSig(Empleado sig) {
        this.sig = sig;
    }

    public Empleado getAnt() {
        return ant;
    }

    public void setAnt(Empleado ant) {
        this.ant = ant;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    
}
