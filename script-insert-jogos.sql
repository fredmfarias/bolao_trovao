--1
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Catar'), (select id from tb_clube where nome = 'Equador'), to_timestamp('2022-20-11 13:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'AL BAYT'),1, 1, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Egito'), (select id from tb_clube where nome = 'Uruguai'), to_timestamp('2018-15-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ECATERIMBURGO'),2, 1, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Marrocos'), (select id from tb_clube where nome = 'Irã'), to_timestamp('2018-15-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SÃO PETERSBURGO'),3, 1, 'B', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Portugal'), (select id from tb_clube where nome = 'Espanha'), to_timestamp('2018-15-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'OLÍMPICO DE SOCHI'),4, 1, 'B', 1);

--2
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'França'), (select id from tb_clube where nome = 'Austrália'), to_timestamp('2018-16-06 07:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ARENA KAZAN'),5, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Peru'), (select id from tb_clube where nome = 'Dinamarca'), to_timestamp('2018-16-06 13:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SARANSK'),6, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Argentina'), (select id from tb_clube where nome = 'Islândia'), to_timestamp('2018-16-06 10:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),7, 1, 'D', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Croácia'), (select id from tb_clube where nome = 'Nigéria'), to_timestamp('2018-16-06 16:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'KALININGRADO'),8, 1, 'D', 1);

--3
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Costa Rica'), (select id from tb_clube where nome = 'Sérvia'), to_timestamp('2018-17-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SAMARA'),9, 1, 'E', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Brasil'), (select id from tb_clube where nome = 'Suíça'), to_timestamp('2018-17-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ROSTOV'),10, 1, 'E', 2);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Alemanha'), (select id from tb_clube where nome = 'México'), to_timestamp('2018-17-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),11, 1, 'F', 1);

--4
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Suécia'), (select id from tb_clube where nome = 'Coreia do Sul'), to_timestamp('2018-18-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'NIZHNY NOVGOROD'),12, 1, 'F', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Bélgica'), (select id from tb_clube where nome = 'Panamá'), to_timestamp('2018-18-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'OLÍMPICO DE SOCHI'),13, 1, 'G', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Tunísia'), (select id from tb_clube where nome = 'Inglaterra'), to_timestamp('2018-18-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'VOLGOGRADO'),14, 1, 'G', 1);

--5
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Rússia'), (select id from tb_clube where nome = 'Egito'), to_timestamp('2018-19-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SÃO PETERSBURGO'),15, 2, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Colômbia'), (select id from tb_clube where nome = 'Japão'), to_timestamp('2018-19-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SARANSK'),16, 1, 'H', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Polônia'), (select id from tb_clube where nome = 'Senegal'), to_timestamp('2018-19-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),17, 1, 'H', 1);

--6
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Uruguai'), (select id from tb_clube where nome = 'Arábia Saudita'), to_timestamp('2018-20-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ROSTOV'),18, 2, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Portugal'), (select id from tb_clube where nome = 'Marrocos'), to_timestamp('2018-20-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),19, 2, 'B', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Irã'), (select id from tb_clube where nome = 'Espanha'), to_timestamp('2018-20-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ARENA KAZAN'),20, 2, 'B', 1);

--7
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Dinamarca'), (select id from tb_clube where nome = 'Austrália'), to_timestamp('2018-21-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SAMARA'),21, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'França'), (select id from tb_clube where nome = 'Peru'), to_timestamp('2018-21-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ECATERIMBURGO'),22, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Argentina'), (select id from tb_clube where nome = 'Croácia'), to_timestamp('2018-21-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'NIZHNY NOVGOROD'),23, 2, 'D', 1);

--8
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Nigéria'), (select id from tb_clube where nome = 'Islândia'), to_timestamp('2018-22-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'VOLGOGRADO'),24, 2, 'D', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Brasil'), (select id from tb_clube where nome = 'Costa Rica'), to_timestamp('2018-22-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SÃO PETERSBURGO'),25, 2, 'E', 2);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Sérvia'), (select id from tb_clube where nome = 'Suíça'), to_timestamp('2018-22-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'KALININGRADO'),26, 2, 'E', 1);

--9
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Coreia do Sul'), (select id from tb_clube where nome = 'México'), to_timestamp('2018-23-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ROSTOV'),27, 2, 'F', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Alemanha'), (select id from tb_clube where nome = 'Suécia'), to_timestamp('2018-23-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'OLÍMPICO DE SOCHI'),28, 2, 'F', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Bélgica'), (select id from tb_clube where nome = 'Tunísia'), to_timestamp('2018-23-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),29, 2, 'G', 1);

--10
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Inglaterra'), (select id from tb_clube where nome = 'Panamá'), to_timestamp('2018-24-06 09:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'NIZHNY NOVGOROD'),30, 2, 'G', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Japão'), (select id from tb_clube where nome = 'Senegal'), to_timestamp('2018-24-06 12:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ECATERIMBURGO'),31, 2, 'H', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Polônia'), (select id from tb_clube where nome = 'Colômbia'), to_timestamp('2018-24-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ARENA KAZAN'),32, 2, 'H', 1);

--11
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Uruguai'), (select id from tb_clube where nome = 'Rússia'), to_timestamp('2018-25-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SAMARA'),33, 3, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Arábia Saudita'), (select id from tb_clube where nome = 'Egito'), to_timestamp('2018-25-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'VOLGOGRADO'),34, 3, 'A', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Irã'), (select id from tb_clube where nome = 'Portugal'), to_timestamp('2018-25-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SARANSK'),35, 3, 'B', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Espanha'), (select id from tb_clube where nome = 'Marrocos'), to_timestamp('2018-25-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'KALININGRADO'),36, 3, 'B', 1);

--12
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Dinamarca'), (select id from tb_clube where nome = 'França'), to_timestamp('2018-26-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),37, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Austrália'), (select id from tb_clube where nome = 'Peru'), to_timestamp('2018-26-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'OLÍMPICO DE SOCHI'),38, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Nigéria'), (select id from tb_clube where nome = 'Argentina'), to_timestamp('2018-26-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SÃO PETERSBURGO'),39, 3, 'D', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Islândia'), (select id from tb_clube where nome = 'Croácia'), to_timestamp('2018-26-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ROSTOV'),40, 3, 'D', 1);

--13
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Sérvia'), (select id from tb_clube where nome = 'Brasil'), to_timestamp('2018-27-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'MOSCOU'),41, 3, 'E', 2);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Suíça'), (select id from tb_clube where nome = 'Costa Rica'), to_timestamp('2018-27-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'NIZHNY NOVGOROD'),42, 3, 'E', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Coreia do Sul'), (select id from tb_clube where nome = 'Alemanha'), to_timestamp('2018-27-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ARENA KAZAN'),43, 3, 'F', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'México'), (select id from tb_clube where nome = 'Suécia'), to_timestamp('2018-27-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'ECATERIMBURGO'),44, 3, 'F', 1);

--14
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Inglaterra'), (select id from tb_clube where nome = 'Bélgica'), to_timestamp('2018-28-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SARANSK'),45, 3, 'G', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Panamá'), (select id from tb_clube where nome = 'Tunísia'), to_timestamp('2018-28-06 15:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'KALININGRADO'),46, 3, 'G', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Japão'), (select id from tb_clube where nome = 'Polônia'), to_timestamp('2018-28-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'VOLGOGRADO'),47, 3, 'H', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where nome = 'Senegal'), (select id from tb_clube where nome = 'Colômbia'), to_timestamp('2018-28-06 11:00:00', 'YYYY-DD-MM HH24:MI:SS'), (select id from tb_estadio where descricao = 'SAMARA'),48, 3, 'H', 1);
