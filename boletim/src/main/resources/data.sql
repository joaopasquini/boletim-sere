INSERT INTO RESPONSAVEL(nome, email, senha) VALUES('Marcello', 'marcello@email.com', '123456');
INSERT INTO RESPONSAVEL(nome, email, senha) VALUES('Nelson', 'nelson@email.com', '123456');

INSERT INTO DISCIPLINA(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO DISCIPLINA(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO ANOS_REGISTRADOS(ano) VALUES (2015);
INSERT INTO ANOS_REGISTRADOS(ano) VALUES (2016);
INSERT INTO ANOS_REGISTRADOS(ano) VALUES (2017);
INSERT INTO ANOS_REGISTRADOS(ano) VALUES (2018);

INSERT INTO ALUNO(nome, status, pai_cpf) VALUES('Joao', 'ATIVO', 1);
INSERT INTO ALUNO(nome, status, pai_cpf) VALUES('Sayuri', 'INATIVO', 2);
INSERT INTO ALUNO(nome, status, pai_cpf) VALUES('Everton', 'INATIVO', 2);
INSERT INTO ALUNO(nome, status, pai_cpf) VALUES('Maria', 'INATIVO', 1);

INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (1, 2015);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (2, 2016);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (3, 2017);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (4, 2018);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (3, 2015);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (4, 2016);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (2, 2017);
INSERT INTO ALUNO_ANOS(aluno_id, anos_ano) VALUES (1, 2018);


-- INSERT INTO () VALUES ();