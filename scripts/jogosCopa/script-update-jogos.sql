
--Rodada 1
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Catar') and id_clube_visitante = (select id from tb_clube where nome = 'Equador');
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'Inglaterra') and id_clube_visitante = (select id from tb_clube where nome = 'Irã');
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Senegal') and id_clube_visitante = (select id from tb_clube where nome = 'Holanda');
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'Estados Unidos') and id_clube_visitante = (select id from tb_clube where nome = 'País de Gales');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'Argentina') and id_clube_visitante = (select id from tb_clube where nome = 'Arábia Saudita');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'Dinamarca') and id_clube_visitante = (select id from tb_clube where nome = 'Tunísia');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'México') and id_clube_visitante = (select id from tb_clube where nome = 'Polônia');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'França') and id_clube_visitante = (select id from tb_clube where nome = 'Austrália');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Marrocos') and id_clube_visitante = (select id from tb_clube where nome = 'Croácia');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Alemanha') and id_clube_visitante = (select id from tb_clube where nome = 'Japão');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Espanha') and id_clube_visitante = (select id from tb_clube where nome = 'Costa Rica');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Bélgica') and id_clube_visitante = (select id from tb_clube where nome = 'Canadá');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Suíça') and id_clube_visitante = (select id from tb_clube where nome = 'Camarões');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Uruguai') and id_clube_visitante = (select id from tb_clube where nome = 'Coreia do Sul');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Portugal') and id_clube_visitante = (select id from tb_clube where nome = 'Gana');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Brasil') and id_clube_visitante = (select id from tb_clube where nome = 'Sérvia');

--Rodada 2
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'País de Gales') and id_clube_visitante = (select id from tb_clube where nome = 'Irã');
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Catar') and id_clube_visitante = (select id from tb_clube where nome = 'Senegal');
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Holanda') and id_clube_visitante = (select id from tb_clube where nome = 'Equador');
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'Inglaterra') and id_clube_visitante = (select id from tb_clube where nome = 'Estados Unidos');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'Tunísia') and id_clube_visitante = (select id from tb_clube where nome = 'Austrália');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'Polônia') and id_clube_visitante = (select id from tb_clube where nome = 'Arábia Saudita');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'França') and id_clube_visitante = (select id from tb_clube where nome = 'Dinamarca');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'Argentina') and id_clube_visitante = (select id from tb_clube where nome = 'México');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Japão') and id_clube_visitante = (select id from tb_clube where nome = 'Costa Rica');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Bélgica') and id_clube_visitante = (select id from tb_clube where nome = 'Marrocos');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Croácia') and id_clube_visitante = (select id from tb_clube where nome = 'Canadá');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Espanha') and id_clube_visitante = (select id from tb_clube where nome = 'Alemanha');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Camarões') and id_clube_visitante = (select id from tb_clube where nome = 'Sérvia');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Coreia do Sul') and id_clube_visitante = (select id from tb_clube where nome = 'Gana');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Brasil') and id_clube_visitante = (select id from tb_clube where nome = 'Suíça');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Portugal') and id_clube_visitante = (select id from tb_clube where nome = 'Uruguai');

--Rodada 3
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Holanda') and id_clube_visitante = (select id from tb_clube where nome = 'Catar');
UPDATE tb_jogo SET grupo = 'A' WHERE id_clube_casa = (select id from tb_clube where nome = 'Equador') and id_clube_visitante = (select id from tb_clube where nome = 'Senegal');
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'Irã') and id_clube_visitante = (select id from tb_clube where nome = 'Estados Unidos');
UPDATE tb_jogo SET grupo = 'B' WHERE id_clube_casa = (select id from tb_clube where nome = 'País de Gales') and id_clube_visitante = (select id from tb_clube where nome = 'Inglaterra');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'Tunísia') and id_clube_visitante = (select id from tb_clube where nome = 'França');
UPDATE tb_jogo SET grupo = 'D' WHERE id_clube_casa = (select id from tb_clube where nome = 'Austrália') and id_clube_visitante = (select id from tb_clube where nome = 'Dinamarca');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'Polônia') and id_clube_visitante = (select id from tb_clube where nome = 'Argentina');
UPDATE tb_jogo SET grupo = 'C' WHERE id_clube_casa = (select id from tb_clube where nome = 'Arábia Saudita') and id_clube_visitante = (select id from tb_clube where nome = 'México');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Croácia') and id_clube_visitante = (select id from tb_clube where nome = 'Bélgica');
UPDATE tb_jogo SET grupo = 'F' WHERE id_clube_casa = (select id from tb_clube where nome = 'Canadá') and id_clube_visitante = (select id from tb_clube where nome = 'Marrocos');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Japão') and id_clube_visitante = (select id from tb_clube where nome = 'Espanha');
UPDATE tb_jogo SET grupo = 'E' WHERE id_clube_casa = (select id from tb_clube where nome = 'Costa Rica') and id_clube_visitante = (select id from tb_clube where nome = 'Alemanha');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Coreia do Sul') and id_clube_visitante = (select id from tb_clube where nome = 'Portugal');
UPDATE tb_jogo SET grupo = 'H' WHERE id_clube_casa = (select id from tb_clube where nome = 'Gana') and id_clube_visitante = (select id from tb_clube where nome = 'Uruguai');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Camarões') and id_clube_visitante = (select id from tb_clube where nome = 'Brasil');
UPDATE tb_jogo SET grupo = 'G' WHERE id_clube_casa = (select id from tb_clube where nome = 'Sérvia') and id_clube_visitante = (select id from tb_clube where nome = 'Suíça');
