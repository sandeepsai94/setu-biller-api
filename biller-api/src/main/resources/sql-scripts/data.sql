-- INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
-- INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
-- INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'John', 'Doe', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'john.doe');
-- INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


-- INSERT INTO user_role(user_id, role_id) VALUES(1,1);
-- INSERT INTO user_role(user_id, role_id) VALUES(2,1);
-- INSERT INTO user_role(user_id, role_id) VALUES(2,2);

-- Populate customers table

INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (1, 'Sandeep', '1000', 'AVAILABLE', '12345','EXACT',parsedatetime('30-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU12345','TXN12345','XXXAYY12345','R12345P',parsedatetime('31-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (2, 'Sahil', '352533', 'AVAILABLE', '23456','EXACT',parsedatetime('28-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU23456','TXN23456','XXXAYY23456','R23456P',parsedatetime('30-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (3, 'Nikhil', '24573', 'AVAILABLE', '34567','EXACT',parsedatetime('21-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU34567','TXN34567','XXXAYY34567','R34567P',parsedatetime('29-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (4, 'Ruby', '27428', 'AVAILABLE', '45678','EXACT',parsedatetime('20-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU45678','TXN45678','XXXAYY45678','R45678P',parsedatetime('28-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (5, 'Harsha', '6887', 'AVAILABLE', '56789','EXACT',parsedatetime('06-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU56789','TXN56789','XXXAYY56789','R56789P',parsedatetime('27-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
INSERT INTO Customers(customerId, name, bill, billFetchStatus, billerBillId, amountExactness, generatedOn, recurrence, displayName, platformBillId, platformTransactionRefId, uniquePaymentRefId, receiptId, paymentDate) VALUES (6, 'Akshay', '48736', 'AVAILABLE', '67890','EXACT',parsedatetime('15-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'),'ONE_TIME','Total Outstanding','SETU67890','TXN67890','XXXAYY67890','R67890P',parsedatetime('26-05-2020 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
























