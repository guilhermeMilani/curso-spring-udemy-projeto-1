INSERT INTO tb_user(name, email, phone, password) VALUES ('Maria', 'maria@gmail.com', '99999999', '12345');
INSERT INTO tb_user(name, email, phone, password) VALUES ('João', 'joao@gmail.com', '88888888', 'abcde');
INSERT INTO tb_user(name, email, phone, password) VALUES ('Ana', 'ana@gmail.com', '77777777', 'senha123');
INSERT INTO tb_user(name, email, phone, password) VALUES ('Lucas', 'lucas@gmail.com', '66666666', 'mypassword');
INSERT INTO tb_user(name, email, phone, password) VALUES ('Fernanda', 'fernanda@gmail.com', '55555555', '123456');

INSERT INTO tb_order (client_id, order_status, moment) VALUES (1, 1, '2024-09-29T15:30:00Z');
INSERT INTO tb_order (client_id, order_status, moment) VALUES (2, 2, '2024-09-30T10:15:30Z');
INSERT INTO tb_order (client_id, order_status, moment) VALUES (3, 3, '2024-10-01T08:45:00Z');
INSERT INTO tb_order (client_id, order_status, moment) VALUES (4, 2, '2024-10-02T12:00:00Z');
INSERT INTO tb_order (client_id, order_status, moment) VALUES (5, 1, '2024-10-03T14:30:00Z');

INSERT INTO tb_category (id, name) VALUES (1, 'Eletrônicos');
INSERT INTO tb_category (id, name) VALUES (2, 'Roupas');
INSERT INTO tb_category (id, name) VALUES (3, 'Alimentos');
INSERT INTO tb_category (id, name) VALUES (4, 'Móveis');
INSERT INTO tb_category (id, name) VALUES (5, 'Livros');

INSERT INTO tb_product (id, name, description, price) VALUES (1, 'Smartphone', 'Smartphone com câmera de 64MP', 1999.99);
INSERT INTO tb_product (id, name, description, price) VALUES (2, 'Camiseta', 'Camiseta de algodão, tamanho M', 49.99);
INSERT INTO tb_product (id, name, description, price) VALUES (3, 'Chocolate', 'Chocolate ao leite, 200g', 9.99);
INSERT INTO tb_product (id, name, description, price) VALUES (4, 'Sofá', 'Sofá de 3 lugares, cor cinza', 1599.99);
INSERT INTO tb_product (id, name, description, price) VALUES (5, 'Livro de receitas', 'Livro com 100 receitas fáceis', 39.99);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 5);

INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1,1,2,(SELECT price FROM tb_product WHERE id = 1));
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1,2,4,(SELECT price FROM tb_product WHERE id = 2));
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (3,3,1,(SELECT price FROM tb_product WHERE id = 3));