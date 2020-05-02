let nums = []

function naLista(vlr){
    return nums.indexOf(vlr) == -1? false : true;
}

function numValiedo(vlr) {
     return ((vlr >= 1 && vlr <=100) ) 
}

function addNum(){
    let txt = document.getElementById("txtNum");

    if (txt.value.length == 0) {
        window.alert("você não informou um número")
    }

    let num = Number(txt.value)

    if (!numValiedo(num) ) {
        window.alert("número deve ser entre 1 e 100")
    } else {

        if ( naLista(num) ) {
            window.alert("numero já está na lista")

        } else {

            nums.push(num);

            let sel = document.getElementById("lista")

            let item = document.createElement("option")
            item.text = `${nums.length}° Elemento é ${num}`
            item.value = 'tab' + num;

            sel.appendChild(item);

            txt.value = ''
        }
    }
    txt.focus
}

function analis(){

    if (nums.length == 1) {
        window.alert('nenhum número foi informado')
    }

    res = document.getElementById("resultado");
    
    res.innerHTML = `qtde de elemetos informados ${nums.length}`

    nums.sort()

    res.innerHTML += `<p>O menor número é o ${nums[0]}</p>`

    nums.sort().reverse()

    res.innerHTML += `<p>O maior número é o ${nums[0]}</p>`

    let soma = 0

    for (const key in nums) {
        soma += nums[key];
    }

    res.innerHTML += `<p>A Soma é ${soma}</p>`

    res.innerHTML +=  `<p>O média é o ${soma / nums.length}</p>`






}