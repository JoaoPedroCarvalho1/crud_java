use lojainformatica;

CREATE TABLE computador(
	id int auto_increment,
	marca varchar(30) NOT NULL,
    hd varchar(30) NOT NULL,
    processador varchar(30) NOT NULL,
    
    primary key (id)
)

select * from lojainformatica.computador;