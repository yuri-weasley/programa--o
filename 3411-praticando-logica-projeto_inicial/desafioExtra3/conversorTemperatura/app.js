// function converterParaCelsius() {
//     let texto = document.getElementById('text');
//     let temp = document.getElementById('temp').value;

//     let c = 0;
//     c = ((temp - 32)*5)/9;
//     texto.innerHTML = `A temperatura digitada corresponde a ${c}°C.`;
// }

// function converterParaFarenheit() {
//     let texto = document.getElementById('text');
//     let temp = document.getElementById('temp').value;

//     let f = 0;
//     f = ((9 * temp)/5) + 32;
//     texto.innerHTML = `A temperatura digitada corresponde a ${f}°F.`;
// }

//Solução do Prof abaixo...


function converterTemperatura(valor, escala) {
    if (escala.toLowerCase() === 'celsius') {
        return (valor * 9/5) + 32;  // Celsius para Fahrenheit
    } else if (escala.toLowerCase() === 'fahrenheit') {
        return (valor - 32) * 5/9;  // Fahrenheit para Celsius
    } else {
        return "Escala inválida";
    }
}

// Exemplo de uso
let temperaturaCelsius = 25;
let temperaturaFahrenheit = converterTemperatura(temperaturaCelsius, 'celsius');
console.log(temperaturaFahrenheit);  // Saída esperada: 77