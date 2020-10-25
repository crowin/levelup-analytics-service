package ru.levelup.bank.analytics.dao;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "account", schema = "public", catalog = "bank_db")
public class AccountEntity {
    private int accountId;
    private String accNumber;
    private String currencyCode;
    private Integer clientId;
    private ClientEntity clientByClientId;
    private Collection<BalanceEntity> balancesByAccountId;

    @Id
    @Column(name = "account_id")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "acc_number")
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @Basic
    @Column(name = "currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "client_id")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (accountId != that.accountId) return false;
        if (accNumber != null ? !accNumber.equals(that.accNumber) : that.accNumber != null) return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId;
        result = 31 * result + (accNumber != null ? accNumber.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<BalanceEntity> getBalancesByAccountId() {
        return balancesByAccountId;
    }

    public void setBalancesByAccountId(Collection<BalanceEntity> balancesByAccountId) {
        this.balancesByAccountId = balancesByAccountId;
    }
}
