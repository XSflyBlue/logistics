package com.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNull() {
            addCriterion("TradeMark is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNotNull() {
            addCriterion("TradeMark is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkEqualTo(String value) {
            addCriterion("TradeMark =", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotEqualTo(String value) {
            addCriterion("TradeMark <>", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThan(String value) {
            addCriterion("TradeMark >", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("TradeMark >=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThan(String value) {
            addCriterion("TradeMark <", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThanOrEqualTo(String value) {
            addCriterion("TradeMark <=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLike(String value) {
            addCriterion("TradeMark like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotLike(String value) {
            addCriterion("TradeMark not like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkIn(List<String> values) {
            addCriterion("TradeMark in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotIn(List<String> values) {
            addCriterion("TradeMark not in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkBetween(String value1, String value2) {
            addCriterion("TradeMark between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotBetween(String value1, String value2) {
            addCriterion("TradeMark not between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("Brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("Brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("Brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("Brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("Brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("Brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("Brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("Brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("Brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("Brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("Brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("Brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("Brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("Brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("Style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("Style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("Style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("Style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("Style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("Style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("Style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("Style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("Style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("Style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("Style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("Style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("Style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("Style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andCarloadIsNull() {
            addCriterion("CarLoad is null");
            return (Criteria) this;
        }

        public Criteria andCarloadIsNotNull() {
            addCriterion("CarLoad is not null");
            return (Criteria) this;
        }

        public Criteria andCarloadEqualTo(String value) {
            addCriterion("CarLoad =", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadNotEqualTo(String value) {
            addCriterion("CarLoad <>", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadGreaterThan(String value) {
            addCriterion("CarLoad >", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadGreaterThanOrEqualTo(String value) {
            addCriterion("CarLoad >=", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadLessThan(String value) {
            addCriterion("CarLoad <", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadLessThanOrEqualTo(String value) {
            addCriterion("CarLoad <=", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadLike(String value) {
            addCriterion("CarLoad like", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadNotLike(String value) {
            addCriterion("CarLoad not like", value, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadIn(List<String> values) {
            addCriterion("CarLoad in", values, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadNotIn(List<String> values) {
            addCriterion("CarLoad not in", values, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadBetween(String value1, String value2) {
            addCriterion("CarLoad between", value1, value2, "carload");
            return (Criteria) this;
        }

        public Criteria andCarloadNotBetween(String value1, String value2) {
            addCriterion("CarLoad not between", value1, value2, "carload");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNull() {
            addCriterion("UsedTime is null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNotNull() {
            addCriterion("UsedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeEqualTo(String value) {
            addCriterion("UsedTime =", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotEqualTo(String value) {
            addCriterion("UsedTime <>", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThan(String value) {
            addCriterion("UsedTime >", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("UsedTime >=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThan(String value) {
            addCriterion("UsedTime <", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThanOrEqualTo(String value) {
            addCriterion("UsedTime <=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLike(String value) {
            addCriterion("UsedTime like", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotLike(String value) {
            addCriterion("UsedTime not like", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIn(List<String> values) {
            addCriterion("UsedTime in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotIn(List<String> values) {
            addCriterion("UsedTime not in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeBetween(String value1, String value2) {
            addCriterion("UsedTime between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotBetween(String value1, String value2) {
            addCriterion("UsedTime not between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("DriverName is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("DriverName is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("DriverName =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("DriverName <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("DriverName >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("DriverName >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("DriverName <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("DriverName <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("DriverName like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("DriverName not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("DriverName in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("DriverName not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("DriverName between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("DriverName not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivertimeIsNull() {
            addCriterion("DriverTime is null");
            return (Criteria) this;
        }

        public Criteria andDrivertimeIsNotNull() {
            addCriterion("DriverTime is not null");
            return (Criteria) this;
        }

        public Criteria andDrivertimeEqualTo(String value) {
            addCriterion("DriverTime =", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeNotEqualTo(String value) {
            addCriterion("DriverTime <>", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeGreaterThan(String value) {
            addCriterion("DriverTime >", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeGreaterThanOrEqualTo(String value) {
            addCriterion("DriverTime >=", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeLessThan(String value) {
            addCriterion("DriverTime <", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeLessThanOrEqualTo(String value) {
            addCriterion("DriverTime <=", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeLike(String value) {
            addCriterion("DriverTime like", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeNotLike(String value) {
            addCriterion("DriverTime not like", value, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeIn(List<String> values) {
            addCriterion("DriverTime in", values, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeNotIn(List<String> values) {
            addCriterion("DriverTime not in", values, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeBetween(String value1, String value2) {
            addCriterion("DriverTime between", value1, value2, "drivertime");
            return (Criteria) this;
        }

        public Criteria andDrivertimeNotBetween(String value1, String value2) {
            addCriterion("DriverTime not between", value1, value2, "drivertime");
            return (Criteria) this;
        }

        public Criteria andLicencenumberIsNull() {
            addCriterion("LicenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andLicencenumberIsNotNull() {
            addCriterion("LicenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLicencenumberEqualTo(String value) {
            addCriterion("LicenceNumber =", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberNotEqualTo(String value) {
            addCriterion("LicenceNumber <>", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberGreaterThan(String value) {
            addCriterion("LicenceNumber >", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberGreaterThanOrEqualTo(String value) {
            addCriterion("LicenceNumber >=", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberLessThan(String value) {
            addCriterion("LicenceNumber <", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberLessThanOrEqualTo(String value) {
            addCriterion("LicenceNumber <=", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberLike(String value) {
            addCriterion("LicenceNumber like", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberNotLike(String value) {
            addCriterion("LicenceNumber not like", value, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberIn(List<String> values) {
            addCriterion("LicenceNumber in", values, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberNotIn(List<String> values) {
            addCriterion("LicenceNumber not in", values, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberBetween(String value1, String value2) {
            addCriterion("LicenceNumber between", value1, value2, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencenumberNotBetween(String value1, String value2) {
            addCriterion("LicenceNumber not between", value1, value2, "licencenumber");
            return (Criteria) this;
        }

        public Criteria andLicencestyleIsNull() {
            addCriterion("LicenceStyle is null");
            return (Criteria) this;
        }

        public Criteria andLicencestyleIsNotNull() {
            addCriterion("LicenceStyle is not null");
            return (Criteria) this;
        }

        public Criteria andLicencestyleEqualTo(String value) {
            addCriterion("LicenceStyle =", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleNotEqualTo(String value) {
            addCriterion("LicenceStyle <>", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleGreaterThan(String value) {
            addCriterion("LicenceStyle >", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleGreaterThanOrEqualTo(String value) {
            addCriterion("LicenceStyle >=", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleLessThan(String value) {
            addCriterion("LicenceStyle <", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleLessThanOrEqualTo(String value) {
            addCriterion("LicenceStyle <=", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleLike(String value) {
            addCriterion("LicenceStyle like", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleNotLike(String value) {
            addCriterion("LicenceStyle not like", value, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleIn(List<String> values) {
            addCriterion("LicenceStyle in", values, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleNotIn(List<String> values) {
            addCriterion("LicenceStyle not in", values, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleBetween(String value1, String value2) {
            addCriterion("LicenceStyle between", value1, value2, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andLicencestyleNotBetween(String value1, String value2) {
            addCriterion("LicenceStyle not between", value1, value2, "licencestyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleIsNull() {
            addCriterion("TransportStyle is null");
            return (Criteria) this;
        }

        public Criteria andTransportstyleIsNotNull() {
            addCriterion("TransportStyle is not null");
            return (Criteria) this;
        }

        public Criteria andTransportstyleEqualTo(String value) {
            addCriterion("TransportStyle =", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleNotEqualTo(String value) {
            addCriterion("TransportStyle <>", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleGreaterThan(String value) {
            addCriterion("TransportStyle >", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleGreaterThanOrEqualTo(String value) {
            addCriterion("TransportStyle >=", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleLessThan(String value) {
            addCriterion("TransportStyle <", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleLessThanOrEqualTo(String value) {
            addCriterion("TransportStyle <=", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleLike(String value) {
            addCriterion("TransportStyle like", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleNotLike(String value) {
            addCriterion("TransportStyle not like", value, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleIn(List<String> values) {
            addCriterion("TransportStyle in", values, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleNotIn(List<String> values) {
            addCriterion("TransportStyle not in", values, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleBetween(String value1, String value2) {
            addCriterion("TransportStyle between", value1, value2, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andTransportstyleNotBetween(String value1, String value2) {
            addCriterion("TransportStyle not between", value1, value2, "transportstyle");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LinkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LinkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LinkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LinkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LinkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LinkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LinkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LinkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LinkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LinkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LinkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LinkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNull() {
            addCriterion("LinkPhone is null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNotNull() {
            addCriterion("LinkPhone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneEqualTo(String value) {
            addCriterion("LinkPhone =", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotEqualTo(String value) {
            addCriterion("LinkPhone <>", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThan(String value) {
            addCriterion("LinkPhone >", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LinkPhone >=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThan(String value) {
            addCriterion("LinkPhone <", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("LinkPhone <=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLike(String value) {
            addCriterion("LinkPhone like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotLike(String value) {
            addCriterion("LinkPhone not like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIn(List<String> values) {
            addCriterion("LinkPhone in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotIn(List<String> values) {
            addCriterion("LinkPhone not in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneBetween(String value1, String value2) {
            addCriterion("LinkPhone between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotBetween(String value1, String value2) {
            addCriterion("LinkPhone not between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNull() {
            addCriterion("IssueDate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("IssueDate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(Date value) {
            addCriterion("IssueDate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(Date value) {
            addCriterion("IssueDate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(Date value) {
            addCriterion("IssueDate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("IssueDate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(Date value) {
            addCriterion("IssueDate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(Date value) {
            addCriterion("IssueDate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<Date> values) {
            addCriterion("IssueDate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<Date> values) {
            addCriterion("IssueDate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(Date value1, Date value2) {
            addCriterion("IssueDate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(Date value1, Date value2) {
            addCriterion("IssueDate not between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNull() {
            addCriterion("UserDate is null");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNotNull() {
            addCriterion("UserDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserdateEqualTo(String value) {
            addCriterion("UserDate =", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotEqualTo(String value) {
            addCriterion("UserDate <>", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThan(String value) {
            addCriterion("UserDate >", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThanOrEqualTo(String value) {
            addCriterion("UserDate >=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThan(String value) {
            addCriterion("UserDate <", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThanOrEqualTo(String value) {
            addCriterion("UserDate <=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLike(String value) {
            addCriterion("UserDate like", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotLike(String value) {
            addCriterion("UserDate not like", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateIn(List<String> values) {
            addCriterion("UserDate in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotIn(List<String> values) {
            addCriterion("UserDate not in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateBetween(String value1, String value2) {
            addCriterion("UserDate between", value1, value2, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotBetween(String value1, String value2) {
            addCriterion("UserDate not between", value1, value2, "userdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}