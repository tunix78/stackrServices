package com.stackr;

import java.util.Collection;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackr.stackrDataObjects.LzMetaData;
import com.stackr.stackrDataObjects.LzMetaDataRepository;
import com.stackr.stackrRequestObjects.LzMetaDataPost;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/lzMetaData")
public class LzMetaDataServices {

    Logger logger = LogManager.getLogger(LzMetaDataServices.class);

    @Autowired
    private LzMetaDataRepository repository;
    
    @GetMapping("/all")
    public Collection<LzMetaData> getAllLzMetaData() {
        logger.debug("entering getAllLzMetaData()");
        List<LzMetaData> metadata = repository.findAll();
        logger.debug("returning metadata: " + metadata.size());
        return metadata;
    }

    @PostMapping(value = "/singleLz",
                 consumes = {MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LzMetaData> newLzMetaData(@Valid @RequestBody LzMetaDataPost metadataPost) {
        try {
            LzMetaData newLzMedataData = repository.save(new LzMetaData(metadataPost.getLzName(), metadataPost.getSubscriptionId()));
            logger.debug("entering newLzMetaData: " + newLzMedataData.toString());
            return new ResponseEntity<LzMetaData>(newLzMedataData, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Caught error: " + e.getLocalizedMessage());
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
