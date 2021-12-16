drop table if exists sales;
drop table if exists nomenclature;
drop table if exists executors;
drop table if exists customers;

CREATE TABLE customers (id SERIAL PRIMARY KEY,first_name VARCHAR (45),last_name VARCHAR (45),middle_name VARCHAR (45),phone_number VARCHAR (45));
CREATE TABLE executors (id SERIAL PRIMARY KEY,first_name VARCHAR (45),last_name VARCHAR (45),phone_number VARCHAR (45));
CREATE TABLE nomenclature (id SERIAL PRIMARY KEY,name VARCHAR (45));
CREATE TABLE sales (id SERIAL PRIMARY KEY,customer_id integer,end_date timestamp,executor_id integer,nomenclature_id integer,notes text,price integer,start_date timestamp, foreign key (customer_id) references customers(id),foreign key (executor_id) references executors(id), foreign key (nomenclature_id) references nomenclature(id));

--INSERT INTO customers (id, first_name, last_name, middle_name, phone_number) VALUES (1, 'Denis', 'Dens', 'Deni', '89923002057');



