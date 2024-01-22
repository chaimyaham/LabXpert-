package com.aitnacer.LabXpert.service;

import com.aitnacer.LabXpert.dtos.ReactifDto;

import java.util.List;

public interface IReactif {
    public ReactifDto createRecatif(ReactifDto reactifdto);
    public ReactifDto updatedRectif(ReactifDto reactifdto);
    public void deleteRectif(long id);

    public List<ReactifDto> getAllReactif();
    public ReactifDto getReactifById(Long id);
}
