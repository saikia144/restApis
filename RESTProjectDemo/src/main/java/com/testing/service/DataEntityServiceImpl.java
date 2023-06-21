package com.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.model.DataEntity;
import com.testing.repository.DataEntityRepository;

@Service
public class DataEntityServiceImpl implements DataEntityService{
	
	@Autowired
	DataEntityRepository dataRepo;
	
	
	@Override
	public List<DataEntity> getIntensityData(Integer intensity) {
		return dataRepo.findByIntensity(intensity);
	}

	@Override
	public List<DataEntity> getLikelihoodData(Integer likelihood) {
		return dataRepo.findByLikelihood(likelihood);
	}

	@Override
	public List<DataEntity> getStartYearData(Integer startYear) {
		return dataRepo.findByStartYear(startYear);
	}

	@Override
	public List<DataEntity> getEndYearData(Integer endYear) {
		return dataRepo.findByEndYear(endYear);
	}

	@Override
	public List<DataEntity> getCountryData(String country) {
		return dataRepo.findByCountry(country);
	}

	@Override
	public List<DataEntity> getTopicData(String topic) {
		return dataRepo.findByTopic(topic);
	}

	@Override
	public List<DataEntity> getRegionData(String region) {
		return dataRepo.findByRegion(region);
	}

	@Override
	public List<DataEntity> getCityData(String city) {
		return dataRepo.findByCity(city);
	}

}
