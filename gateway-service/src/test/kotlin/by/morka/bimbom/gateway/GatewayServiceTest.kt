package by.morka.bimbom.gateway

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class GatewayServiceTest {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun testApplicationContext() {
        assertNotNull(applicationContext)
    }
}