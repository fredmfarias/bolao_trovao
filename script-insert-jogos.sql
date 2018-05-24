--1
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'rusia'), 
(select id from tb_clube where escudo = 'cro'),
to_timestamp('2018-14-06 12:00:00','YYYY/DD/MM HH24:MI:SS'), (﻿select id from tb_estadio where descricao = N'OLÍMPICO LUJNIKI'), 1, 1, 'A', 2);

--2

