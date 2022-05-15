package com.tnt.service.serviceImpl;

import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.tnt.dao.TypeDao;
import com.tnt.entity.dto.BlogType;
import com.tnt.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 23:42:00
 */
@Service
@Slf4j
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeDao typeDao;

    @Override
    public int addType(BlogType blogType) {
        int insertRes = 0;
        try {
             insertRes = typeDao.insertType(blogType.getTypeName());
        }catch (Exception e){
            log.info("数据已存在,msg:{}",e.getMessage());
        }
        return insertRes;
    }

    @Override
    public List<BlogType> getTypes() {
        return typeDao.selectTypes();
    }
}
