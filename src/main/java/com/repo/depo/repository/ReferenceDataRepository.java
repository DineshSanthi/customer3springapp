package com.repo.depo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import com.repo.depo.model.ReferenceData;
@Repository
public interface ReferenceDataRepository extends MongoRepository<ReferenceData, String> {

	Optional<ReferenceData> findById(String id);

	void deleteById(String id);
}
