package com.assignmenttask.crud.repo;

import com.assignmenttask.crud.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface userrepo extends JpaRepository<user,Long>{
    user save(user entity);

    user findByIdIs(Long id);

    List<user> findAll();

    user deleteBy(Long id);
}
