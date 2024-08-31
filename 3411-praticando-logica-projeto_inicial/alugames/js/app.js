let img = document.querySelector('.dashboard__item__img');
let btn = document.querySelector('.dashboard__item__button');
let j;

function alterarStatus(j) {
    if(img.classList.contains('dashboard__item__img')) {
        img.classList.add('dashboard__item__img--rented');
        img.classList.remove('dashboard__item__img');
    } else {
        img.classList.add('dashboard__item__img');
        img.classList.remove('dashboard__item__img--rented');
    }

    if(btn.classList.contains('dashboard__item__button')) {
        btn.classList.add('dashboard__item__button--return');
        btn.classList.remove('dashboard__item__button');
        btn.innerHTML = '<a href="#">Devolver</a>';
    } else {
        btn.classList.add('dashboard__item__button');
        btn.classList.remove('dashboard__item__button--return');
        btn.innerHTML = '<a href="#">Alugar</a>';
    }
}