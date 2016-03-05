-- Not being run by liquibase
-- Only for adhoc query purpose
create table miembro (
    id integer not null,
    pangalan varchar(100),
    apelyido varchar(100),
    username varchar(50) not null unique,
    password varchar(255) not null,
    constraint miembro_pkey primary key (id)
);

create table serye (
    id int not null,
    umpisa timestamp with time zone,
    tapos timestamp with time zone,
    constraint serye_pkey primary key (id)
);

create table bangko (
    id int not null,
    miembroId int references miembro(id),
    magkano money not null,
    kailan timestamp with time zone,
    transaksyon varchar(10) not null,
    seryeId int references serye(id),
    constraint hulog_pkey primary key (id)
);