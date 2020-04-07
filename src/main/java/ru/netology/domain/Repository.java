package ru.netology.domain;

public class Repository {
    Product[] repo = {new Book(1, "Death is a lonely business", 300, "Ray Bradbury"),
            new Book(2, "I heard you paint houses", 500, "Charles Brandt"),
            new Book(3, "Autobiography", 400, "Helmut Newton"),
            new Smartphone(1, "11 Pro", 90000, "iPhone"),
            new Smartphone(2, "Galaxy A50", 10000, "Samsung"),
            new Smartphone(3, "P20", 30000, "Huawei")};


    Smartphone smartphone = new Smartphone(4, "7 Pro", 45000, "OnePlus");
    Book book = new Book(4, "The Raven", 100, "Edgar Allan Poe");


    public void saveProduct(Product item) {
        Product[] newRepo = new Product[repo.length + 1];
        System.arraycopy(repo, 0, newRepo,0, repo.length);
        int lastIndex = newRepo.length - 1;
        newRepo[lastIndex] = item;
        repo = newRepo;
    }


    public Product[] findAll() {
        return repo;
    }

    public void removeByID(int id) {
        boolean exist = false;
        for (Product item : repo) {
            if (item.getId() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            Product[] newRepo = new Product[repo.length - 1];
            int index = 0;
            for (Product item : repo) {
                if (item.getId() != id) {
                    newRepo[index] = item;
                    index++;
                }
            }
            repo = newRepo;
        }
    }
}
