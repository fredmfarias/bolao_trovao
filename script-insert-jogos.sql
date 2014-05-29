INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'brasil'), 
(select id from tb_clube where escudo = 'croacia'),
to_timestamp('2014-12-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'São Paulo - Itaquerão', 1, 1, 'A', 2);

--2
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'mexico'), 
(select id from tb_clube where escudo = 'camaroes'),
to_timestamp('2014-13-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Natal - Arena das Dunas', 2, 1, 'A', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'espanha'), 
(select id from tb_clube where escudo = 'holanda'),
to_timestamp('2014-13-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Salvador - Fonte Nova', 3, 1, 'B', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'chile'), 
(select id from tb_clube where escudo = 'australia'),
to_timestamp('2014-13-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Cuiabá - Arena Pantanal', 4, 1, 'B', 1);

--3
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'colombia'), 
(select id from tb_clube where escudo = 'grecia'),
to_timestamp('2014-14-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Belo Horizonte - Mineirão', 5, 1, 'C', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'uruguai'), 
(select id from tb_clube where escudo = 'costa_rica'),
to_timestamp('2014-14-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Fortaleza - Castelão', 7, 1, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'inglaterra'), 
(select id from tb_clube where escudo = 'italia'),
to_timestamp('2014-14-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Manaus - Arena Amazônia', 8, 1, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'costa_do_marfim'), 
(select id from tb_clube where escudo = 'japao'),
to_timestamp('2014-14-06 22:00:00','YYYY/MM/DD HH24:MI:SS'), 'Recife - Arena Pernambuco', 6, 1, 'C', 1);

--4
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'suica'), 
(select id from tb_clube where escudo = 'equador'),
to_timestamp('2014-15-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Brasília - Mané Garrincha', 9, 1, 'E', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'franca'), 
(select id from tb_clube where escudo = 'honduras'),
to_timestamp('2014-15-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Porto Alegre - Beira-Rio', 10, 1, 'E', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'argentina'), 
(select id from tb_clube where escudo = 'bosnia'),
to_timestamp('2014-15-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Rio de Janeiro - Maracanã', 11, 1, 'F', 1);

--5
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'alemanha'), 
(select id from tb_clube where escudo = 'portugal'),
to_timestamp('2014-16-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Salvador - Fonte Nova', 13, 1, 'G', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'ira'), 
(select id from tb_clube where escudo = 'nigeria'),
to_timestamp('2014-16-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Curitiba - Arena da Baixada', 12, 1, 'F', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'gana'), 
(select id from tb_clube where escudo = 'estados_unidos'),
to_timestamp('2014-16-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Natal - Arena das Dunas', 14, 1, 'G', 1);

--6
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'belgica'), 
(select id from tb_clube where escudo = 'argelia'),
to_timestamp('2014-17-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Belo Horizonte - Mineirão', 15, 1, 'H', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'brasil'), 
(select id from tb_clube where escudo = 'mexico'),
to_timestamp('2014-17-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Fortaleza - Castelão', 17, 2, 'A', 2);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'russia'), 
(select id from tb_clube where escudo = 'coreia_do_sul'),
to_timestamp('2014-17-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Cuiabá - Arena Pantanal', 16, 1, 'H', 1);

--7
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'australia'), 
(select id from tb_clube where escudo = 'holanda'),
to_timestamp('2014-18-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Porto Alegre - Beira-Rio', 20, 2, 'B', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'espanha'), 
(select id from tb_clube where escudo = 'chile'),
to_timestamp('2014-18-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Rio de Janeiro - Maracanã', 19, 2, 'B', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'camaroes'), 
(select id from tb_clube where escudo = 'croacia'),
to_timestamp('2014-18-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Manaus - Arena Amazônia', 18, 2, 'A', 1);

--8
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'colombia'), 
(select id from tb_clube where escudo = 'costa_do_marfim'),
to_timestamp('2014-19-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Brasília - Mané Garrincha', 21, 2, 'C', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'uruguai'), 
(select id from tb_clube where escudo = 'inglaterra'),
to_timestamp('2014-19-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'São Paulo - Itaquerão', 23, 2, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'japao'), 
(select id from tb_clube where escudo = 'grecia'),
to_timestamp('2014-19-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Natal - Arena das Dunas', 22, 2, 'C', 1);

--9
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'italia'), 
(select id from tb_clube where escudo = 'costa_rica'),
to_timestamp('2014-20-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Recife - Arena Pernambuco', 24, 2, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'suica'), 
(select id from tb_clube where escudo = 'franca'),
to_timestamp('2014-20-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Salvador - Fonte Nova', 25, 2, 'E', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'honduras'), 
(select id from tb_clube where escudo = 'equador'),
to_timestamp('2014-20-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Curitiba - Arena da Baixada', 26, 2, 'E', 1);

--10
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'argentina'), 
(select id from tb_clube where escudo = 'ira'),
to_timestamp('2014-21-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Belo Horizonte - Mineirão', 27, 2, 'F', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'alemanha'), 
(select id from tb_clube where escudo = 'gana'),
to_timestamp('2014-21-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Fortaleza - Castelão', 29, 2, 'G', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'nigeria'), 
(select id from tb_clube where escudo = 'bosnia'),
to_timestamp('2014-21-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Cuiabá - Arena Pantanal', 28, 2, 'F', 1);

--11
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'belgica'), 
(select id from tb_clube where escudo = 'russia'),
to_timestamp('2014-22-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Rio de Janeiro - Maracanã', 31, 2, 'H', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'coreia_do_sul'), 
(select id from tb_clube where escudo = 'argelia'),
to_timestamp('2014-22-06 16:00:00','YYYY/MM/DD HH24:MI:SS'), 'Porto Alegre - Beira-Rio', 32, 2, 'H', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'estados_unidos'), 
(select id from tb_clube where escudo = 'portugal'),
to_timestamp('2014-22-06 19:00:00','YYYY/MM/DD HH24:MI:SS'), 'Manaus - Arena Amazônia', 30, 2, 'G', 1);

--12
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'australia'), 
(select id from tb_clube where escudo = 'espanha'),
to_timestamp('2014-23-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Curitiba - Arena da Baixada', 35, 3, 'B', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'holanda'), 
(select id from tb_clube where escudo = 'chile'),
to_timestamp('2014-23-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'São Paulo - Itaquerão', 36, 3, 'B', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'croacia'), 
(select id from tb_clube where escudo = 'mexico'),
to_timestamp('2014-23-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Recife - Arena Pernambuco', 34, 3, 'A', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'camaroes'), 
(select id from tb_clube where escudo = 'brasil'),
to_timestamp('2014-23-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Brasília - Mané Garrincha', 33, 3, 'A', 2);

--13
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'costa_rica'), 
(select id from tb_clube where escudo = 'inglaterra'),
to_timestamp('2014-24-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Belo Horizonte - Mineirão', 40, 3, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'italia'), 
(select id from tb_clube where escudo = 'uruguai'),
to_timestamp('2014-23-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Natal - Arena das Dunas', 39, 3, 'D', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'japao'), 
(select id from tb_clube where escudo = 'colombia'),
to_timestamp('2014-24-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Cuiabá - Arena Pantanal', 37, 3, 'C', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'grecia'), 
(select id from tb_clube where escudo = 'costa_do_marfim'),
to_timestamp('2014-24-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Fortaleza - Castelão', 38, 3, 'C', 1);

--13
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'nigeria'), 
(select id from tb_clube where escudo = 'argentina'),
to_timestamp('2014-25-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Porto Alegre - Beira-Rio', 43, 3, 'F', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'bosnia'), 
(select id from tb_clube where escudo = 'ira'),
to_timestamp('2014-25-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Salvador - Fonte Nova', 44, 3, 'F', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'honduras'), 
(select id from tb_clube where escudo = 'suica'),
to_timestamp('2014-25-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Manaus - Arena Amazônia', 41, 3, 'E', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'equador'), 
(select id from tb_clube where escudo = 'franca'),
to_timestamp('2014-25-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Rio de Janeiro - Maracanã', 42, 3, 'E', 1);

--14
INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'portugal'), 
(select id from tb_clube where escudo = 'gana'),
to_timestamp('2014-26-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Brasília - Mané Garrincha', 46, 3, 'G', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'estados_unidos'), 
(select id from tb_clube where escudo = 'alemanha'),
to_timestamp('2014-26-06 13:00:00','YYYY/MM/DD HH24:MI:SS'), 'Recife - Arena Pernambuco', 45, 3, 'G', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'argelia'), 
(select id from tb_clube where escudo = 'russia'),
to_timestamp('2014-26-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'Curitiba - Arena da Baixada', 48, 3, 'H', 1);

INSERT INTO tb_jogo (id_clube_casa, id_clube_visitante, dataJogo, localJogo,
numeroJogo, rodada, grupo, pesoPontucao ) 
VALUES ((select id from tb_clube where escudo = 'coreia_do_sul'), 
(select id from tb_clube where escudo = 'belgica'),
to_timestamp('2014-26-06 17:00:00','YYYY/MM/DD HH24:MI:SS'), 'São Paulo - Itaquerão', 47, 3, 'H', 1);
