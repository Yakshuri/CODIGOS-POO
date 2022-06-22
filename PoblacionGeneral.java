package herencia;

public abstract class PoblacionGeneral {

    protected float poblacionDelPais;
    protected float tasaCrecimiento;
    protected float tasaMuertes;
    protected float crecimientoUnAnio;
    protected float crecimientoDosAnios;
    protected float crecimientoTresAnios;

    protected PoblacionGeneral(float poblacionDelPais, float tasaCrecimiento) {
        this.poblacionDelPais = poblacionDelPais;
        this.tasaCrecimiento = tasaCrecimiento;
    }

    public abstract double calcularPoblacionUnAnio();

    public abstract double calcularPoblacionDosAnios();

    public abstract double calcularPoblacionTresAnios();

    public float getCrecimientoUnAnio() {
        return crecimientoUnAnio;
    }

    public float getCrecimientoDosAnios() {
        return crecimientoDosAnios;
    }

    public float getCrecimientoTresAnios() {
        return crecimientoTresAnios;
    }
}
