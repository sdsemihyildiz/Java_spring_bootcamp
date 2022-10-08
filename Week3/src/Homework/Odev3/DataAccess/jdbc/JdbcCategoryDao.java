package Homework.Odev3.DataAccess.jdbc;

import Homework.Odev3.DataAccess.CategoryDao;
import Homework.Odev3.Entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile kategori eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile kategori silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile kategori güncellendi.");
    }
}
