# /*
#  * Crea una función que encuentre todas las combinaciones de los números
#  * de una lista que suman el valor objetivo.
#  * - La función recibirá una lista de números enteros positivos
#  *   y un valor objetivo.
#  * - Para obtener las combinaciones sólo se puede usar
#  *   una vez cada elemento de la lista (pero pueden existir
#  *   elementos repetidos en ella).
#  * - Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
#  *   Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
#  *   (Si no existen combinaciones, retornar una lista vacía)
#  */

def reto38_las_sumas(lista : list[int], objetivo: int):
    lista.sort()
    resultado = []
    for i,x in enumerate(lista):
        parcial = []
        parcial.append(x)
        for j,y in enumerate(lista):
            if i != j:
                if sum(parcial) + y < objetivo:
                    parcial.append(y)
                elif sum(parcial) + y == objetivo:
                    parcial.append(y)
                    resultado.append(parcial)
                    parcial = []

    return resultado

        
    


lista = [1, 5, 3, 2]
objetivo = 6

print(reto38_las_sumas(lista, objetivo))