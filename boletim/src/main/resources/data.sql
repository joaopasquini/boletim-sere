INSERT INTO RESPONSAVEL(nome, email, senha) VALUES('Marcello', 'aluno@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO ALUNO(nome, mensagem, status, pai_id, curso_id) VALUES('Joao', 'Erro ao criar projeto', 'ATIVO', 1, 1);
INSERT INTO ALUNO(nome, mensagem, status, pai_id, curso_id) VALUES('Sayuri', 'Projeto não compila', 'INATIVO', 1, 1);
INSERT INTO ALUNO(nome, mensagem, status, pai_id, curso_id) VALUES('Everton', 'Tag HTML', 'INATIVO', 1, 2);
INSERT INTO ALUNO(nome, mensagem, status, pai_id, curso_id) VALUES('Maria', 'Erro ao criar projeto', 'INATIVO', 1, 1);