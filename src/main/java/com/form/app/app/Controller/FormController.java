package com.form.app.app.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.app.app.Entitys.FormSubmission;
import com.form.app.app.Services.FormServices;


@RestController
@RequestMapping("/api/form")
@CrossOrigin
public class FormController {
    private final FormServices formServices;

    public FormController(FormServices formServices) {
        this.formServices = formServices;
    }

    @PostMapping("/submit")
    public FormSubmission postMethodName(@RequestBody FormSubmission formSubmission) {
        return formServices.saveForm(formSubmission);
    }
    
}
