


def escalera(escalones):
    
    escalera = ["" for i in range(escalones)]
    print(escalera)
    print(" "*(len(escalera)+1),"_")
    
    for x in range(len(escalera)-1):
        if escalones < 0:
            print(" "*len(escalera[:x]),"_|")
        if escalones > 0:
            print(" "*len(escalera[x:]),"_|")
    
escalera(-5)