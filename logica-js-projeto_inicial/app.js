alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 4;
console.log(numeroSecreto);
let chute = prompt('Escolha um número entre 1 e 10');

// se chute for igual ao número secreto
if(numeroSecreto == chute) {
    alert(`Isso aí! Você descobriu o número secreto (${numeroSecreto})`);
} else {
    alert('Você errou :(');
}