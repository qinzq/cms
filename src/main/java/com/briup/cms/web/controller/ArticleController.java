package com.briup.cms.web.controller;

import com.briup.cms.bean.Article;
import com.briup.cms.bean.Category;
import com.briup.cms.service.IArticleService;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
@Api(description = "信息管理")
public class ArticleController {

    @Autowired
    private IArticleService articleService;



    @PostMapping("/add")
    @ApiOperation(value = "添加信息",notes = "栏目编号 信息点击次数 发布时间不填")
    public Message addArticle(Article article) {
        articleService.addArticle(article);
        return MessageUtil.success();
    }
}
