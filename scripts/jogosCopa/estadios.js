const classificacao = require('./grupos.json');
const grupos = classificacao.grupos;

let estadiosAll = [];
grupos.forEach((i) => {
    i.lista_jogos.forEach((i) => {
        estadiosAll.push(i.sede.nome_popular);
    });
});

let estadios = [...new Set(estadiosAll)];

fs = require('fs');

estadios.forEach((i) => {
    
    fs.appendFileSync('script-insert-estadios.sql', `INSERT INTO tb_estadio (descricao) VALUES ('${i}');\n`);
});

console.log("Feito");