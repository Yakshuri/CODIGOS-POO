package herencia;

public class PoblacionUnionReal extends PoblacionGeneral{
    private float poblacionDelPais;

    protected PoblacionUnionReal(float poblacionDelPais, float tasaCrecimiento) {
        super(poblacionDelPais, tasaCrecimiento);
    }

    @Override
    public double calcularPoblacionUnAnio() {
        return 0;
    }

    @Override
    public double calcularPoblacionDosAnios() {
        return 0;
    }

    @Override
    public double calcularPoblacionTresAnios() {
        return 0;
    }



}
