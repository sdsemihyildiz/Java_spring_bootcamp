package Homework.Odev3.DataAccess.hibernate;

import Homework.Odev3.DataAccess.CategoryDao;
import Homework.Odev3.Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile kategori silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile kategori güncellendi.");
    }
}
