package com.tns.applicationofbank;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {
	SavingAcc acc1;
	CurrentAcc acc2;
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		acc1=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return acc1;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal) {
		acc2=new MMCurrentAcc(accNo,accNm,accBal);
		return acc2;
	}

}
