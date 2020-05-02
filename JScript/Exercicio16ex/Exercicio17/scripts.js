function numEPar(numero){
  if (numero%2==0){
      return('Par')
  } else {
      return('impar');
  }
}

function fatorial(n){
    /*
    fatorial de 5 => 5 * 4 * 3 * 2 * 1 = notação matemática 5!
    */
    if (n == 1){
        return 1
    } else {
        return n * fatorial(n-1)
    }
}

let num = [1,2,3,4]

num[4] = 5
console.log('agora for in')
num.sort()
for (const pos in num) {
    console.log(num[pos])
}


console.log(num.indexOf(5) >= 0  ?'Achei' : 'Não achei')


console.log(numEPar(5))
console.log(numEPar(6))
console.log(fatorial(5))