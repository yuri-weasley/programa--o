let texto = document.getElementById('text');

function convertedor() {
    let temp = document.getElementById('temp').value;
    let celsius = document.getElementById('celsius');
    let faren = document.getElementById('farenheit');

    if (celsius) {
        converterParaCelsius(temp);
    } else if (faren) {
        converterParaFarenheit(temp);
    }
}

function converterParaCelsius(temp) {
    let c;
    c = ((temp - 32) * 5)/9;
    texto.innerHTML = `A temperatura digitada corresponde a ${c}°C.`;
}

function converterParaFarenheit(temp) {
    let f;
    f = ((9 * temp) / 5) + 32;
    texto.innerHTML = `A temperatura digitada corresponde a ${f}°F.`;
}
