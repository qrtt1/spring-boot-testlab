package org.qrtt1.springboottestlab.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.qrtt1.springboottestlab.dto.UserDto
import org.qrtt1.springboottestlab.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import java.lang.AssertionError

@SpringBootTest
class UserServiceTests {

    @Autowired
    lateinit var userService: UserService

    @MockBean
    lateinit var userRepository: UserRepository

    @Test
    fun `test user service`() {
        Mockito.`when`(userRepository.createUser(UserDto(null, "9527"))).thenReturn(
                UserDto(9527, "5566")
        )
        val user: UserDto = userService.createUser(UserDto(null, "9527"))
        Assertions.assertEquals(9527, user.id)
        Assertions.assertEquals("5566", user.name)
    }
}