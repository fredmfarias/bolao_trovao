const rodadas = require('./rodadas.json');
const fs = require('fs');
const FILE = 'script-insert-jogos.sql';

const classificacao = require('./grupos.json');
const grupos = classificacao.grupos;

var findGrupo = function(selecao){
    
    for(var grupo of grupos){
        
        for(var i of grupo.classificacao){
            
            if( selecao === i.nome_popular){
                console.log("ACHOOOu " + grupo.nome_grupo.replace('Grupo ', ''));
                return grupo.nome_grupo.replace('Grupo ', '');
            }
        }
    }
    return;
}

console.log(findGrupo('Brasil'));

var numJogo = 1;
rodadas.rodadas.forEach((rodada) => {
    
    fs.appendFileSync(FILE, `\n--Rodada ${rodada.rodada}\n`);

    rodada.jogos.forEach((jogo) => {
        
        fs.appendFileSync(FILE, 
            `INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)\n VALUES ((select id from tb_clube where nome = '${jogo.equipes.mandante.nome_popular}'), (select id from tb_clube where nome = '${jogo.equipes.visitante.nome_popular}'), to_timestamp('${jogo.data_realizacao.replace('T', ' ')}', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = '${jogo.sede.nome_popular}'), ${numJogo}, ${rodada.rodada}, 'C', ${(jogo.equipes.mandante.nome_popular == 'Brasil' || jogo.equipes.visitante.nome_popular == 'Brasil' ? 2 : 1)});\n`);
    });
});


console.log("Feito");