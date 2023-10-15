package com.diovitor.santanderdevweek2023project.repository;

import com.diovitor.santanderdevweek2023project.model.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {


}
