package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductManager {
    private Repository repository;
    public void addProduct(Product item) {
        repository.saveProduct(item);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }

        return result;
    }

    public boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }

            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }

        }

        else
            if (product instanceof Smartphone) {
            Smartphone phone = (Smartphone) product;
            if (phone.getManufacturer().equalsIgnoreCase(search)) {
                return true;
            }

            if (phone.getName().equalsIgnoreCase(search)) {
                return true;
            }

        }

        return false;

    }
}
