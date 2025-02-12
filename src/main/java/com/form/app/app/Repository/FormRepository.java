package com.form.app.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.app.app.Entitys.FormSubmission;

@Repository
public interface FormRepository extends JpaRepository<FormSubmission, Long>{

}
