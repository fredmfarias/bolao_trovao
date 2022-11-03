
--Rodada 1
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Catar'), (select id from tb_clube where nome = 'Equador'), to_timestamp('2022-11-20 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 1, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Inglaterra'), (select id from tb_clube where nome = 'Irã'), to_timestamp('2022-11-21 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 2, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Senegal'), (select id from tb_clube where nome = 'Holanda'), to_timestamp('2022-11-21 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 3, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Estados Unidos'), (select id from tb_clube where nome = 'País de Gales'), to_timestamp('2022-11-21 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 4, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Argentina'), (select id from tb_clube where nome = 'Arábia Saudita'), to_timestamp('2022-11-22 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 5, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Dinamarca'), (select id from tb_clube where nome = 'Tunísia'), to_timestamp('2022-11-22 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 6, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'México'), (select id from tb_clube where nome = 'Polônia'), to_timestamp('2022-11-22 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 7, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'França'), (select id from tb_clube where nome = 'Austrália'), to_timestamp('2022-11-22 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 8, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Marrocos'), (select id from tb_clube where nome = 'Croácia'), to_timestamp('2022-11-23 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 9, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Alemanha'), (select id from tb_clube where nome = 'Japão'), to_timestamp('2022-11-23 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 10, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Espanha'), (select id from tb_clube where nome = 'Costa Rica'), to_timestamp('2022-11-23 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 11, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Bélgica'), (select id from tb_clube where nome = 'Canadá'), to_timestamp('2022-11-23 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 12, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Suíça'), (select id from tb_clube where nome = 'Camarões'), to_timestamp('2022-11-24 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 13, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Uruguai'), (select id from tb_clube where nome = 'Coreia do Sul'), to_timestamp('2022-11-24 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 14, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Portugal'), (select id from tb_clube where nome = 'Gana'), to_timestamp('2022-11-24 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 15, 1, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Brasil'), (select id from tb_clube where nome = 'Sérvia'), to_timestamp('2022-11-24 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 16, 1, 'C', 2);

--Rodada 2
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'País de Gales'), (select id from tb_clube where nome = 'Irã'), to_timestamp('2022-11-25 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 17, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Catar'), (select id from tb_clube where nome = 'Senegal'), to_timestamp('2022-11-25 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 18, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Holanda'), (select id from tb_clube where nome = 'Equador'), to_timestamp('2022-11-25 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 19, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Inglaterra'), (select id from tb_clube where nome = 'Estados Unidos'), to_timestamp('2022-11-25 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 20, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Tunísia'), (select id from tb_clube where nome = 'Austrália'), to_timestamp('2022-11-26 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 21, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Polônia'), (select id from tb_clube where nome = 'Arábia Saudita'), to_timestamp('2022-11-26 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 22, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'França'), (select id from tb_clube where nome = 'Dinamarca'), to_timestamp('2022-11-26 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 23, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Argentina'), (select id from tb_clube where nome = 'México'), to_timestamp('2022-11-26 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 24, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Japão'), (select id from tb_clube where nome = 'Costa Rica'), to_timestamp('2022-11-27 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 25, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Bélgica'), (select id from tb_clube where nome = 'Marrocos'), to_timestamp('2022-11-27 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 26, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Croácia'), (select id from tb_clube where nome = 'Canadá'), to_timestamp('2022-11-27 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 27, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Espanha'), (select id from tb_clube where nome = 'Alemanha'), to_timestamp('2022-11-27 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 28, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Camarões'), (select id from tb_clube where nome = 'Sérvia'), to_timestamp('2022-11-28 07:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 29, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Coreia do Sul'), (select id from tb_clube where nome = 'Gana'), to_timestamp('2022-11-28 10:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 30, 2, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Brasil'), (select id from tb_clube where nome = 'Suíça'), to_timestamp('2022-11-28 13:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 31, 2, 'C', 2);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Portugal'), (select id from tb_clube where nome = 'Uruguai'), to_timestamp('2022-11-28 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 32, 2, 'C', 1);

--Rodada 3
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Holanda'), (select id from tb_clube where nome = 'Catar'), to_timestamp('2022-11-29 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 33, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Equador'), (select id from tb_clube where nome = 'Senegal'), to_timestamp('2022-11-29 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 34, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Irã'), (select id from tb_clube where nome = 'Estados Unidos'), to_timestamp('2022-11-29 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 35, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'País de Gales'), (select id from tb_clube where nome = 'Inglaterra'), to_timestamp('2022-11-29 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 36, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Tunísia'), (select id from tb_clube where nome = 'França'), to_timestamp('2022-11-30 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 37, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Austrália'), (select id from tb_clube where nome = 'Dinamarca'), to_timestamp('2022-11-30 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 38, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Polônia'), (select id from tb_clube where nome = 'Argentina'), to_timestamp('2022-11-30 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 39, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Arábia Saudita'), (select id from tb_clube where nome = 'México'), to_timestamp('2022-11-30 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 40, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Croácia'), (select id from tb_clube where nome = 'Bélgica'), to_timestamp('2022-12-01 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Ahmad bin Ali'), 41, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Canadá'), (select id from tb_clube where nome = 'Marrocos'), to_timestamp('2022-12-01 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Thumama'), 42, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Japão'), (select id from tb_clube where nome = 'Espanha'), to_timestamp('2022-12-01 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Internacional Khalifa'), 43, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Costa Rica'), (select id from tb_clube where nome = 'Alemanha'), to_timestamp('2022-12-01 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Bayt'), 44, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Coreia do Sul'), (select id from tb_clube where nome = 'Portugal'), to_timestamp('2022-12-02 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Cidade da Educação'), 45, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Gana'), (select id from tb_clube where nome = 'Uruguai'), to_timestamp('2022-12-02 12:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Al Janoub'), 46, 3, 'C', 1);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Camarões'), (select id from tb_clube where nome = 'Brasil'), to_timestamp('2022-12-02 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Lusail'), 47, 3, 'C', 2);
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, id_estadio, numeroJogo, rodada, grupo, pesoPontucao)
 VALUES ((select id from tb_clube where nome = 'Sérvia'), (select id from tb_clube where nome = 'Suíça'), to_timestamp('2022-12-02 16:00', 'YYYY-MM-DD HH24:MI'), (select id from tb_estadio where descricao = 'Estádio 974'), 48, 3, 'C', 1);
