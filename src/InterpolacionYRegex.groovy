// InterpolacionYRegex.groovy

// Interpolación de cadenas
def nombre = "Groovy"
def edad = 17
println "Hola, mi nombre es $nombre y tengo $edad anos."

// Expresiones regulares
def texto = "abc123def456"
def regex = /\d+/  // Coincide con uno o más dígitos

// Buscar coincidencias
def coincidencias = texto.findAll(regex)
println "Coincidencias de regex en '$texto': $coincidencias"

// Reemplazar coincidencias
def textoReemplazado = texto.replaceAll(regex, "X")
println "Texto reemplazado: $textoReemplazado"
