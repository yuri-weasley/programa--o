function adicionar() {
    precoProduto = 0;
    let produto = document.getElementById('produto').value;
    let quantidade = document.getElementById('quantidade').value;
    let itensCarrinho = document.querySelector('.carrinho__produtos__produto');
    let totalParcial = 0;

    if (produto == 'Fone de ouvido - R$100') {
        precoProduto = 100;
    } else if (produto == 'Celular - R$1400') {
        precoProduto = 1400;
    } else {
        precoProduto = 5000;
    }

    itensCarrinho.innerHTML = `<span class="texto-azul">${quantidade}x</span> ${produto} <span class="texto-azul"></span>`;

    totalParcial = quantidade * precoProduto;
    
}