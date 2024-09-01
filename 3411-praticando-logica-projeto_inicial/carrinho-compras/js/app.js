let totalGeral;
limpar();

function adicionar() {
    //recuperar valores: "nome do produto", "quantidade" e "valor".
    let produto = document.getElementById('produto').value;
    let nomeProduto = produto.split('-')[0];
    let valorUnitario = produto.split('$')[1];
    let quantidade = document.getElementById('quantidade').value;

   //calcular o preço (subtotal).
    let preco = quantidade * valorUnitario;
    let carrinho = document.getElementById('lista-produtos');

    //adicionar no carrinho.
    if (quantidade >= 1) {
        quantidade = quantidade;
        carrinho.innerHTML = carrinho.innerHTML + `<section class="carrinho__produtos__produto">
          <span class="texto-azul">${quantidade}x</span> ${nomeProduto} <span class="texto-azul">R$${preco}</span>
        </section>`;
        totalGeral += preco;
    } else if(quantidade < 1) {
        alert('Digite uma quantidade válida.');
    }
        
    //atualizar o valor total.
    let campoTotal = document.getElementById('valor-total');
    campoTotal.textContent = `R$ ${totalGeral}`;
    document.getElementById('quantidade').value = 0;
}

function limpar() {
    totalGeral = 0;
    document.getElementById('lista-produtos').innerHTML = '';
    document.getElementById('valor-total').textContent = 'R$ 0';
}