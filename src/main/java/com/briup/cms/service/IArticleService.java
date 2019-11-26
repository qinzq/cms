package com.briup.cms.service;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;

public interface IArticleService {
    void addArticle(Article article) throws CustomerException;
}
