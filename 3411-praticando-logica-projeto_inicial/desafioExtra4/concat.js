let minhaLista = [1, 2, 3];
let outraVariavel = [4, 5, 6];

let novaLista = minhaLista.concat(outraVariavel);
novaLista.pop();

function embaralha(novaLista) {

    for (let indice = novaLista.length; indice; indice--) {

        const indiceAleatorio = Math.floor(Math.random() * indice);

        // atribuição via destructuring
        [novaLista[indice - 1], novaLista[indiceAleatorio]] = 
            [novaLista[indiceAleatorio], novaLista[indice - 1]];
    }
}

function removerDuplicatas(novaLista) {
    let i = novaLista.length;
    let elemento = novaLista[i];
}

embaralha(novaLista);
console.log(novaLista);