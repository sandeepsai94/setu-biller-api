CREATE TABLE Customers (
  customerId varchar(20) NOT NULL AUTO_INCREMENT,
  name varchar(255),
  bill varchar(255),
  billFetchStatus varchar(50) DEFAULT NULL,
  billerBillId varchar(50) DEFAULT NULL,
  amountExactness varchar(50) DEFAULT NULL,
  generatedOn date DEFAULT NULL,
  recurrence varchar(50) DEFAULT NULL,
  displayName varchar(50) DEFAULT NULL,
  platformBillId varchar(50) DEFAULT NULL,
  platformTransactionRefId varchar(50) DEFAULT NULL,
  uniquePaymentRefId varchar(50) DEFAULT NULL,
  receiptId varchar(50) DEFAULT NULL,
  paymentDate date DEFAULT NULL,
  PRIMARY KEY (customerId)
);

