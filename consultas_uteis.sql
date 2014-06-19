select j.numerojogo, cc.nome, AVG(a.apostaplacarcasa) as mediaCasa,
AVG(a.apostaplacarvisitante) as mediaVisitante, cv.nome from tb_aposta a
inner join tb_jogo j
on a.cod_jogo = j.id
inner join tb_clube cc
on j.id_clube_casa = cc.id
inner join tb_clube cv
on j.id_clube_visitante = cv.id
where a.apostaplacarcasa is not null AND a.apostaplacarvisitante is not null
GROUP BY j.numerojogo, cc.nome, cv.nome
ORDER BY j.numerojogo

select * from tb_usuario where id IN
(SELECT id_usuario from tb_aposta a where a.apostaplacarcasa is null AND a.apostaplacarvisitante is null)

select COUNT(*) AS Quantidade from tb_usuario where pago = true

select * from tb_aposta where id_usuario = 58

select j.numerojogo, cc.nome, a.apostaplacarcasa,
a.apostaplacarvisitante, cv.nome from tb_aposta a
inner join tb_jogo j
on a.cod_jogo = j.id
inner join tb_clube cc
on j.id_clube_casa = cc.id
inner join tb_clube cv
on j.id_clube_visitante = cv.id
where a.apostaplacarcasa is not null AND a.apostaplacarvisitante is not null
and id_usuario in (SELECT id FROM tb_usuario where nome like '%etro%')
ORDER BY j.numerojogo

select nome from tb_usuario u
where id in (select id_usuario from tb_aposta where (apostaplacarcasa = 2 and apostaplacarvisitante = 1) and cod_jogo = 12)
and ativo = true

--Oganizar producao
UPDATE tb_jogo set placarcasa = null, placarvisitante = null;

UPDATE tb_aposta SET pontuacao = null;

delete from tb_ranking;
