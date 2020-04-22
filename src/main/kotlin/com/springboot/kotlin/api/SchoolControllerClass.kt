package com.springboot.kotlin.api

import com.springboot.kotlin.model.School
import com.springboot.kotlin.service.SchoolServiceClass
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("school")
class SchoolControllerClass {

    @Autowired
    lateinit var service:SchoolServiceClass;

    @PostMapping("/addDetails")
    fun addDetailsOfSchool(@RequestBody school:School):String
    {
        service.addSchoolDetails(school);
        return "School Details Added";
    }

    @GetMapping("/getDetails")
    fun getSchools():List<School>
    {
        return service.getAllSchoolDetails();
    }
    @GetMapping("/getDetailsByName/{name}")
    fun getSchoolByName(@PathVariable name:String):List<School>
    {
        return service.getAllSchoolDetailsByName(name);
    }

    @DeleteMapping("/deleteSchool/{id}")
    fun deleteSchool(@PathVariable id: Int):List<School>
    {
        return service.deleteSchoolFromDatabase(id);
    }
    


}