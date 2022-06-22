package herencia;

public class PoblacionHerencia extends PoblacionGeneral{
    private float poblacionDelPais;

    protected PoblacionHerencia(float poblacionDelPais, float tasaCrecimiento) {
        super(poblacionDelPais, tasaCrecimiento);
        this.poblacionDelPais = poblacionDelPais;
        this.tasaCrecimiento = tasaCrecimiento;
        this.calcularPoblacionUnAnio();
        this.calcularPoblacionDosAnios();
        this.calcularPoblacionTresAnios();
    }

    @Override
    public double calcularPoblacionUnAnio() {
        this.tasaCrecimiento = this.tasaCrecimiento / 100;
        this.crecimientoUnAnio = (this.poblacionDelPais * this.tasaCrecimiento) + this.poblacionDelPais;
        return 0;
    }

    @Override
    public double calcularPoblacionDosAnios() {
        this.crecimientoDosAnios = ((this.poblacionDelPais * this.tasaCrecimiento) * 2 ) + this.poblacionDelPais;
        return 0;
    }

    @Override
    public double calcularPoblacionTresAnios() {
        this.crecimientoTresAnios = ((this.poblacionDelPais * this.tasaCrecimiento) * 3) + this.poblacionDelPais;
        return 0;
    }
}
