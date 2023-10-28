package com.stackr.stackrDataObjects;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LzMetaDataRepository extends MongoRepository<LzMetaData, String> {

    public LzMetaData findByLzId(String lzId);
}
