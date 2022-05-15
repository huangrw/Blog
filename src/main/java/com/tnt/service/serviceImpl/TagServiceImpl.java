package com.tnt.service.serviceImpl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.tnt.dao.TagDao;
import com.tnt.entity.dto.BlogTag;
import com.tnt.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 00:06:00
 */
@Service
@Slf4j
public class TagServiceImpl implements TagService{
    @Autowired
    TagDao tagDao;

    @Override
    public int addTag(BlogTag blogTag) {

        int insertRes =0;
        try {
           insertRes =  tagDao.insertTag(blogTag.getTagName());
        }catch (Exception e){
            log.info("数据已存在,msg:{}",e.getMessage());
        }
        return insertRes;
    }

    @Override
    public List<BlogTag> getTags() {
        return tagDao.selectTags();
    }
}
