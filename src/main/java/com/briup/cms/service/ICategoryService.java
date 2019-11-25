package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ICategoryService {
    void saveOrUpdate(Category category) throws CustomerException;

    void deleteCategoryById(int id) throws CustomerException;

    Category findCategoryById(int id) throws CustomerException;

    List<Category> findAllCategory() throws CustomerException;
}
