package org.qrtt1.springboottestlab.service

import org.qrtt1.springboottestlab.dto.UserDto

interface UserService {
    fun createUser(userDto: UserDto): UserDto
}
