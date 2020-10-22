package com.maximus.qicportaltestautomation.qic_object_model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PartCCases extends ForwardingSet<PartCCaseData> {
    private Set<PartCCaseData> delegate;

    public PartCCases(PartCCases partCCases){
        this.delegate = new HashSet<PartCCaseData>(partCCases.delegate);
    }

    public PartCCases(){this.delegate = new HashSet<PartCCaseData>();}

    public PartCCases(Collection<PartCCaseData> partCCases){this.delegate=new HashSet<PartCCaseData>(partCCases);}



    @Override
    protected Set<PartCCaseData> delegate() {
        return delegate;
    }
}
