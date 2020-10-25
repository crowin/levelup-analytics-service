package ru.levelup.bank.analytics.dao;

import javax.persistence.*;

@Entity
@Table(name = "balance", schema = "public", catalog = "bank_db")
public class BalanceEntity {
    private int balanceId;
    private double balanceAfter;
    private double balanceBefore;
    private String currency;
    private Integer accountId;
    private Integer transactionId;
    private AccountEntity accountByAccountId;
    private TransactionEntity transactionByTransactionId;

    @Id
    @Column(name = "balance_id")
    public int getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(int balanceId) {
        this.balanceId = balanceId;
    }

    @Basic
    @Column(name = "balance_after")
    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    @Basic
    @Column(name = "balance_before")
    public double getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(double balanceBefore) {
        this.balanceBefore = balanceBefore;
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
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "transaction_id")
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BalanceEntity that = (BalanceEntity) o;

        if (balanceId != that.balanceId) return false;
        if (Double.compare(that.balanceAfter, balanceAfter) != 0) return false;
        if (Double.compare(that.balanceBefore, balanceBefore) != 0) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = balanceId;
        temp = Double.doubleToLongBits(balanceAfter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(balanceBefore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @ManyToOne
    @JoinColumn(name = "transaction_id", referencedColumnName = "transaction_id")
    public TransactionEntity getTransactionByTransactionId() {
        return transactionByTransactionId;
    }

    public void setTransactionByTransactionId(TransactionEntity transactionByTransactionId) {
        this.transactionByTransactionId = transactionByTransactionId;
    }
}
