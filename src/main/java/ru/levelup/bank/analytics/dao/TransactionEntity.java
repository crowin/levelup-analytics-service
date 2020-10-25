package ru.levelup.bank.analytics.dao;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "transaction", schema = "public", catalog = "bank_db")
public class TransactionEntity {
    private int transactionId;
    private double amount;
    private String currency;
    private Timestamp transactionTime;
    private int accountReceiver;
    private Integer accountSender;
    private Collection<BalanceEntity> balancesByTransactionId;

    @Id
    @Column(name = "transaction_id")
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "transaction_time")
    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Basic
    @Column(name = "account_receiver")
    public int getAccountReceiver() {
        return accountReceiver;
    }

    public void setAccountReceiver(int accountReceiver) {
        this.accountReceiver = accountReceiver;
    }

    @Basic
    @Column(name = "account_sender")
    public Integer getAccountSender() {
        return accountSender;
    }

    public void setAccountSender(Integer accountSender) {
        this.accountSender = accountSender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionEntity that = (TransactionEntity) o;

        if (transactionId != that.transactionId) return false;
        if (Double.compare(that.amount, amount) != 0) return false;
        if (accountReceiver != that.accountReceiver) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (transactionTime != null ? !transactionTime.equals(that.transactionTime) : that.transactionTime != null)
            return false;
        if (accountSender != null ? !accountSender.equals(that.accountSender) : that.accountSender != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = transactionId;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (transactionTime != null ? transactionTime.hashCode() : 0);
        result = 31 * result + accountReceiver;
        result = 31 * result + (accountSender != null ? accountSender.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "transactionByTransactionId")
    public Collection<BalanceEntity> getBalancesByTransactionId() {
        return balancesByTransactionId;
    }

    public void setBalancesByTransactionId(Collection<BalanceEntity> balancesByTransactionId) {
        this.balancesByTransactionId = balancesByTransactionId;
    }
}
