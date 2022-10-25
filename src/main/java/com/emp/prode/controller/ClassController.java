package com.emp.prode.controller;

import com.emp.prode.model.service.ClassService;
import org.json.JSONObject;

public class ClassController
{
    public JSONObject create(String username, String subject)
    {
        ClassService classService = new ClassService();
        return new JSONObject(classService.create(username, subject));
    }
}
