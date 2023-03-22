/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import util.enumeration.DepositAccountType;

/**
 *
 * @author yeowh
 */
@Entity
public class DepositAccount implements Serializable {

    /**
     * @return the accounType
     */
    public DepositAccountType getAccounType() {
        return accounType;
    }

    /**
     * @param accounType the accounType to set
     */
    public void setAccounType(DepositAccountType accounType) {
        this.accounType = accounType;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depositeAccountId;
    private String accountNumber;
    private DepositAccountType accounType;
    private BigDecimal holdBalance;
    private BigDecimal ledgerBalance;
    private Boolean enabled;

    public Long getDepositeAccountId() {
        return depositeAccountId;
    }

    public void setDepositeAccountId(Long depositeAccountId) {
        this.depositeAccountId = depositeAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depositeAccountId != null ? depositeAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the depositeAccountId fields are not set
        if (!(object instanceof DepositAccount)) {
            return false;
        }
        DepositAccount other = (DepositAccount) object;
        if ((this.depositeAccountId == null && other.depositeAccountId != null) || (this.depositeAccountId != null && !this.depositeAccountId.equals(other.depositeAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DepositAccount[ id=" + depositeAccountId + " ]";
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the holdBalance
     */
    public BigDecimal getHoldBalance() {
        return holdBalance;
    }

    /**
     * @param holdBalance the holdBalance to set
     */
    public void setHoldBalance(BigDecimal holdBalance) {
        this.holdBalance = holdBalance;
    }

    /**
     * @return the ledgerBalance
     */
    public BigDecimal getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * @param ledgerBalance the ledgerBalance to set
     */
    public void setLedgerBalance(BigDecimal ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    /**
     * @return the enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
}
