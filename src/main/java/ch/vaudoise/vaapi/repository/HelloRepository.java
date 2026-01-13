package ch.vaudoise.vaapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.vaudoise.vaapi.entity.HelloEntity;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
}