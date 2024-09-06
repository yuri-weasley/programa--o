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

// Função para remover duplicatas de um array
function removerDuplicatas(array) {
    return [...new Set(array)];
  }
  
  // Testando a função com novaLista
  let novaListaSemDuplicatas = removerDuplicatas(novaLista);
  console.log("Remover duplicatas:", novaListaSemDuplicatas);

embaralha(novaLista);
console.log(novaLista);