package com.bugtrack3.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bugtrack3.entity.ProjectEntity;

@Repository
public interface IProjectRepository extends CrudRepository<ProjectEntity, Long> {
	
	@Override
	public List<ProjectEntity> findAll();
}
