package org.qrtt1.springboottestlab.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long?,

        @Column
        var name: String

) : Serializable
