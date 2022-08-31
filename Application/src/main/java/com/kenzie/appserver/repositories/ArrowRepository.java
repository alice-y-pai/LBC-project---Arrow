package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.ArrowRecord;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

/***This file created by Alice Pai***/
@EnableScan
public interface ArrowRepository extends CrudRepository<ArrowRecord, String> {
}
