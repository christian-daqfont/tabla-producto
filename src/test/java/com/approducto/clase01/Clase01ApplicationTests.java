package com.approducto.clase01;

import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.approducto.clase01.dao.IProducto;

@SpringBootTest
class Clase01ApplicationTests {
@Autowired
private IProducto iproducto;
	@Test
	void contextLoads() {
            List<Map<String, Object>> users = iproducto.readAll();

        assertThat(users);
	}

}
