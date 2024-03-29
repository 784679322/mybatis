package com.chinajey.admin.jpa;

import com.chinajey.admin.jpa.BaseDao;
import com.chinajey.admin.jpa.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class ServiceImpl<M extends BaseDao<T>,T> implements IService<T> {

    @Autowired
    protected M  baseDao;

    @Override
    public int save(T bean) {
        try {
            baseDao.save(bean);
            return 1;
        }catch (Exception e) {
            return -1;
        }
    }

    @Override
    public int update(T bean) {
        try {
            baseDao.update(bean);
            return 1;
        }catch (Exception e) {
            return -1;
        }
    }

    @Override
    public int delete(Serializable id) {
        return baseDao.delete(id);
    }

    @Override
    public void batchDelete(List<? extends Serializable> ids) {
        baseDao.batchDelete(ids);
    }

    @Override
    public void batchAdd(List<T> datas) {
        baseDao.batchSave(datas);
    }

    @Override
    public void batchUpdate(List<T> datas) {
        baseDao.batchUpdate(datas);
    }

    @Override
    public List<T> listAll() {
        return baseDao.findAll();
    }

    @Override
    public List<T> listEqualField(String fieldName, Object value) {
        return baseDao.findEqualField(fieldName,value);
    }

    @Override
    public List<T> listLikeField(String fieldName, String value) {
        return baseDao.findLikeField(fieldName,value);
    }

    @Override
    public List<T> listBetweenField(String fieldName, Object start, Object end) {
        return baseDao.findBetweenField(fieldName,start,end);
    }
}
