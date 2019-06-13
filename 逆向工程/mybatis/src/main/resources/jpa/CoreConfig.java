package com.chinajey.admin.jpa;

import java.util.LinkedList;
import java.util.List;

/**
 * 核心数据结构
 */
public class CoreConfig {
    //父路径
    private String parentPacke;
    //service接口包路径
    private String servicePage;
    //dao接口包路径
    private String daoPage;
    //controller接口包路径
    private String controllerPage;
    //实体类包路径
    private String domainPage;
    //核心工具类路径
    private String corePage;

    //存放类名称的数据
    private List<String> classNames= new LinkedList<>();

    private String javaShortPath;

    private boolean openController =false;
    private boolean openService = true;
    private boolean openDao = true;

    public void addClassName(String className){
        classNames.add(className);
    }

    public List<String> lisAllClassName(){
        return classNames;
    }

    public String getParentPacke() {
        return parentPacke;
    }

    public String getJavaShortPath() {
        return javaShortPath;
    }

    public void setJavaShortPath(String javaShortPath) {
        this.javaShortPath = javaShortPath;
    }

    public void setParentPacke(String parentPacke) {
        this.parentPacke = parentPacke;
    }

    public String getServicePage() {
        return servicePage;
    }

    public void setServicePage(String servicePage) {
        this.servicePage = servicePage;
    }

    public String getDaoPage() {
        return daoPage;
    }

    public void setDaoPage(String daoPage) {
        this.daoPage = daoPage;
    }

    public String getControllerPage() {
        return controllerPage;
    }

    public void setControllerPage(String controllerPage) {
        this.controllerPage = controllerPage;
    }

    public String getDomainPage() {
        return domainPage;
    }

    public void setDomainPage(String domainPage) {
        this.domainPage = domainPage;
    }

    public String getCorePage() {
        return corePage;
    }

    public void setCorePage(String corePage) {
        this.corePage = corePage;
    }

    public boolean isOpenController() {
        return openController;
    }

    public void setOpenController(boolean openController) {
        this.openController = openController;
    }

    public boolean isOpenService() {
        return openService;
    }

    public void setOpenService(boolean openService) {
        this.openService = openService;
    }

    public boolean isOpenDao() {
        return openDao;
    }

    public void setOpenDao(boolean openDao) {
        this.openDao = openDao;
    }

    public String getDomainRealPath(){
        String path = PathConfig.getProjectPath()+"//"+javaShortPath;
        String domainPath = domainPage.replace(".","//");
        return path+"//"+domainPath;
    }

    public String getServiceRealPath(){
        String path = PathConfig.getProjectPath()+"//"+javaShortPath;
        String servicePath = "";
        if(servicePage!=null) {
            servicePath = servicePage.replace(".", "//");
        }else{
            servicePath = parentPacke.replace(".","//")+"//service";
        }
        return path+"//"+servicePath;
    }

    public String getDaoRealPath(){
        String path = PathConfig.getProjectPath()+"//"+javaShortPath;
        String daoPath = "";
        if(daoPage!=null) {
            daoPath = daoPage.replace(".", "//");
        }else{
            daoPath = parentPacke.replace(".","//")+"//dao";
        }
        return path+"//"+daoPath;
    }

    public String getControllerRealPath(){
        String path = PathConfig.getProjectPath()+"//"+javaShortPath;
        String controllerPath = "";
        if(controllerPage!=null) {
            controllerPath = controllerPage.replace(".", "//");
        }else{
            controllerPath = parentPacke.replace(".","//")+"//web";
        }
        return path+"//"+controllerPath;
    }
}
