package org.qrtt1.springboottestlab.repository

import org.qrtt1.springboottestlab.dto.UserDto
import org.qrtt1.springboottestlab.entity.User
import org.springframework.data.repository.CrudRepository


interface UserRepository: CrudRepository<User, Long> {

    fun createUser(user: UserDto): UserDto {
        TODO("no implement")
    }
}