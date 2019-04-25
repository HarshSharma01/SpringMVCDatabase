package com.io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.dao.TransactionDao;
import com.io.model.TransactionDetails;

@Transactional
@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao tDao;

	public int deposit(int accountNo, int amt) {
		// TODO Auto-generated method stub
		return tDao.deposit(accountNo, amt);
	}

	public int withdraw(int accountNo, int amt) {
		// TODO Auto-generated method stub
		return tDao.withdraw(accountNo, amt);
	}

	public int showBalance(int accountNo) {
		// TODO Auto-generated method stub
		return tDao.showBalance(accountNo);
	}

	public TransactionDetails fundTransfer(int accountNo, TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return tDao.fundTransfer(accountNo, transaction);
	}

	public boolean insertTransaction(TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return tDao.insertTransaction(transaction);
	}
	
}
