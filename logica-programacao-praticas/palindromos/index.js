/* essaPalavraEUmPalindromo();

function essaPalavraEUmPalindromo() {
    var palavra = 'rever';
    var separandoAsLetrasDaPalavra = palavra.split(''); - "split" função para quebrar a palavra em uma lista de arrays.
    var palavraInvertida = separandoAsLetrasDaPalavra.reverse();
    palavraInvertida = palavraInvertida.join(''); - "join" para unir a lista de arrays gerados
    if(palavra == palavraInvertida) {
        console.log("A palavra " + palavra + "é um palíndromo!");
    } else {
        console.log("A palavra " + palavra + "não é um palíndromo!");
    }
} 
    
function expression: 
é sempre declarada dentro de uma constante, como abaixo;
não aceita o comportamento de hoisting;

function declaration:
é declarada direto, como acima;
aceita o hoisting;
*/

const essaPalavraEUmPalindromo = function essaPalavraEUmPalindromo(palavra) {
    var separandoAsLetrasDaPalavra = palavra.split('');
    var palavraInvertida = separandoAsLetrasDaPalavra.reverse();
    palavraInvertida = palavraInvertida.join('');
    if(palavra == palavraInvertida) {
        console.log("A palavra " + palavra + " é um palíndromo!");
    } else {
        console.log("A palavra " + palavra + " não é um palíndromo!");
    }
}
essaPalavraEUmPalindromo('radar');