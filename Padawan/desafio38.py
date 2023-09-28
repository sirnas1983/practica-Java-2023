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
def buscar(lista : list, objective : int) -> list[list]:
    resultado = []
    for x in range(len(lista)):
        if lista[x] == objective:
            resultado.append([lista[x]])
            continue
        elif lista[x] > objective:
            continue
        for y in range(x + 1, len(lista)):
            parcial = []
            parcial.append(lista[x])
            for z in range(y, len(lista)):
                if lista[z] + sum(parcial) == objective:
                    parcial.append(lista[z])
                    resultado.append(parcial)
                    break
                elif lista[z] + sum(parcial) > objective:
                    break
                else:
                    parcial.append(lista[z])
    return resultado

lista = [1,2,3,4,5,9,1,6]
objetivo = 6
print(buscar(lista,objetivo))

lista = [1,2,3,4,5,9,1,4,5,7,6,3]
objetivo = 7

print(buscar(lista,objetivo))
