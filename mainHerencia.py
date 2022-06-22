from Herencia import*

def main():
    print("poblaciondeunaño")
    total1 = poblacion(1000, 20)
    print(total1.get_crecimientoUnAnio())

    print("poblaciondosaños")
    total2=poblacion(1000,20)
    print(total2.get_crecimientoDosAnios())

    print("poblaciontresaños")
    total3=poblacion(1000,20)
    print(total3.get_crecimientoTresAnios())


    print("poblacionunionreal ")
    total4=PoblacionUnionReal(1000,20,5)
    print(total4.getpoblacionTotal())

if __name__== "__main__":
    main()