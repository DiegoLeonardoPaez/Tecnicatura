def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        resultado = 1
        numero = n
        while numero > 1:
            resultado *= numero
            numero -= 1
        return resultado

numero = 5
resultado = factorial(numero)
print(f"El factorial de {numero} es: {resultado}")
