CREATE TABLE patients(
    id bigint primary key not null auto_increment,
    name varchar(100) not null,
    health_care int(8) not null,
    health_care_code varchar(100),
    age int(255) not null,
    phone varchar(100),
    email varchar(100) not null unique,
    street varchar(100) not null,
    district varchar(100) not null,
    cep varchar(9) not null,
    city varchar(100) not null,
    uf varchar(2) not null,
    number int(255) not null,
    complement varchar(100) not null
);