package com.briup.cms.service.impl;

import com.briup.cms.bean.Link;
import com.briup.cms.dao.ILinkDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements ILinkService {

    @Autowired
    private ILinkDao linkDao;

    @Override
    public void addOrUpdateLink(Link link) throws CustomerException {
        if (link == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        linkDao.save(link);
    }

    @Override
    public void deleteLink(int id) throws CustomerException {
        linkDao.deleteById(id);
    }


    @Override
    public Link selectLinkById(int id) throws CustomerException {
        return linkDao.findLinkById(id);
    }

    @Override
    public List<Link> selectAllLink() throws CustomerException {
        return linkDao.findAll();
    }
}
