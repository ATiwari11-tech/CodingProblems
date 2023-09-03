package com.LLD.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    public Date getExitTime() {
        return exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
        return feesCalculatorStrategyType;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }

    private Date exitTime;
    private int  amount;
    private Ticket ticket;
    private Gate gate;
    private Operator generatedBy;
    private BillStatus billStatus;
    private List<Payment> payments;
    private FeesCalculatorStrategyType feesCalculatorStrategyType;
}
