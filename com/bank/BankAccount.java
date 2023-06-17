package com.bank;

import com.actions.Writable;
import com.actions.Readable;

public abstract class BankAccount extends Test implements CardBankable, Writable, Readable {
    public BankAccount(String money) {
        super(money);
    }

    protected String money;

    public void getMoney(int amount) {
        System.out.println("vous avez retiré" + amount + "euros");
    }

    public void getInfo(String data) {
        System.out.println(data);
    }
}
