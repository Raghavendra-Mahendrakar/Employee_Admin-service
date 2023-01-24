package com.pws.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pws.employee.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
