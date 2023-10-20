package com.betrybe.agrix.dto;

import com.betrybe.agrix.model.entities.Crop;

/**
 * Javadoc.
 */
public record CropDto(Long id, String name, Double plantedArea, Long farmId) {
  public static CropDto convertToCrop(Crop crop) {
    return new CropDto(crop.getId(), crop.getName(), crop.getPlantedArea(), crop.getFarm().getId());
  }
}