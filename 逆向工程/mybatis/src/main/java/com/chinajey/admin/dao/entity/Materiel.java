package com.chinajey.admin.dao.entity;

import java.math.BigDecimal;

public class Materiel {
    private String itemcode;

    private String itemname;

    private Integer itmsgrpcod;

    private String prchseitem;

    private String sellitem;

    private String invntitem;

    private String dfltwh;

    private String buyunitmsr;

    private String salunitmsr;

    private String vatgrouppu;

    private String vatgroupsa;

    private String validfor;

    private String validcomm;

    private String sww;

    private String glmethod;

    private String bywh;

    private String itemtype;

    private String issuemthd;

    private String mngmethod;

    private String invntryuom;

    private String planingsys;

    private String prcrmntmtd;

    private String uSc001;

    private String uSc002;

    private String uSc005;

    private String uZ20Drno;

    private String uSc014;

    private String uZ12Iqc;

    private BigDecimal uZ98Perq;

    private String uZ09Wl014;

    private String uSc012;

    private BigDecimal uZ16Ctn;

    private String uZ16Hscd;

    private String uZ16Hscm;

    private String uZ16Hsem;

    private String cProCode;

    private String proCode;

    private String uEmpid;

    public Materiel(String itemcode, String itemname, Integer itmsgrpcod, String prchseitem, String sellitem, String invntitem, String dfltwh, String buyunitmsr, String salunitmsr, String vatgrouppu, String vatgroupsa, String validfor, String validcomm, String sww, String glmethod, String bywh, String itemtype, String issuemthd, String mngmethod, String invntryuom, String planingsys, String prcrmntmtd, String uSc001, String uSc002, String uSc005, String uZ20Drno, String uSc014, String uZ12Iqc, BigDecimal uZ98Perq, String uZ09Wl014, String uSc012, BigDecimal uZ16Ctn, String uZ16Hscd, String uZ16Hscm, String uZ16Hsem, String cProCode, String proCode, String uEmpid) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.itmsgrpcod = itmsgrpcod;
        this.prchseitem = prchseitem;
        this.sellitem = sellitem;
        this.invntitem = invntitem;
        this.dfltwh = dfltwh;
        this.buyunitmsr = buyunitmsr;
        this.salunitmsr = salunitmsr;
        this.vatgrouppu = vatgrouppu;
        this.vatgroupsa = vatgroupsa;
        this.validfor = validfor;
        this.validcomm = validcomm;
        this.sww = sww;
        this.glmethod = glmethod;
        this.bywh = bywh;
        this.itemtype = itemtype;
        this.issuemthd = issuemthd;
        this.mngmethod = mngmethod;
        this.invntryuom = invntryuom;
        this.planingsys = planingsys;
        this.prcrmntmtd = prcrmntmtd;
        this.uSc001 = uSc001;
        this.uSc002 = uSc002;
        this.uSc005 = uSc005;
        this.uZ20Drno = uZ20Drno;
        this.uSc014 = uSc014;
        this.uZ12Iqc = uZ12Iqc;
        this.uZ98Perq = uZ98Perq;
        this.uZ09Wl014 = uZ09Wl014;
        this.uSc012 = uSc012;
        this.uZ16Ctn = uZ16Ctn;
        this.uZ16Hscd = uZ16Hscd;
        this.uZ16Hscm = uZ16Hscm;
        this.uZ16Hsem = uZ16Hsem;
        this.cProCode = cProCode;
        this.proCode = proCode;
        this.uEmpid = uEmpid;
    }

    public Materiel() {
        super();
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getItmsgrpcod() {
        return itmsgrpcod;
    }

    public void setItmsgrpcod(Integer itmsgrpcod) {
        this.itmsgrpcod = itmsgrpcod;
    }

    public String getPrchseitem() {
        return prchseitem;
    }

    public void setPrchseitem(String prchseitem) {
        this.prchseitem = prchseitem == null ? null : prchseitem.trim();
    }

    public String getSellitem() {
        return sellitem;
    }

    public void setSellitem(String sellitem) {
        this.sellitem = sellitem == null ? null : sellitem.trim();
    }

    public String getInvntitem() {
        return invntitem;
    }

    public void setInvntitem(String invntitem) {
        this.invntitem = invntitem == null ? null : invntitem.trim();
    }

    public String getDfltwh() {
        return dfltwh;
    }

    public void setDfltwh(String dfltwh) {
        this.dfltwh = dfltwh == null ? null : dfltwh.trim();
    }

    public String getBuyunitmsr() {
        return buyunitmsr;
    }

    public void setBuyunitmsr(String buyunitmsr) {
        this.buyunitmsr = buyunitmsr == null ? null : buyunitmsr.trim();
    }

    public String getSalunitmsr() {
        return salunitmsr;
    }

    public void setSalunitmsr(String salunitmsr) {
        this.salunitmsr = salunitmsr == null ? null : salunitmsr.trim();
    }

    public String getVatgrouppu() {
        return vatgrouppu;
    }

    public void setVatgrouppu(String vatgrouppu) {
        this.vatgrouppu = vatgrouppu == null ? null : vatgrouppu.trim();
    }

    public String getVatgroupsa() {
        return vatgroupsa;
    }

    public void setVatgroupsa(String vatgroupsa) {
        this.vatgroupsa = vatgroupsa == null ? null : vatgroupsa.trim();
    }

    public String getValidfor() {
        return validfor;
    }

    public void setValidfor(String validfor) {
        this.validfor = validfor == null ? null : validfor.trim();
    }

    public String getValidcomm() {
        return validcomm;
    }

    public void setValidcomm(String validcomm) {
        this.validcomm = validcomm == null ? null : validcomm.trim();
    }

    public String getSww() {
        return sww;
    }

    public void setSww(String sww) {
        this.sww = sww == null ? null : sww.trim();
    }

    public String getGlmethod() {
        return glmethod;
    }

    public void setGlmethod(String glmethod) {
        this.glmethod = glmethod == null ? null : glmethod.trim();
    }

    public String getBywh() {
        return bywh;
    }

    public void setBywh(String bywh) {
        this.bywh = bywh == null ? null : bywh.trim();
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype == null ? null : itemtype.trim();
    }

    public String getIssuemthd() {
        return issuemthd;
    }

    public void setIssuemthd(String issuemthd) {
        this.issuemthd = issuemthd == null ? null : issuemthd.trim();
    }

    public String getMngmethod() {
        return mngmethod;
    }

    public void setMngmethod(String mngmethod) {
        this.mngmethod = mngmethod == null ? null : mngmethod.trim();
    }

    public String getInvntryuom() {
        return invntryuom;
    }

    public void setInvntryuom(String invntryuom) {
        this.invntryuom = invntryuom == null ? null : invntryuom.trim();
    }

    public String getPlaningsys() {
        return planingsys;
    }

    public void setPlaningsys(String planingsys) {
        this.planingsys = planingsys == null ? null : planingsys.trim();
    }

    public String getPrcrmntmtd() {
        return prcrmntmtd;
    }

    public void setPrcrmntmtd(String prcrmntmtd) {
        this.prcrmntmtd = prcrmntmtd == null ? null : prcrmntmtd.trim();
    }

    public String getuSc001() {
        return uSc001;
    }

    public void setuSc001(String uSc001) {
        this.uSc001 = uSc001 == null ? null : uSc001.trim();
    }

    public String getuSc002() {
        return uSc002;
    }

    public void setuSc002(String uSc002) {
        this.uSc002 = uSc002 == null ? null : uSc002.trim();
    }

    public String getuSc005() {
        return uSc005;
    }

    public void setuSc005(String uSc005) {
        this.uSc005 = uSc005 == null ? null : uSc005.trim();
    }

    public String getuZ20Drno() {
        return uZ20Drno;
    }

    public void setuZ20Drno(String uZ20Drno) {
        this.uZ20Drno = uZ20Drno == null ? null : uZ20Drno.trim();
    }

    public String getuSc014() {
        return uSc014;
    }

    public void setuSc014(String uSc014) {
        this.uSc014 = uSc014 == null ? null : uSc014.trim();
    }

    public String getuZ12Iqc() {
        return uZ12Iqc;
    }

    public void setuZ12Iqc(String uZ12Iqc) {
        this.uZ12Iqc = uZ12Iqc == null ? null : uZ12Iqc.trim();
    }

    public BigDecimal getuZ98Perq() {
        return uZ98Perq;
    }

    public void setuZ98Perq(BigDecimal uZ98Perq) {
        this.uZ98Perq = uZ98Perq;
    }

    public String getuZ09Wl014() {
        return uZ09Wl014;
    }

    public void setuZ09Wl014(String uZ09Wl014) {
        this.uZ09Wl014 = uZ09Wl014 == null ? null : uZ09Wl014.trim();
    }

    public String getuSc012() {
        return uSc012;
    }

    public void setuSc012(String uSc012) {
        this.uSc012 = uSc012 == null ? null : uSc012.trim();
    }

    public BigDecimal getuZ16Ctn() {
        return uZ16Ctn;
    }

    public void setuZ16Ctn(BigDecimal uZ16Ctn) {
        this.uZ16Ctn = uZ16Ctn;
    }

    public String getuZ16Hscd() {
        return uZ16Hscd;
    }

    public void setuZ16Hscd(String uZ16Hscd) {
        this.uZ16Hscd = uZ16Hscd == null ? null : uZ16Hscd.trim();
    }

    public String getuZ16Hscm() {
        return uZ16Hscm;
    }

    public void setuZ16Hscm(String uZ16Hscm) {
        this.uZ16Hscm = uZ16Hscm == null ? null : uZ16Hscm.trim();
    }

    public String getuZ16Hsem() {
        return uZ16Hsem;
    }

    public void setuZ16Hsem(String uZ16Hsem) {
        this.uZ16Hsem = uZ16Hsem == null ? null : uZ16Hsem.trim();
    }

    public String getcProCode() {
        return cProCode;
    }

    public void setcProCode(String cProCode) {
        this.cProCode = cProCode == null ? null : cProCode.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getuEmpid() {
        return uEmpid;
    }

    public void setuEmpid(String uEmpid) {
        this.uEmpid = uEmpid == null ? null : uEmpid.trim();
    }
}