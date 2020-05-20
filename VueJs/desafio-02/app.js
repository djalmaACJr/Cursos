new Vue({
    el: '#desafio',
    
    data: {
        valor: 'valor',
        data: 'data'
    },

    methods: {
        alertButton(){
            alert("botão clicado")
        },
        copiaTexto(e){
            this.data = e.target.value
        }
    }

})