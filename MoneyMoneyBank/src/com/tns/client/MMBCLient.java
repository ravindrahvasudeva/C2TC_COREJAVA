package com.tns.client;

import com.tns.applicationofbank.MMBankFactory;
import com.tns.applicationofbank.MMCurrentAcc;
import com.tns.applicationofbank.MMSavingAcc;

public class MMBCLient {
	public static void main(String[] args) {
		MMBankFactory factory=new MMBankFactory();
		MMCurrentAcc gsn=(MMCurrentAcc)factory.getNewCurrentAccount(787878787, "Ravindra", 5050.00f);
		gsn.withdraw(gsn.getaccBal());
		MMSavingAcc gsp=(MMSavingAcc) factory.getNewSavingAccount(1218529622, "vasudeva", 6000.00f, true);
		gsp.withdraw(gsp.getaccBal());
	}

}