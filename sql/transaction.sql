

create schema transactions;


create table transactions.life_ctr_client_transaction(
	ctr_auth_number serial primary key not null,
	ctr_date date not null,
	ctr_description varchar(100),
	ctr_amount float not null,
	ctr_id_client int not null,
	ctr_id_or_product int not null,
	ctr_id_des_product int not null,
	ctr_product_type varchar(1) not null
);

create table transactions.life_btr_benef_transaction(
	btr_auth_number serial primary key not null,
	btr_date date not null,
	btr_description varchar(100),
	btr_amount float not null,
	btr_id_client int not null,
	btr_id_bened int not null,
	btr_id_or_product int not null,
	btr_id_des_product int not null,
	btr_product_type varchar(1) not null
);

