package com.imooc.oa.dao;

import com.imooc.oa.entity.ProcessFlow;
import com.imooc.oa.utils.MyBatisUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ProcessFlowDaoTest {

    @Test
    public void testInsert() {
        MyBatisUtils.executeUpdate(sqlSession -> {
            ProcessFlowDao dao = sqlSession.getMapper(ProcessFlowDao.class);
            ProcessFlow flow = new ProcessFlow();
            flow.setFormId(3L);
            flow.setOperatorId(2L);
            flow.setAction("audit");
            flow.setAction("approved");
            flow.setReason("同意");
            flow.setCreateTime(new Date());
            flow.setAuditTime(new Date());
            flow.setOrderNo(1);
            flow.setState("ready");
            flow.setIsLast(1);
            dao.insert(flow);
            return null;
        });
    }

}