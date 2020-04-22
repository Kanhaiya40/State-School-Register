package com.springboot.kotlin.service

import com.springboot.kotlin.dao.SchoolRepo
import com.springboot.kotlin.model.School
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SchoolServiceClass {

    @Autowired
   lateinit var daoSchool:SchoolRepo;

    fun addSchoolDetails(school:School):School
    {
        return daoSchool.save(school);
    }

    fun getAllSchoolDetails():List<School>
    {
        return daoSchool.findAll();
    }

    fun getAllSchoolDetailsByName(name: String):List<School>
    {
        return daoSchool.findAllByName(name);
    }
    fun deleteSchoolFromDatabase(id:Int):List<School>
    {
        daoSchool.deleteById(id);
        return daoSchool.findAll();
    }
}