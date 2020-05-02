function contarKct() {
    
    let ini = window.document.getElementById('txtIni');
    let fim = window.document.getElementById('txtFim');
    let passo = window.document.getElementById('txtPasso');

    if (ini.value.length == 0) {
        window.alert('informe o inicio')
    }

    if (fim.value.length == 0) {
        window.alert('informe o fim')
    }

    if (ini.value > fim.value) {
        window.alert('inicio não pode ser maior que fim')
    }

    if (passo.value.length == 0 || passo.value <= 0) {
        window.alert('passo inválido')
    }

    let res = document.getElementById('result')
    let cont = ''

    //window.alert('agora vai começar')

    let i = Number(ini.value)
    let f = Number(fim.value)
    let p = Number(passo.value)

    for (let c = i; c <= f; c += p){
        cont += c + ', ';
    }

    res.innerText =  cont.substr(1, cont.length-2);;
    //window.alert(cont);
    res.innerText = cont;





}