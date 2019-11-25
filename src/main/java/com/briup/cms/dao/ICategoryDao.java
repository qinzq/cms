package com.briup.cms.dao;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {
    Category findCategoryById(int id) throws CustomerException;
}
