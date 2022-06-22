from abc import ABCMeta

class Poblacion(ABCMeta):
    #metodo estatico
    @staticmethod
    def calcularPoblacionUnAnio(poblacionDelPais, tasaCrecimiento):
        tasaCrecimiento = tasaCrecimiento / 100
        return (poblacionDelPais * tasaCrecimiento) + poblacionDelPais



class pruebaArchivos:

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split("#"))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append([int(lineas[f][0]), int(lineas[f][1])])
            except ValueError:
                lineas_archivo.append([0,0,])
        return lineas_archivo

    def Poblaciongeneral(self,lista):
        resultados=[]
        for f in range(0, len(lista)):
            for f in range(0, len(lista)):
                resultados.append(Poblacion.calcularPoblacionUnAnio(
                    lista[f][0], lista[f][1]))
            return resultados

    def guardarResultados(self,entrada,resultados):
        file = open("resultados.txt",'w')
        file.write('poblaciondelpais,tasadecrecimiento,poblacionUnAño\n')
        for f in range(0,len(entrada)):
            linea= str(entrada[f][0])+ '#' + str(entrada[f][1])+ '#' + str(resultados[f])+ '\n'
            file.write(linea)
        file.close()

if __name__ == "__main__":
    prueba = pruebaArchivos()
    archivo = []
    archivo = prueba.leerArchivo("DatosYatzu.txt")
    print(archivo)
    resultado = prueba.Poblaciongeneral(archivo)
    print (resultado)
    prueba.guardarResultados(archivo,resultado)