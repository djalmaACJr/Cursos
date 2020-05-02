function calcularTab(){
    let txt = document.getElementById("txttabuada")
    let res = document.getElementById("txtresTab")

    if (txt.value.length == 0 ) {
        window.alert("informe o multiplicador")
    } else {
        res.innerHTML = '';
        let base = Number(txt.value);
        for (let index = 1; index <= 10; index++) {
            let item = document.createElement("option")
            item.text = `${base} X ${index} = ${base*index}`
            item.value = 'tab' + index
            res.appendChild(item)   
        }
    }

    
}