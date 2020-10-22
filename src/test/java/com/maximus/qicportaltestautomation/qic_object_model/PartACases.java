package com.maximus.qicportaltestautomation.qic_object_model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PartACases extends ForwardingSet<PartACaseData> {
    private Set<PartACaseData> delegate;

    public PartACases(PartACases partACases){
        this.delegate = new HashSet<PartACaseData>(partACases.delegate);
    }

    public PartACases(){this.delegate = new HashSet<PartACaseData>();}

    public PartACases(Collection<PartACaseData> partACases){this.delegate=new HashSet<PartACaseData>(partACases);}

    @Override
    protected Set<PartACaseData> delegate() {
        return delegate;
    }
}
