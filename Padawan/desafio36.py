import time

def timing_function(funcion):
    def nueva_funcion(*args, **kwargs):
        inicio = time.perf_counter_ns()
        c = funcion(*args, **kwargs)
        tiempo_ejecucion = time.perf_counter_ns()-inicio
        print("Tiempo en ms:", tiempo_ejecucion)
        return c
    return nueva_funcion

@timing_function
def combinaciones(lista : list) -> list[list]:
    combinaciones = []
    for x in range(len(lista)):
        for y in range(x + 1, len(lista)):
            parcial = []
            parcial.append(lista[x])
            parcial.append(lista[y])
            combinaciones.append(parcial.copy())
            for z in range(y + 1, len(lista)):
                parcial.append(lista[z])
                combinaciones.append(parcial.copy())
    return combinaciones

def buscar(lista, objetivo):
    return list(filter(lambda x: sum(x)==objetivo, combinaciones(lista)))


lista = [1,2,3,4,5,9,1]
objetivo = 6
print(buscar(lista,objetivo))

lista = [1,2,3,4,5,9,1,4,5,7,6,3]
objetivo = 7

print(buscar(lista,objetivo))