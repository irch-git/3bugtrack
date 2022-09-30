package com.bugtrack3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bugtrack3.entity.MemberEntity;

@Repository
public interface IMemberRepository extends CrudRepository<MemberEntity, Long> {

}
