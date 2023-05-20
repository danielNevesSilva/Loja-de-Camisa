var radio = document.querySelector('.manual-btn')
var cont =  1

// Validação para que a primeiro radio button venha selecionado

document.getElementById('radio1').checked = true

// Tempo de exebição da imagem na tela, 5000 represebta 5 segundos.

setInterval(() =>{
    proximaImg()
}, 5000)

function proximaImg(){
    cont++

    if(cont > 3){
        cont =1
    }

    document.getElementById('radio'+cont).checked = true
}