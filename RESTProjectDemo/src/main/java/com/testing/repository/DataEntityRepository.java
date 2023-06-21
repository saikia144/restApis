package com.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.model.DataEntity;

public interface DataEntityRepository extends JpaRepository<DataEntity, Long>{
	
	List<DataEntity> findByIntensity(Integer intensity);
	List<DataEntity> findByLikelihood(Integer likelihood);
	List<DataEntity> findByStartYear(Integer startYear);
	List<DataEntity> findByEndYear(Integer endYear);
	List<DataEntity> findByCountry(String country);
	List<DataEntity> findByTopic(String topic);
	List<DataEntity> findByRegion(String region);
	List<DataEntity> findByCity(String city);
	
}
