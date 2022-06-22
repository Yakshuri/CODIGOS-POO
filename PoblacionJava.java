public class Poblacion {
    private double poblacionDelPais;
    private double tasaCrecimiento;
    private double crecimiento1Año;
    private double crecimiento2Años;
    private double crecimiento3Años;


    //Constructor
    public Poblacion(double poblacionDelPais, double tasaCrecimiento){
        this.poblacionDelPais = poblacionDelPais;
        this.tasaCrecimiento = tasaCrecimiento / 100;
        this.calcularPoblacionUnAño();
        this.calcularPoblacionDosAño();
        this.calcularPoblacionTresAños();
    }

    public Poblacion(double poblacionDelPais, double tasaCrecimiento, double crecimiento1Año){
        this.poblacionDelPais = poblacionDelPais;
        this.tasaCrecimiento = tasaCrecimiento / 100;
        this.crecimiento1Año = crecimiento1Año;
        this.calcularPoblacionUnAño();
        this.calcularPoblacionDosAño();
        this.calcularPoblacionTresAños();
    }

    public double getCrecimiento1Año() {return crecimiento1Año;}

    public double getCrecimiento2Años() {return crecimiento2Años;}

    public double getCrecimiento3Años() {return crecimiento3Años;}

    //Metodos de instancia
    public void calcularPoblacionUnAño() {
    this.crecimiento1Año = (this.poblacionDelPais * this.tasaCrecimiento) + this.poblacionDelPais;
    }

    public void calcularPoblacionDosAño(){
        this.crecimiento2Años = ((this.poblacionDelPais * this.tasaCrecimiento) * 2) + this.poblacionDelPais;
    }


    public void calcularPoblacionTresAños(){
        this.crecimiento3Años = ((this.poblacionDelPais * this.tasaCrecimiento) * 3) + this.poblacionDelPais;
    }


    //Metodos de clase
    public static double calcularPoblacion1Años(double poblacionDelPais, double tasaCrecimiento) {
        double crecimiento1Años = (poblacionDelPais * ((tasaCrecimiento) / 100) + poblacionDelPais);
        return crecimiento1Años;
    }

    public static double calcularPoblacion2Años(double poblacionDelPais, double tasaCrecimiento) {
        double crecimiento2Años = ((poblacionDelPais * (((tasaCrecimiento) / 100) * 2) + poblacionDelPais));
        return crecimiento2Años;
    }

    public static double calcularPoblacion3Años(double poblacionDelPais, double tasaCrecimiento) {
        double crecimiento3Años = ((poblacionDelPais * (((tasaCrecimiento) / 100) * 3) + poblacionDelPais));
        return crecimiento3Años;
    }


    public static void main(String[] args) {
        //Metodos constructor e instancia
        System.out.println("Metodos constructor e instancia");
        Poblacion personas = new Poblacion(1000, 20);
        System.out.println(personas.getCrecimiento1Año());
        System.out.println(personas.getCrecimiento2Años());
        System.out.println(personas.getCrecimiento3Años());

        System.out.println("Sobrecarga de operadores");
        Poblacion personas1 = new Poblacion(1000,20,1200);
        System.out.println(personas.getCrecimiento1Año());
        System.out.println(personas.getCrecimiento2Años());
        System.out.println(personas.getCrecimiento3Años());

        //Metodos de clase
        System.out.println("Metodos de clase");
        System.out.println(calcularPoblacion1Años(1000,20));
        System.out.println(calcularPoblacion2Años(1000,20));
        System.out.println(calcularPoblacion3Años(1000,20));

    }

}
