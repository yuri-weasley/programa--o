let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do desafio';

function clickConsole() {
    console.log('O botão foi clicado!');
}

function clickAlert() {
    alert('Eu amo JS!');
}

function clickPrompt() {
    let cidade = prompt('Digite uma cidade brasileira:');

    alert(`Estive em ${cidade} e lembrei-me de você!`);
}

function clickSoma() {
    let num1 = parseInt(prompt('Digite um núemro inteiro:'));
    let num2 = parseInt(prompt('Digite outro número inteiro:'));
    let resultado = num1 + num2;
    alert(`A soma entre ${num1} e ${num2} é igual a ${resultado}`);
}