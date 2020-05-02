function verificar() {
    var data = new Date();
    var anoAtu = data.getFullYear();
    var res = window.document.getElementById("resultado");
    
    var anoInfo = document.querySelector("input#txtAno");


    if (anoInfo.value.length == 0) {
        window.alert("informe a data kct")
    } else if (anoInfo.value > anoAtu ){
        window.alert("Ano informado inválido")
    } else {
        var idade = (anoAtu - anoInfo.value);
        res.innerText = " então vc deve ter entre " + (idade- 1) + " e " + idade; 
    }

    var sex = document.getElementsByName('radSex');
    var rSex = '<p> ';

    if (sex[0].checked) {
        rSex += "tu és Homem"
    } else if (sex[1].checked) {
        rSex += " tu és Mulher"
    } else {
        rSex += "sei lá kct"
    }
    rSex += "</p>"

    res.innerHTML += rSex

    var img = document.createElement("img")
    img.setAttribute('id', 'foto');

    if (sex[0].checked) {
        if (idade <= 13) {
            img.setAttribute('src', 'Imagens/Criança Menino.png')
        } else if (idade <= 20) {
            img.setAttribute('src', 'Imagens/jovem homem.png')
        } else if (idade <= 50) {
            img.setAttribute('src', 'Imagens/Adulto homem.png')
        } else {
            img.setAttribute('src', 'Imagens/Velho homem.png')
        }
    } else {
        if (idade <= 13) {
            img.setAttribute('src', 'Imagens/Criança Menina.png')
        } else if (idade <= 20) {
            img.setAttribute('src', 'Imagens/Jovem Menina.png')
        } else if (idade <= 50) {
            img.setAttribute('src', 'Imagens/Adulta Mulher.png')
        } else {
            img.setAttribute('src', 'Imagens/Velha Mulher.png')
        }
    }

    res.appendChild(img);

}