package org.qrtt1.springboottestlab.service.impl

import org.qrtt1.springboottestlab.dto.UserDto
import org.qrtt1.springboottestlab.repository.UserRepository
import org.qrtt1.springboottestlab.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

    override fun createUser(userDto: UserDto): UserDto {
        println("invoke ${userRepository}")
        return userRepository.createUser(userDto)
    }
}