import java.io.*;
import java.util.ArrayList;

public class pruebaArchivo {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Poblacion> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\Luis Donaldo\\IdeaProjects\\Poblacion\\src\\datos.txt";


    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Poblacion> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                int poblacionDelPais = Integer.parseInt(elementosLinea[0]);
                int tasaCrecimiento = Integer.parseInt(elementosLinea[0]);
                listaEntrada.add(new Poblacion(poblacionDelPais, tasaCrecimiento));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new Poblacion(0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Poblacion> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("PoblacionDelPais,TasaDeCrecimiento,Crecimiento1Anio,Crecimiento2Anios,Crecimiento3Anios\n");
            for (int i=0; i < lista.size(); i++) {
                wr.append(lista.get(i).getPoblacionDelPais() + "," + lista.get(i).getTasaCrecimiento() +
                                "," + lista.get(i).getCrecimiento1Año() +  "," + lista.get(i).getCrecimiento2Años() +
                                "," + lista.get(i).getCrecimiento3Años() +
                        "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivo prueba = new pruebaArchivo();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getPoblacionDelPais() + "\t" + prueba.getListaEntrada().get(i).getTasaCrecimiento() + "\t" + prueba.getListaEntrada().get(i).getCrecimiento1Año() + "\t" + prueba.getListaEntrada().get(i).getCrecimiento2Años() + "\t" + prueba.getListaEntrada().get(i).getCrecimiento3Años());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}