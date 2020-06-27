package com.imooc.oa.service;

import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.entity.Employee;
import com.imooc.oa.utils.MyBatisUtils;

public class EmployeeService {
    public Employee selectById(Long employeeId){
        return (Employee) MyBatisUtils.executeQuery(sqlSession -> {
            EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
            return employeeDao.selectById(employeeId);
        });
    }
}
