function obtenerEstacion(mes) {
    const estaciones = {
        1: "Verano",
        2: "Verano",
        12: "Verano",
        3: "Otoño",
        4: "Otoño",
        5: "Otoño",
        6: "Invierno",
        7: "Invierno",
        8: "Invierno",
        9: "Primavera",
        10: "Primavera",
        11: "Primavera"
    };
    return estaciones[mes] || "Valor incorrecto";
}

let mes = 7;
let estacion = obtenerEstacion(mes);
console.log("El mes corresponde a la estación de: " + estacion);
