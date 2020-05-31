INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'John', 'Doe', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'john.doe');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);

-- Populate customers table

INSERT INTO customers(id, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (1, 'Sandeep', '1000', 'AVAILABLE', '12345','EXACT',parsedatetime('30-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU12345','TXN12345','XXXAYY12345','R12345P','parsedatetime('31-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));




