package ru.netology.practiceblock14.prodcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotFoundExceptionTest {

    Product item1 = new Product(1, "апельсин", 123);
    Product item2 = new Product(2, "мюсли", 250);

    @Test
    public void shouldSnowExceptionMsg() {
        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);

        Assertions.assertThrows(NotFoundException.class, () -> {
           repo.remove(44);
        });
    }
}
