package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ILinkService {
    void addLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    void updateLink(Link link) throws CustomerException;

    Link selectLinkById(int id) throws CustomerException;

    List<Link> selectAllLink() throws CustomerException;
}
