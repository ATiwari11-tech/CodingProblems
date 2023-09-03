package com.LLD.parkinglot.models;

public class Gate extends BaseModel{
    private GateType gateType;

    public GateType getGateType() {
        return gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    private int gateNumber;
    private Operator currentOperator;
    private GateStatus gateStatus;
}
