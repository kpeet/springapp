CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO kpeet@'%' IDENTIFIED BY 'kpeet';
GRANT ALL ON springapp.* TO kpeet@localhost IDENTIFIED BY 'kpeet';

USE springapp;

CREATE TABLE products (
  id INTEGER PRIMARY KEY,
  description varchar(255),
  price decimal(15,2)
);
CREATE INDEX products_description ON products(description);