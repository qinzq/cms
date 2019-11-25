package com.briup.cms.web.controller;

import com.briup.cms.bean.Link;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/link")
@Api(description = "链接管理")
public class LinkController {
    @Autowired
    private ILinkService linkService;

    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkService.addOrUpdateLink(link);
        return MessageUtil.success();

    }

    @GetMapping("/detele")
    @ApiOperation("删除链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message deleteLink(int id) {
        linkService.deleteLink(id);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation("更新链接")
    public Message updateLink(Link link) {
        linkService.addOrUpdateLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/fingById")
    @ApiOperation("根据id查询链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message<Link> findLinkById(int id) {
        Link link = linkService.selectLinkById(id);
        return MessageUtil.success(link);
    }

    @GetMapping("/findAllLink")
    @ApiOperation("查询所有链接")
    public Message<List<Link>> findAllLink() {
        List<Link> links = linkService.selectAllLink();
        return MessageUtil.success(links);
    }
}
