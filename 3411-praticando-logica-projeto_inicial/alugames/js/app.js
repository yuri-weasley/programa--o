function alterarStatus(id) {
    let gameClicado = document.getElementById(`game-${id}`);
    let imagem = gameClicado.querySelector('.dashboard__item__img');
    let botao = gameClicado.querySelector('.dashboard__item__button');
    let nomeDoJogo = gameClicado.querySelector('.dashboard__item__name').textContent;
    let jogosAlugados = [];
    
    //Esse if analisa a hipótese do jogo estar alugado.
    if (imagem.classList.contains('dashboard__item__img--rented')) {
        alert(`Confirma a devolução do jogo ${nomeDoJogo}?`);
        imagem.classList.remove('dashboard__item__img--rented');
        botao.classList.remove('dashboard__item__button--return');
        botao.textContent = 'Alugar';
        jogosAlugados.pop(nomeDoJogo);
    } else {
        imagem.classList.add('dashboard__item__img--rented');
        botao.classList.add('dashboard__item__button--return');
        botao.textContent = 'Devolver';
        jogosAlugados.push(nomeDoJogo);
    }
    console.log(jogosAlugados);
}