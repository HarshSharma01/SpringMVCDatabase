package com.io.dao;

import com.io.model.TransactionDetails;

public interface TransactionDao {
	int deposit(int accountNo, int amt);
	int withdraw(int accountNo, int amt);
	int showBalance(int accountNo);
	TransactionDetails fundTransfer(int accountNo, TransactionDetails transaction);
	boolean insertTransaction(TransactionDetails transaction);
}
