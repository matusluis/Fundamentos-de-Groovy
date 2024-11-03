// EstructurasDeControl.groovy

// Condicionales
def numero = 10

if (numero > 5) {
    println "El numero es mayor que 5"
} else if (numero == 5) {
    println "El numero es igual a 5"
} else {
    println "El numero es menor que 5"
}

// Condicionales prueba
def numeros = 10
def prueba = 5

if (numeros > prueba) {
    println "El numero es mayor que 5"
} else if (numeros == 5) {
    println "El numero es igual a 5"
} else {
    println "El numero es menor que 5"
}

// Switch
def dia = "lunes"
switch (dia) {
    case "lunes":
        println "Es lunes"
        break
    case "martes":
        println "Es martes"
        break
    default:
        println "No es ni lunes ni martes"
}

// Bucles
// For
for (i in 1..5) {
    println "For loop: $i"
}

// While
def contador = 1
while (contador <= 5) {
    println "While loop: $contador"
    contador++
}

// Do-While
contador = 1
do {
    println "Do-while loop: $contador"
    contador++
} while (contador <= 5)
