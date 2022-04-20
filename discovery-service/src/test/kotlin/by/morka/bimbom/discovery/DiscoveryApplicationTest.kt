package by.morka.bimbom.discovery

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class DiscoveryApplicationTest {

    @Autowired
    private lateinit var context: ApplicationContext

    @Test
    fun testApplicationContext() {
        assertNotNull(context)
    }
}
