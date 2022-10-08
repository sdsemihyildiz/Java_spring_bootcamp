package Homework.Odev3.Business;

import Homework.Odev3.Core.Logging.BaseLogger;
import Homework.Odev3.DataAccess.CategoryDao;
import Homework.Odev3.Entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private BaseLogger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {


        for (Category c : categories) {
            if (c.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori adı daha önce kullanılmış, başka bir isim seçiniz.");

            }

        }
        categoryDao.add(category);
        categories.add(category);
        for (BaseLogger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
