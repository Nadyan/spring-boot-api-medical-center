CREATE TABLE doctors(
    id bigint primary key not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    street varchar(100) not null,
    district varchar(100) not null,
    cep varchar(9) not null,
    city varchar(100) not null,
    uf varchar(2) not null,
    number int(255) not null,
    complement varchar(100) not null
);
