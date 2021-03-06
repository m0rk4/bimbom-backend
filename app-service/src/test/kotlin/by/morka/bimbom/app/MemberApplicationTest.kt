package by.morka.bimbom.app

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class MemberApplicationTest {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun testApplicationContext() {
        assertNotNull(applicationContext)
    }
}