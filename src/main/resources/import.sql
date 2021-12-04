drop table if exists customers;
drop table if exists executors;
drop table if exists nomenclature;
drop table if exists sales;
drop table if exists specializations;

CREATE TABLE customers (id SERIAL PRIMARY KEY,first_name VARCHAR (45),last_name VARCHAR (45),middle_name VARCHAR (45),phone_number VARCHAR (45));
CREATE TABLE executors (id SERIAL PRIMARY KEY,first_name VARCHAR (45),last_name VARCHAR (45),phone_number VARCHAR (45));
CREATE TABLE nomenclature (id SERIAL PRIMARY KEY,name VARCHAR (45));
CREATE TABLE sales (id SERIAL PRIMARY KEY,customer_id integer,end_date timestamp,executor_id integer,nomenclature_id integer,notes text,price numeric,start_date timestamp, foreign key (customer_id) references customers(id),foreign key (executor_id) references executors(id), foreign key (nomenclature_id) references nomenclature(id));

--INSERT INTO public.customers (id, first_name, last_name, phone_number) VALUES (1, 'Denis', 'de', '899');
--INSERT INTO public.sales (id, customer_id, end_date, executor_id, nomenclature_id, notes, price, start_date) VALUES (1, 1, '2021-12-01 20:06:44.000000', 567, 567, '567', 567.00, '2021-12-01 20:07:44.000000');


