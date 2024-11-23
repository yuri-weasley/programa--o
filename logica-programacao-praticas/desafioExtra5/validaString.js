function validaString(texto) {
    if (texto == '') {
        console.log('A string é vazia.');
    } else {
        console.log(`Vc digitou: ${texto}.`);
    }
}

validaString('Olá, Mundo');