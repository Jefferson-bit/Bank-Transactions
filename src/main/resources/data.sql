
INSERT INTO tb_account (name, email, password) VALUES ('Kibutsujy Muzan', 'muzan@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_account (name, email, password) VALUES ('Kamado Tanjiro',  'tanjiro@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_account (name, email, password) VALUES ('Jefferson Oliveira', 'jefferson@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');

INSERT INTO tb_account_role(account_id, role_id) VALUES (1,1);
INSERT INTO tb_account_role(account_id, role_id) VALUES (2,1);
INSERT INTO tb_account_role(account_id, role_id) VALUES (3,1);

INSERT INTO tb_transaction (account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (1, '8a8586c5718588a20171881b4bc86de3', '8a8587506b566dfd016b5add799444ec', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 1, -11.11, 2,100.0, 1, 0.0, 0);


INSERT INTO tb_transaction (account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (1, '8a8586c5718588a20171881b4bc86df8', '8a8587506b566dfd016b5add799444b3', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 2, -11.11, 1,1200.0, 1, 127.0, 4);


INSERT INTO tb_transaction (account_id, encoded_Key,arrangement_Id,booking_Date,value_Date,type_Transferency,amount,currency_Code,currency,type_Payment,running_Balance,counter_Party_Account_Number)
VALUES (2, '8a85879c715957a6017159875482105a', '8a8587506b566dfd016b5add799444ec', '2020-04-17T15:02:07.12345Z', '2020-04-17T15:02:07.12345Z', 3, -11.11, 2,5000.0, 1, 37.0, 0);

