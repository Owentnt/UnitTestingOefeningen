package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    Product product1 = new Product(null, 33, 40);

    @Test
    void ProductDescription_NameIsNull_ReturnsNullPointerException() {
    }

}


//name is null
//size is null
// perc is null
// correct description
// geheel getal
// kommagetal