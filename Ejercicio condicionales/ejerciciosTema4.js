/* En este ejercicio practicarás las estructuras de control, para ello deberás crear:*/

/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

let numeroIF = 5
if (numeroIF > -1 ) {
    console.log(`Soy positivo → (${numeroIF}`)
}
else if (numero == 0){
    console.log(`Soy 0 →(${numeroIF}`)
}
else {
    console.log(`Soy negativo → (${numeroIF}`)
}

/*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

-Incrementar el valor de la variable en uno cada vez que se ejecute.
-Mostrarlo por pantalla cada vez que se ejecute.*/

numeroWHILE = 1
while(numeroWHILE < 3) {
    numeroWHILE = numeroWHILE + 1
    console.log(`Ahora la variable es → ${numeroWHILE}`)
}

/*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/

numeroDOWHILE = 0
do{
    numeroDOWHILE = numeroDOWHILE + 1
    console.log(`Ahora la variable es → ${numeroDOWHILE}`)
}
while(numeroDOWHILE == 1) {
}

/*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/

numeroFor = 0
for(numeroFor;numeroFor<=3;numeroFor++){
    console.log(numeroFor)
}

/*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. */

estacion = "primavera"
switch (estacion) {
    case "verano":
        console.log("La estacion actual es verano.")       
        break;
    case "otoño":
        console.log("La estacion actual es otoño.")       
        break;    
    case "invierno":
        console.log("La estacion actual es invierno")       
        break;
    case "primavera":
        console.log("La estacion actual es primavera")       
        break;    
            
        default:
        console.log("Estacion no reconocida.")
        break;
}