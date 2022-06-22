public class Poblacion {
    private int poblacionDelPais;
    private int tasaCrecimiento;
    private int crecimiento1Año;
    private int crecimiento2Años;
    private int crecimiento3Años;


    public Poblacion(int poblacionDelPais, int tasaCrecimiento){
        this.poblacionDelPais = poblacionDelPais;
        this.tasaCrecimiento = tasaCrecimiento / 100;
        this.calcularPoblacionUnAño();
        this.calcularPoblacionDosAño();
        this.calcularPoblacionTresAños();
    }

    public int getPoblacionDelPais(){
        return poblacionDelPais;
    }

    public int getTasaCrecimiento(){
        return tasaCrecimiento;
    }

    public int getCrecimiento1Año() {
        return crecimiento1Año;
    }

    public int getCrecimiento2Años(){
        return crecimiento2Años;
    }

    public int getCrecimiento3Años(){
        return crecimiento3Años;
    }

    public void calcularPoblacionUnAño() {
    this.crecimiento1Año = (this.poblacionDelPais * this.tasaCrecimiento) + this.poblacionDelPais;
    }

    public void calcularPoblacionDosAño(){
        this.crecimiento2Años = ((this.poblacionDelPais * this.tasaCrecimiento) * 2) + this.poblacionDelPais;
    }


    public void calcularPoblacionTresAños(){
        this.crecimiento3Años = ((this.poblacionDelPais * this.tasaCrecimiento) * 3) + this.poblacionDelPais;
    }

    public static void main(String[] args) {
        Poblacion personas = new Poblacion(1000, 20);
        System.out.println(personas.getCrecimiento1Año());
        System.out.println(personas.getCrecimiento2Años());
        System.out.println(personas.getCrecimiento3Años());

    }
}
