let horaDia = 20;
let mensaje;

if (horaDia >= 9 && horaDia <= 11) {
    mensaje = "Estoy trabajando";
} else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "Sigo trabajando";
} else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "Falta poco para dejar de trabajar";
} else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "En clase de la universidad (Si hay tiempo gym)";
} else {
    mensaje = "Valor incorrecto";
}

console.log(mensaje);
