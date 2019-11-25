package com.briup.cms.web.controller;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(description = "栏目管理")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/add")
    @ApiOperation("添加栏目")
    public Message addCategory(Category category) {
        categoryService.saveOrUpdate(category);
        return MessageUtil.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新栏目")
    public Message updateCategory(Category category) {
        categoryService.saveOrUpdate(category);
        return MessageUtil.success();
    }

    @GetMapping("/detele")
    @ApiOperation("删除栏目")
    @ApiImplicitParam(name = "id",value = "栏目id",paramType = "query",dataType = "int",required = true)
    public Message deleteCategory(int id) {
        categoryService.deleteCategoryById(id);
        return  MessageUtil.success();
    }


    @GetMapping("/findCategory")
    @ApiOperation("根据id查询栏目")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message<Category> findCategory(int id) {
        Category category = categoryService.findCategoryById(id);
        return MessageUtil.success(category);
    }

    @GetMapping("/findAllCategory")
    @ApiOperation("查询所有栏目")
    public Message<List<Category>> findAllCategoty() {
        List<Category> allCategory = categoryService.findAllCategory();
        return MessageUtil.success(allCategory);
    }

}
