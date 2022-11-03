const rodadas = require('./rodadas.json');
const fs = require('fs');
const FILE = 'script-update-jogos.sql';

const classificacao = require('./grupos.json');
const grupos = classificacao.grupos;

var findGrupo = function(selecao){
    
    for(var grupo of grupos){
        
        for(var i of grupo.classificacao){
            
            if( selecao === i.nome_popular){
                return grupo.nome_grupo.replace('Grupo ', '');
            }
        }
    }
    return;
}

var numJogo = 1;
rodadas.rodadas.forEach((rodada) => {
    
    fs.appendFileSync(FILE, `\n--Rodada ${rodada.rodada}\n`);

    rodada.jogos.forEach((jogo) => {
        
        fs.appendFileSync(FILE, 
            `UPDATE tb_jogo SET grupo = '${findGrupo(jogo.equipes.mandante.nome_popular)}' WHERE id_clube_casa = (select id from tb_clube where nome = '${jogo.equipes.mandante.nome_popular}') and id_clube_visitante = (select id from tb_clube where nome = '${jogo.equipes.visitante.nome_popular}');\n`);
        			
			numJogo++;
    });
});


console.log("Feito");