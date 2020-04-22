package com.springboot.kotlin.dao

import com.springboot.kotlin.model.School
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
import org.springframework.data.jpa.repository.JpaRepository

interface SchoolRepo : JpaRepository<School,Int> {
    fun findAllByName(name:String):List<School>;


}