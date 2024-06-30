def salario():
    num_personas = 5
    sumatoria_salarios = 0

    for i in range(num_personas):
        horas_trabajadas = float(input(f"Ingrese las horas trabajadas para la persona {i + 1}: "))
        tarifa_pago = float(input(f"Ingrese la tarifa de pago para la persona {i + 1}: "))

        salario = horas_trabajadas * tarifa_pago
        sumatoria_salarios += salario

        print(f"Salario de la persona {i + 1}: ${salario:.2f}")

    print(f"Sumatoria total de salarios: ${sumatoria_salarios:.2f}")

salario()
