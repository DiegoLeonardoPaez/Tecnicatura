let days = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];

function getDay(n) {
    if (n < 1 || n > 7) {
        throw new Error('out of range');
    }
    return days[n - 1];
}

console.log(getDay(3));