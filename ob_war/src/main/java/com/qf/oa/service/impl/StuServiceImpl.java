package com.qf.oa.service.impl;

import com.qf.entity.Student;
import com.qf.oa.dao.IStuDao;
import com.qf.oa.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private IStuDao stuDao;

    @Override
    public List<Student> queryAll() {
        return stuDao.queryAll();
    }
}
