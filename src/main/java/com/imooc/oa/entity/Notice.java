package com.imooc.oa.entity;

import java.util.Date;

public class Notice {
    private Long NoticeId;
    private Long receiverId;
    private String content;
    private Date createTime;

    public Long getNoticeId() {
        return NoticeId;
    }

    public void setNoticeId(Long noticeId) {
        NoticeId = noticeId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}