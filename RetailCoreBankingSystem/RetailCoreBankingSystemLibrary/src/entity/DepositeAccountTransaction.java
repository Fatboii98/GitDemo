/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import util.enumeration.DepositAccountType;
import util.enumeration.TransactionStatus;
import util.enumeration.TransactionType;

/**
 *
 * @author yeowh
 */
@Entity
public class DepositeAccountTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depositeAccountTransactionId;
    private Date transactionDateTime;
    private TransactionType type;
    private String code;
    private String reference;
    private BigDecimal amount;
    private TransactionStatus status;
    
    public Long getDepositeAccountTransactionId() {
        return depositeAccountTransactionId;
    }

    public void setDepositeAccountTransactionId(Long depositeAccountTransactionId) {
        this.depositeAccountTransactionId = depositeAccountTransactionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depositeAccountTransactionId != null ? depositeAccountTransactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the depositeAccountTransactionId fields are not set
        if (!(object instanceof DepositeAccountTransaction)) {
            return false;
        }
        DepositeAccountTransaction other = (DepositeAccountTransaction) object;
        if ((this.depositeAccountTransactionId == null && other.depositeAccountTransactionId != null) || (this.depositeAccountTransactionId != null && !this.depositeAccountTransactionId.equals(other.depositeAccountTransactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DepositeAccountTransaction[ id=" + depositeAccountTransactionId + " ]";
    }

    /**
     * @return the transactionDateTime
     */
    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * @param transactionDateTime the transactionDateTime to set
     */
    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    /**
     * @return the type
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TransactionType type) {
        this.type = type;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the status
     */
    public TransactionStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
    
}
