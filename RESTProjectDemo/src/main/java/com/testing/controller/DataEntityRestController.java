package com.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.model.DataEntity;
import com.testing.service.DataEntityService;

@RestController
@RequestMapping("api/data")
public class DataEntityRestController {
	
	@Autowired
	private DataEntityService dataService;
	
	@GetMapping("/intensity/{intensity}")
    public ResponseEntity<List<DataEntity>> getDataByIntensity(@PathVariable Integer intensity) {
        List<DataEntity> data = dataService.getIntensityData(intensity);
        return ResponseEntity.ok(data);
    }
}
