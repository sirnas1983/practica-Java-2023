

def permutaciones(palabra: str) -> list[str]:


    for i in range(len(palabra)):
        palabra_nueva = palabra.split(palabra[i],1)
        letra = palabra[i]
        palabrita = ''
        for j in palabra_nueva:
            palabrita += j
        
        



    

permutaciones("Darian")
