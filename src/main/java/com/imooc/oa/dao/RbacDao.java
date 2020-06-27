package com.imooc.oa.dao;

import com.imooc.oa.entity.Node;
import com.imooc.oa.utils.MyBatisUtils;

import java.util.List;

public class RbacDao {
    public List<Node> selectNodeByUserId(Long userId){
        return (List)MyBatisUtils.executeQuery(sqlSession -> sqlSession.selectList("rbacmapper.selectNodeByUserId", userId));
    }
}
