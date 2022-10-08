package Homework.Odev3.DataAccess;

import Homework.Odev3.Entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);

    void delete(Category category);

    void update(Category category);

}
