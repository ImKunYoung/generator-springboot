package com.example.org;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest(properties = {
    "spring.jpa.hibernate.ddl-auto=validate",
    "spring.test.database.replace=none",
    "spring.datasource.url=jdbc:tc:mariadb:11.0.3:///db"
})
class SchemaValidationTest {

    @Test
    void validateJpaMappingsWithDbSchema() {
    }
}
