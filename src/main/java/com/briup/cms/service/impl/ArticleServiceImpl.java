package com.briup.cms.service.impl;

import com.briup.cms.bean.Article;
import com.briup.cms.dao.IArticleDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.IArticleService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public void addArticle(Article article) throws CustomerException {
        if(article == null || article.getCategory() == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        article.setPublishDate(new Date());
        article.setClickTimes(0);
        articleDao.save(article);
    }
}
