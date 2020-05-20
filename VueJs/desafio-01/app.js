new Vue
    (
        {
            el: '#desafio',
            data: {
                nome: "djalma Jr",
                idade: 41,
                linkImg: 'http://www.psicologianoesporte.com.br/wp-content/uploads/2016/03/atencao-teste.jpg'
            },
            methods: {
                multiplicIdade() {
                    m = this.idade * 3
                    return m
                },

                randonNum() {
                    r = Math.random();
                    return r
                },
                
                nome_idade(event){
                    return this.nome + ' / ' + this.idade
                }
            }
        }

    )