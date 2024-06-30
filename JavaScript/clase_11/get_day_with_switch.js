function getDay(n) {
    let day;
    switch (n) {
        case 1:
            day = 'Lunes';
            break;
        case 2:
            day = 'Martes';
            break;
        case 3:
            day = 'Miércoles';
            break;
        case 4:
            day = 'Jueves';
            break;
        case 5:
            day = 'Viernes';
            break;
        case 6:
            day = 'Sábado';
            break;
        case 7:
            day = 'Domingo';
            break;
        default:
            throw new Error('out of range');
    }
    return day;
}

console.log(getDay(5));
