package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.model.repositories.CropRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Javadoc.
 */
@Service
public class CropService {

  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  public Crop create(Crop crop, Farm farm) {
    crop.setFarm(farm);
    return cropRepository.save(crop);
  }

  public List<Crop> getByFarmId(Long farmId) {
    return cropRepository.findByFarmId(farmId);
  }

  public List<Crop> findAll() {
    return cropRepository.findAll();
  }

  public Optional<Crop> getCropById(Long id) {
    return cropRepository.findById(id);
  }
}