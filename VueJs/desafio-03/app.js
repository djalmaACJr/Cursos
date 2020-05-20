new Vue({
    el: '#desafio',
    data: {
        valor: 0
    },
    
    methods: {
        somar(qtd){
            this.valor += qtd
        }
    },

    computed: {
        resultado() {
            return this.valor == 37 ? "IGUAL :)" : "DIFERENTE :(" 
        }
    },

    watch: {
        resultado( novo, antigo ) {
            console.log("agora é " + novo)
            setTimeout(() => {
                this.valor = 0;
            }, 5000);
        }

    }


});