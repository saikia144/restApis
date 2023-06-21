package com.testing.service;

import java.util.List;

import com.testing.model.DataEntity;


public interface DataEntityService {
	List<DataEntity> getIntensityData(Integer intensity);
	List<DataEntity> getLikelihoodData(Integer likelihood);
	List<DataEntity> getStartYearData(Integer startYear);
	List<DataEntity> getEndYearData(Integer endYear);
	List<DataEntity> getCountryData(String country);
	List<DataEntity> getTopicData(String topic);
	List<DataEntity> getRegionData(String region);
	List<DataEntity> getCityData(String city);
}
