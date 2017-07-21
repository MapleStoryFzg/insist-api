package com.bozhong.insistapi.entity;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by xiezg@317hu.com on 2017/7/11 0011.
 */
public class InterfaceHttpEntity extends BaseEntity {
    public InterfaceHttpEntity() {
    }

    public InterfaceHttpEntity(String id, String appId, String protocol, String method, String transformat,
                               String address, String name, String description) {
        this.id = id;
        this.appId = appId;
        this.protocol = protocol;
        this.method = method;
        this.transformat = transformat;
        this.address = address;
        this.name = name;
        this.description = description;
    }

    /**
     * 接口ID主键
     */
    private String id;

    /**
     * 项目ID/应用ID
     */
    private String appId;

    /**
     * 请求协议
     */
    private String protocol;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 传输格式
     */
    private String transformat;

    /**
     * 接口地址
     */
    private String address;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     *
     */
    private List<InterfaceParamEntity> interfaceParamEntities;

    /**
     *
     */
    private List<InterfaceResultEntity> interfaceResultEntities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTransformat() {
        return transformat;
    }

    public void setTransformat(String transformat) {
        this.transformat = transformat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<InterfaceParamEntity> getInterfaceParamEntities() {
        return interfaceParamEntities;
    }

    public void setInterfaceParamEntities(List<InterfaceParamEntity> interfaceParamEntities) {
        this.interfaceParamEntities = interfaceParamEntities;
    }

    public List<InterfaceResultEntity> getInterfaceResultEntities() {
        return interfaceResultEntities;
    }

    public void setInterfaceResultEntities(List<InterfaceResultEntity> interfaceResultEntities) {
        this.interfaceResultEntities = interfaceResultEntities;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
