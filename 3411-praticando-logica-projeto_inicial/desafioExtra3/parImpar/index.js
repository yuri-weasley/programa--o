function parImpar () {
    let num = document.getElementById('num').value;
    let texto = document.getElementById('texto');

    if (num % 2 == 0) {
        texto.innerHTML = `O número ${num} é par.`;
    } else {
        texto.innerHTML = `O número ${num} é ímpar.`;
    }
}