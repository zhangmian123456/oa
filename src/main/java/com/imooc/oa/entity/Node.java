package com.imooc.oa.entity;

public class Node {
    private Long NodeId;
    private Integer nodeType;
    private String nodeName;
    private String url;
    private Integer nodeCode;
    private Long parentId;

    public Long getNodeId() {
        return NodeId;
    }

    public void setNodeId(Long nodeId) {
        NodeId = nodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(Integer nodeCode) {
        this.nodeCode = nodeCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "NodeId=" + NodeId +
                ", nodeType=" + nodeType +
                ", nodeName='" + nodeName + '\'' +
                ", url='" + url + '\'' +
                ", nodeCode=" + nodeCode +
                ", parentId=" + parentId +
                '}';
    }
}
