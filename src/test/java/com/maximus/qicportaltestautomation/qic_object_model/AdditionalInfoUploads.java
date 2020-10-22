package com.maximus.qicportaltestautomation.qic_object_model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AdditionalInfoUploads extends ForwardingSet<AdditionalInfoUploadData> {
    private Set<AdditionalInfoUploadData> delegate;

public AdditionalInfoUploads(AdditionalInfoUploads additionalInfoUploads){
    this.delegate = new HashSet<AdditionalInfoUploadData>(additionalInfoUploads.delegate);
}

public AdditionalInfoUploads(){this.delegate = new HashSet<AdditionalInfoUploadData>();}

public AdditionalInfoUploads(Collection<AdditionalInfoUploadData> additionalInfoUploads){
    this.delegate = new HashSet<AdditionalInfoUploadData>(additionalInfoUploads);
}


    @Override
    protected Set<AdditionalInfoUploadData> delegate() {
        return delegate;
    }
}
