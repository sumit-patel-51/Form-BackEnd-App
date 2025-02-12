package com.form.app.app.Services;

import org.springframework.stereotype.Service;

import com.form.app.app.Entitys.FormSubmission;
import com.form.app.app.Repository.FormRepository;

@Service
public class FormServices {

    private final FormRepository repository;

    public FormServices(FormRepository repository) {
        this.repository = repository;
    }

    public FormSubmission saveForm(FormSubmission formSubmission) {
       return repository.save(formSubmission);
    }
}
