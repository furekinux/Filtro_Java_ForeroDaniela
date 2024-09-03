create database Ninja;
use Ninja;

create table ninja(
	id_ninja int primary key auto_increment not null,
    nombre varchar(45) not null,
	rango varchar(20) not null,
    aldea varchar(30) not null
);

create table habilidad(
	id_ninja int not null,
    foreign key(id_ninja)references ninja(id_ninja),
    primary key(id_ninja),
    nombre varchar(45) not null,
	descripcion text not null
);

create table mision(
	id_mision int primary key auto_increment not null,
	descripcion text not null,
	rango varchar(20) not null,
    recompensa varchar(40) not null
);

create table mision_ninja(
	id_ninja int not null,
    foreign key(id_ninja)references ninja(id_ninja),
	id_mision int not null,
	foreign key(id_mision)references mision(id_mision),
    primary key(id_ninja,id_mision),
	fecha_inicio date not null,
    fecha_fin date not null
);