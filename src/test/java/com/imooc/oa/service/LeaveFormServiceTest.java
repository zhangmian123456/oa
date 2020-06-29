package com.imooc.oa.service;

import com.imooc.oa.entity.LeaveForm;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class LeaveFormServiceTest {
    LeaveFormService leaveFormService = new LeaveFormService();

    @Test
    public void createLeaveForm() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        LeaveForm form = new LeaveForm();
        form.setEmployeeId(8L);
        form.setStartTime(sdf.parse("2020032608"));
        form.setEndTime(sdf.parse("2020040118"));
        form.setFormType(1);
        form.setReason("市场部员工请假单(72小时以上)");
        form.setCreateTime(new Date());
        LeaveForm savedForm = leaveFormService.createLeaveForm(form);
        System.out.println(savedForm.getFormId());
    }

    @Test
    public void audit1(){
        leaveFormService.audit(31L, 2L, "approved", "祝早日康复");
    }

    @Test
    public void audit2(){
        leaveFormService.audit(32L, 2L, "refused", "请勿拖延");
    }

    @Test
    public void audit3(){
        leaveFormService.audit(33L, 1L, "approved", "同意");
    }
}