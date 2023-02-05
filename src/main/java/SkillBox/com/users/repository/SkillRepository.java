package SkillBox.com.users.repository;

import SkillBox.com.users.entity.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}