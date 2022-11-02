const classificacao = require('./grupos.json');
const fs = require('fs');
const request = require('request');
const grupos = classificacao.grupos;
const FILE = 'script-insert-selecoes.sql';

grupos.forEach((i) => {
    
    fs.appendFileSync(FILE, `--${i.nome_grupo}\n`);

    i.classificacao.forEach((i) => {
        fs.appendFileSync(FILE, `INSERT INTO tb_clube (nome, escudo) VALUES ('${i.nome_popular}', '${i.sigla}');\n`);
                    
        request(i.escudo).pipe(fs.createWriteStream(`./imgs/${i.sigla}.svg`)).on('close', function(){
            console.log('done: ' + i.sigla);
          });

        console.log(i.nome_popular);
    });
});

console.log("Feito");