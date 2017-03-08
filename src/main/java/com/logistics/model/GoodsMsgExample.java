package com.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsMsgExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleIsNull() {
            addCriterion("GoodsStyle is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleIsNotNull() {
            addCriterion("GoodsStyle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleEqualTo(String value) {
            addCriterion("GoodsStyle =", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleNotEqualTo(String value) {
            addCriterion("GoodsStyle <>", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleGreaterThan(String value) {
            addCriterion("GoodsStyle >", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsStyle >=", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleLessThan(String value) {
            addCriterion("GoodsStyle <", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleLessThanOrEqualTo(String value) {
            addCriterion("GoodsStyle <=", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleLike(String value) {
            addCriterion("GoodsStyle like", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleNotLike(String value) {
            addCriterion("GoodsStyle not like", value, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleIn(List<String> values) {
            addCriterion("GoodsStyle in", values, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleNotIn(List<String> values) {
            addCriterion("GoodsStyle not in", values, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleBetween(String value1, String value2) {
            addCriterion("GoodsStyle between", value1, value2, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsstyleNotBetween(String value1, String value2) {
            addCriterion("GoodsStyle not between", value1, value2, "goodsstyle");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("GoodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("GoodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(String value) {
            addCriterion("GoodsNumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(String value) {
            addCriterion("GoodsNumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(String value) {
            addCriterion("GoodsNumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsNumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(String value) {
            addCriterion("GoodsNumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(String value) {
            addCriterion("GoodsNumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLike(String value) {
            addCriterion("GoodsNumber like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotLike(String value) {
            addCriterion("GoodsNumber not like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<String> values) {
            addCriterion("GoodsNumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<String> values) {
            addCriterion("GoodsNumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(String value1, String value2) {
            addCriterion("GoodsNumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(String value1, String value2) {
            addCriterion("GoodsNumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNull() {
            addCriterion("GoodsUnit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNotNull() {
            addCriterion("GoodsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitEqualTo(String value) {
            addCriterion("GoodsUnit =", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotEqualTo(String value) {
            addCriterion("GoodsUnit <>", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThan(String value) {
            addCriterion("GoodsUnit >", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsUnit >=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThan(String value) {
            addCriterion("GoodsUnit <", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThanOrEqualTo(String value) {
            addCriterion("GoodsUnit <=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLike(String value) {
            addCriterion("GoodsUnit like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotLike(String value) {
            addCriterion("GoodsUnit not like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIn(List<String> values) {
            addCriterion("GoodsUnit in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotIn(List<String> values) {
            addCriterion("GoodsUnit not in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitBetween(String value1, String value2) {
            addCriterion("GoodsUnit between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotBetween(String value1, String value2) {
            addCriterion("GoodsUnit not between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIsNull() {
            addCriterion("StartProvince is null");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIsNotNull() {
            addCriterion("StartProvince is not null");
            return (Criteria) this;
        }

        public Criteria andStartprovinceEqualTo(String value) {
            addCriterion("StartProvince =", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotEqualTo(String value) {
            addCriterion("StartProvince <>", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceGreaterThan(String value) {
            addCriterion("StartProvince >", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("StartProvince >=", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLessThan(String value) {
            addCriterion("StartProvince <", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLessThanOrEqualTo(String value) {
            addCriterion("StartProvince <=", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLike(String value) {
            addCriterion("StartProvince like", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotLike(String value) {
            addCriterion("StartProvince not like", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIn(List<String> values) {
            addCriterion("StartProvince in", values, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotIn(List<String> values) {
            addCriterion("StartProvince not in", values, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceBetween(String value1, String value2) {
            addCriterion("StartProvince between", value1, value2, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotBetween(String value1, String value2) {
            addCriterion("StartProvince not between", value1, value2, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartcityIsNull() {
            addCriterion("StartCity is null");
            return (Criteria) this;
        }

        public Criteria andStartcityIsNotNull() {
            addCriterion("StartCity is not null");
            return (Criteria) this;
        }

        public Criteria andStartcityEqualTo(String value) {
            addCriterion("StartCity =", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotEqualTo(String value) {
            addCriterion("StartCity <>", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThan(String value) {
            addCriterion("StartCity >", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThanOrEqualTo(String value) {
            addCriterion("StartCity >=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThan(String value) {
            addCriterion("StartCity <", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThanOrEqualTo(String value) {
            addCriterion("StartCity <=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLike(String value) {
            addCriterion("StartCity like", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotLike(String value) {
            addCriterion("StartCity not like", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityIn(List<String> values) {
            addCriterion("StartCity in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotIn(List<String> values) {
            addCriterion("StartCity not in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityBetween(String value1, String value2) {
            addCriterion("StartCity between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotBetween(String value1, String value2) {
            addCriterion("StartCity not between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIsNull() {
            addCriterion("EndProvince is null");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIsNotNull() {
            addCriterion("EndProvince is not null");
            return (Criteria) this;
        }

        public Criteria andEndprovinceEqualTo(String value) {
            addCriterion("EndProvince =", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotEqualTo(String value) {
            addCriterion("EndProvince <>", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceGreaterThan(String value) {
            addCriterion("EndProvince >", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("EndProvince >=", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLessThan(String value) {
            addCriterion("EndProvince <", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLessThanOrEqualTo(String value) {
            addCriterion("EndProvince <=", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLike(String value) {
            addCriterion("EndProvince like", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotLike(String value) {
            addCriterion("EndProvince not like", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIn(List<String> values) {
            addCriterion("EndProvince in", values, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotIn(List<String> values) {
            addCriterion("EndProvince not in", values, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceBetween(String value1, String value2) {
            addCriterion("EndProvince between", value1, value2, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotBetween(String value1, String value2) {
            addCriterion("EndProvince not between", value1, value2, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNull() {
            addCriterion("EndCity is null");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNotNull() {
            addCriterion("EndCity is not null");
            return (Criteria) this;
        }

        public Criteria andEndcityEqualTo(String value) {
            addCriterion("EndCity =", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotEqualTo(String value) {
            addCriterion("EndCity <>", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThan(String value) {
            addCriterion("EndCity >", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThanOrEqualTo(String value) {
            addCriterion("EndCity >=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThan(String value) {
            addCriterion("EndCity <", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThanOrEqualTo(String value) {
            addCriterion("EndCity <=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLike(String value) {
            addCriterion("EndCity like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotLike(String value) {
            addCriterion("EndCity not like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityIn(List<String> values) {
            addCriterion("EndCity in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotIn(List<String> values) {
            addCriterion("EndCity not in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityBetween(String value1, String value2) {
            addCriterion("EndCity between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotBetween(String value1, String value2) {
            addCriterion("EndCity not between", value1, value2, "endcity");
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

        public Criteria andTransporttimeIsNull() {
            addCriterion("TransportTime is null");
            return (Criteria) this;
        }

        public Criteria andTransporttimeIsNotNull() {
            addCriterion("TransportTime is not null");
            return (Criteria) this;
        }

        public Criteria andTransporttimeEqualTo(String value) {
            addCriterion("TransportTime =", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeNotEqualTo(String value) {
            addCriterion("TransportTime <>", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeGreaterThan(String value) {
            addCriterion("TransportTime >", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeGreaterThanOrEqualTo(String value) {
            addCriterion("TransportTime >=", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeLessThan(String value) {
            addCriterion("TransportTime <", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeLessThanOrEqualTo(String value) {
            addCriterion("TransportTime <=", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeLike(String value) {
            addCriterion("TransportTime like", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeNotLike(String value) {
            addCriterion("TransportTime not like", value, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeIn(List<String> values) {
            addCriterion("TransportTime in", values, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeNotIn(List<String> values) {
            addCriterion("TransportTime not in", values, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeBetween(String value1, String value2) {
            addCriterion("TransportTime between", value1, value2, "transporttime");
            return (Criteria) this;
        }

        public Criteria andTransporttimeNotBetween(String value1, String value2) {
            addCriterion("TransportTime not between", value1, value2, "transporttime");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("Link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("Link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("Link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("Link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("Link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("Link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("Link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("Link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("Link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("Link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("Link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("Link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("Link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("Link not between", value1, value2, "link");
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

        public Criteria andRequestIsNull() {
            addCriterion("Request is null");
            return (Criteria) this;
        }

        public Criteria andRequestIsNotNull() {
            addCriterion("Request is not null");
            return (Criteria) this;
        }

        public Criteria andRequestEqualTo(String value) {
            addCriterion("Request =", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotEqualTo(String value) {
            addCriterion("Request <>", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThan(String value) {
            addCriterion("Request >", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThanOrEqualTo(String value) {
            addCriterion("Request >=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThan(String value) {
            addCriterion("Request <", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThanOrEqualTo(String value) {
            addCriterion("Request <=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLike(String value) {
            addCriterion("Request like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotLike(String value) {
            addCriterion("Request not like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestIn(List<String> values) {
            addCriterion("Request in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotIn(List<String> values) {
            addCriterion("Request not in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestBetween(String value1, String value2) {
            addCriterion("Request between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotBetween(String value1, String value2) {
            addCriterion("Request not between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
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