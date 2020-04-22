package com.springboot.kotlin.model

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.net.Inet4Address
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
data class School(
        @Id
        @GeneratedValue
        var id:Int=0,
          var name:String="",
        var address: String="",
        var rank:Int=0
        ) {

}