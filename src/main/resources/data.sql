
INSERT INTO tb_account (name, email, password) VALUES ('Kibutsujy Muzan', 'muzan@gmail.com', '$2a$10$wv9OdTmlkv4xxcE8tqMXNOvp4JkyNcjn7i83kyp64mmHfx9psBBKa');
INSERT INTO tb_account (name, email, password) VALUES ('Kamado Tanjiro',  'tanjiro@gmail.com', '$2a$10$wv9OdTmlkv4xxcE8tqMXNOvp4JkyNcjn7i83kyp64mmHfx9psBBKa');
INSERT INTO tb_account (name, email, password) VALUES ('Jefferson Oliveira', 'jefferson@gmail.com', '$2a$10$wv9OdTmlkv4xxcE8tqMXNOvp4JkyNcjn7i83kyp64mmHfx9psBBKa');

INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_account_role(account_id, role_id) VALUES (1,1);
INSERT INTO tb_account_role(account_id, role_id) VALUES (2,1);
INSERT INTO tb_account_role(account_id, role_id) VALUES (3,2);

INSERT INTO tb_transaction (id, account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (1309 ,2, 'MUZAN', '8a8587506b566dfd016b5add799444ec', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 1, -11.11, 2,100.0, 1, 0.0, 0);

INSERT INTO tb_transaction (id, account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (1766, 1, 'TANJIRO', '8a8587506b566dfd016b5add799444ec', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 3, -11.11, 2,5000.0, 1, 37.0, 0);

INSERT INTO tb_transaction (id, account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (1204, 2, 'MACACO', '8a8587506b566dfd016b5add799444ec', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 3, -11.11, 2,5000.0, 1, 37.0, 0);
