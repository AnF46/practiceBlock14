package ru.netology.practiceblock14.prodcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product item1 = new Product(1, "апельсин", 123);
    Product item2 = new Product(2, "мюсли", 250);
    Product item3 = new Product(3, "сахар", 80);

    @Test
    public void ShouldFindByIdTest() {
//        первый должен проверять успешность удаления существующего элемента,
        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Assertions.assertEquals(item2, repo.findById(2));
    }

    @Test
    public void shouldRemoveByIdTest() {
        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        repo.remove(2);

        Product[] expected = {item1,item3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
