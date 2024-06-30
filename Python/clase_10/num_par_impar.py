def par_impar():
    n = int(input("Ingresa la cantidad de números: "))
    numeros = []

    for _ in range(n):
        num = int(input("Ingresa un número: "))
        numeros.append(num)

    suma_pares = 0
    cantidad_pares = 0
    for num in numeros:
        if num % 2 == 0:
            suma_pares += num
            cantidad_pares += 1


    suma_impares = sum(num for num in numeros if num % 2 != 0)
    cantidad_impares = n - cantidad_pares
    promedio_impares = suma_impares / cantidad_impares

    print(f"La suma de los números pares es: {suma_pares}")
    print(f"La cantidad de números pares: {cantidad_pares}")
    print(f"El promedio de los números impares es: {promedio_impares:.2f}")

par_impar()


