class poblacion:
    __poblacionDelPais = float(0.0)
    __tasaCrecimiento = float(0.0)
    __tasaMuertes = float(0.0)
    __crecimientoUnAnio = float(0.0)
    __crecimientoDosAnios = float(0.0)
    __crecimientoTresAnios = float(0.0)

    __crecimientoUnAnioReal = float(0.0)

    # Metodo constructor
    def __init__(self, poblacionDelPais, tasaCrecimiento):
        self.__poblacionDelPais = poblacionDelPais
        self.__tasaCrecimiento = tasaCrecimiento
        self.calcularPoblacionUnAnio()
        self.calcularPoblacionDosAnios()
        self.calcularPoblacionTresAnios()

    def get_crecimientoUnAnio(self):
        return self.__crecimientoUnAnio

    def get_crecimientoDosAnios(self):
        return self.__crecimientoDosAnios

    def get_crecimientoTresAnios(self):
        return self.__crecimientoTresAnios

    # Metodos de instancia
    def calcularPoblacionUnAnio(self):
        self.__tasaCrecimiento = self.__tasaCrecimiento / 100
        self.__crecimientoUnAnio = (self.__poblacionDelPais * self.__tasaCrecimiento) + self.__poblacionDelPais
        return self.__crecimientoUnAnio

    def calcularPoblacionDosAnios(self):
        self.__crecimientoDosAnios = ((self.__poblacionDelPais * self.__tasaCrecimiento) * 2) + self.__poblacionDelPais
        return self.__crecimientoDosAnios

    def calcularPoblacionTresAnios(self):
        self.__crecimientoTresAnios = ((self.__poblacionDelPais * self.__tasaCrecimiento) * 3) + self.__poblacionDelPais
        return self.__crecimientoTresAnios


    def calcularPoblacionUnAnioReal(self):
        self.__tasaMuertes = self.__tasaMuertes / 100
        self.__crecimientoUnAnioReal = ((self.__poblacionDelPais * self.__tasaCrecimiento) + self.__poblacionDelPais) - (self.__poblacionDelPais * self.__tasaMuertes)
        return self.__crecimientoUnAnioReal

    # Sobrecarga
    def poblacion(self, poblacionDelPais=None, tasaCrecimiento=None, tasaMuertes=None):
        # Sobrecarga de dos parametros
        if poblacionDelPais is not None and tasaCrecimiento is not None and tasaMuertes is None:
            self.__poblacionDelPais = poblacionDelPais
            self.__tasaCrecimiento = tasaCrecimiento
            print(self.calcularPoblacionUnAnio())
            print(self.calcularPoblacionDosAnios())
            print(self.calcularPoblacionTresAnios())

        # Sobrecarga de tres parametros
        elif poblacionDelPais is not None and tasaCrecimiento is not None and tasaMuertes is not None:
            self.__poblacionDelPais = poblacionDelPais
            self.__tasaCrecimiento = tasaCrecimiento
            self.__tasaMuertes = tasaMuertes
            print(self.calcularPoblacionUnAnio())
            print(self.calcularPoblacionDosAnios())
            print(self.calcularPoblacionTresAnios())
            print(self.calcularPoblacionUnAnioReal())


from abc import ABC, abstractmethod

class poblacion2(ABC):

    # Metodos de clase
    @classmethod
    def calcularPoblacionUnAnio(cls, poblacionDelPais, tasaCrecimiento):
        tasaCrecimiento = tasaCrecimiento / 100
        return (poblacionDelPais * tasaCrecimiento) + poblacionDelPais

    @classmethod
    def calcularPoblacionDosAnios(cls, poblacionDelPais, tasaCrecimiento):
        tasaCrecimiento = tasaCrecimiento / 100
        return ((poblacionDelPais * tasaCrecimiento) * 2) + poblacionDelPais

    @classmethod
    def calcularPoblacionTresAnios(cls, poblacionDelPais, tasaCrecimiento):
        tasaCrecimiento = tasaCrecimiento / 100
        return ((poblacionDelPais * tasaCrecimiento) * 3) + poblacionDelPais


    # metodo destructor
    def __del__(self):
        self.calcularPoblacionUnAnio(1000, 20)
        self.calcularPoblacionDosAnios(1000, 20)
        self.calcularPoblacionTresAnios(1000, 20)

class main:

    # Metodos de instancia
    resultado = poblacion(1000, 20)
    print("Metodos de instancia")
    print(resultado.get_crecimientoUnAnio())
    print(resultado.get_crecimientoDosAnios())
    print(resultado.get_crecimientoTresAnios())

    # Metodo con sobrecarga
    print("Constructor con 2 parametros")
    resultado.poblacion(1000, 20)
    print("Constructor con 3 parametros")
    resultado.poblacion(1000, 20, 10)

    # Metodos de clase
    print("Metodos de clase")
    print(poblacion2.calcularPoblacionUnAnio(1000, 20))
    print(poblacion2.calcularPoblacionDosAnios(1000, 20))
    print(poblacion2.calcularPoblacionTresAnios(1000, 20))

if __name__ == "__main__":
    main()