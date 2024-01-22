INSERT INTO "public"."swtvap_orders" (id,client_id,code,other_date,status,address,subtotal,taxes,discount_amount,total,pick_up,) VALUES (2,2,'ORDER-00000001','06-01-2023 17:00:54',1,'Av. los heroes 1203 , SJM',100.39,10.2,5.10,110.80,1);
INSERT INTO "public"."swtvap_orders" (id,client_id,code,other_date,status,address,subtotal,taxes,discount_amount,total,pick_up,) VALUES (1,1,'ORDER-00000002','06-01-2023 17:00:54',1,'Av. los cedros 1123 , SPM',100.39,10.2,5.10,110.80,1);
INSERT INTO "public"."swtvap_orders" (id,client_id,code,other_date,status,address,subtotal,taxes,discount_amount,total,pick_up,) VALUES (3,3,'ORDER-00000003','06-01-2023 17:00:54',1,'Av. los pinares 3321, SJL',100.39,10.2,5.10,110.80,0);

INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (1, 1, 'PRODUCT-A00001', 'Madera de Cedro', 'Madera de Cedro', 1000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (2, null, 'PRODUCT-A00002', 'Madera de Pino', 'Madera de Pino', 500, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (3, null, 'PRODUCT-A00003', 'Madera de Roble', 'Madera de Roble', 2000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (4, 1, 'PRODUCT-A00004', 'Madera de Caoba', 'Madera de Caoba', 3000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (5, 1, 'PRODUCT-A00005', 'Madera de Nogal', 'Madera de Nogal', 4000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (6, 1, 'PRODUCT-A00006', 'Madera de Teca', 'Madera de Teca', 5000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (7, 1, 'PRODUCT-A00007', 'Madera de Cerezo', 'Madera de Cerezo', 6000, 100, 10, 1);

INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (1,'Mayra Sanchez','Av. Los Heroes 1203,San Juan de Miraflores,Lima', '011745684','961075081','+51','msanchez90@gmail.com',true,'All ok', 0);
INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (2,'Pedro Trujillo','Av. Defensores del Morro 152,Chorrillos, Lima', '011984848','961478981','+51','p_trujillo@gmail.com',false,'All ok', 1);
INSERT INTO "public"."swtvap_clients" (id, name, address, phone, cellphone, country_code, email, whatsapp, details,source_aggregate) VALUES (3,'Franklin Gomez','Av. del Pinar 650,Miraflores, Lima', '018123562','900514845','+51','fgomez_123@gmail.com',false,'All ok', 0);

INSERT INTO "public"."swtvap_orders_amounts" (id,order_id,name,amount) VALUES (1, 'CART_00000001', 'ORDERAMOUNTEST',100.40);
INSERT INTO "public"."swtvap_orders_amounts" (id,order_id,name,amount) VALUES (2, 'CART_00000002', 'ORDERAMOUNTEST',120.40);
INSERT INTO "public"."swtvap_orders_amounts" (id,order_id,name,amount) VALUES (3, 'CART_00000003', 'ORDERAMOUNTEST',140.40);


INSERT INTO "public"."swtvap_orders_details" (id, order_id, product_id, quantity, unit_price, subtotal, discount_percentage, other_details, status) VALUES (1, 1, 101, 3, 25.99, 77.97, 10, 'OrderDetail 1 details', 1);
INSERT INTO "public"."swtvap_orders_details" (id, order_id, product_id, quantity, unit_price, subtotal, discount_percentage, other_details, status) VALUES (2, 1, 102, 2, 19.95, 39.90, 5, 'OrderDetail 2 details', 0);
INSERT INTO "public"."swtvap_orders_details" (id, order_id, product_id, quantity, unit_price, subtotal, discount_percentage, other_details, status) VALUES (3, 2, 103, 5, 12.50, 62.50, 0, 'OrderDetail 3 details', 1);
INSERT INTO "public"."swtvap_orders_details" (id, order_id, product_id, quantity, unit_price, subtotal, discount_percentage, other_details, status) VALUES (4, 2, 104, 1, 45.75, 45.75, 15, 'OrderDetail 4 details', 0);
INSERT INTO "public"."swtvap_orders_details" (id, order_id, product_id, quantity, unit_price, subtotal, discount_percentage, other_details, status) VALUES (5, 3, 105, 4, 30.20, 120.80, 8, 'OrderDetail 5 details', 1);

INSERT INTO "public"."swtvap_orders_transactions" (id, order_id, payment_method, amount, transaction_date) VALUES (1, 1, 'Credit Card', '150.50', '2024-01-22');
INSERT INTO "public"."swtvap_orders_transactions" (id, order_id, payment_method, amount, transaction_date) VALUES (2, 1, 'PayPal', '80.25', '2024-01-23');
INSERT INTO "public"."swtvap_orders_transactions" (id, order_id, payment_method, amount, transaction_date) VALUES (3, 2, 'Cash', '200.00', '2024-01-24');
INSERT INTO "public"."swtvap_orders_transactions" (id, order_id, payment_method, amount, transaction_date) VALUES (4, 2, 'Bank Transfer', '120.75', '2024-01-25');
INSERT INTO "public"."swtvap_orders_transactions" (id, order_id, payment_method, amount, transaction_date) VALUES (5, 3, 'Credit Card', '90.99', '2024-01-26');