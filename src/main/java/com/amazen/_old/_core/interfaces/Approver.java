package com.amazen._old._core.interfaces;

import com.amazen._old._core.approvers.MembershipProcessPOJO;

public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public abstract void approve(MembershipProcessPOJO membershipProcessPOJO);

}