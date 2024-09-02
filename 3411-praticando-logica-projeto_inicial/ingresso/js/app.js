function comprar() {
    let tipoIngresso = document.getElementById('tipo-ingresso').value;
    let quantidade = document.getElementById('qtd').value;
    let qtdPistaDisp = document.getElementById('qtd-pista').textContent;
    let qtdSuperiorDisp = document.getElementById('qtd-superior').textContent;
    let qtdInferiorDisp = document.getElementById('qtd-inferior').textContent;
    let lista = document.querySelector('.lista');

    if (tipoIngresso == 'pista') {
        qtdPistaDisp = qtdPistaDisp - quantidade;
        lista.innerHTML = `<li>Pista<span id="qtd-pista">${qtdPistaDisp}</span></li>`;
    }

    alert(tipoIngresso);
    alert(quantidade);
    alert(qtdPistaDisp);
}