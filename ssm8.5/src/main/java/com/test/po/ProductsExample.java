package com.test.po;

import java.util.ArrayList;
import java.util.List;

public class ProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnametitleIsNull() {
            addCriterion("pnameTitle is null");
            return (Criteria) this;
        }

        public Criteria andPnametitleIsNotNull() {
            addCriterion("pnameTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPnametitleEqualTo(String value) {
            addCriterion("pnameTitle =", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleNotEqualTo(String value) {
            addCriterion("pnameTitle <>", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleGreaterThan(String value) {
            addCriterion("pnameTitle >", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleGreaterThanOrEqualTo(String value) {
            addCriterion("pnameTitle >=", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleLessThan(String value) {
            addCriterion("pnameTitle <", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleLessThanOrEqualTo(String value) {
            addCriterion("pnameTitle <=", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleLike(String value) {
            addCriterion("pnameTitle like", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleNotLike(String value) {
            addCriterion("pnameTitle not like", value, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleIn(List<String> values) {
            addCriterion("pnameTitle in", values, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleNotIn(List<String> values) {
            addCriterion("pnameTitle not in", values, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleBetween(String value1, String value2) {
            addCriterion("pnameTitle between", value1, value2, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPnametitleNotBetween(String value1, String value2) {
            addCriterion("pnameTitle not between", value1, value2, "pnametitle");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAliimageIsNull() {
            addCriterion("aliImage is null");
            return (Criteria) this;
        }

        public Criteria andAliimageIsNotNull() {
            addCriterion("aliImage is not null");
            return (Criteria) this;
        }

        public Criteria andAliimageEqualTo(String value) {
            addCriterion("aliImage =", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageNotEqualTo(String value) {
            addCriterion("aliImage <>", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageGreaterThan(String value) {
            addCriterion("aliImage >", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageGreaterThanOrEqualTo(String value) {
            addCriterion("aliImage >=", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageLessThan(String value) {
            addCriterion("aliImage <", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageLessThanOrEqualTo(String value) {
            addCriterion("aliImage <=", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageLike(String value) {
            addCriterion("aliImage like", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageNotLike(String value) {
            addCriterion("aliImage not like", value, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageIn(List<String> values) {
            addCriterion("aliImage in", values, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageNotIn(List<String> values) {
            addCriterion("aliImage not in", values, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageBetween(String value1, String value2) {
            addCriterion("aliImage between", value1, value2, "aliimage");
            return (Criteria) this;
        }

        public Criteria andAliimageNotBetween(String value1, String value2) {
            addCriterion("aliImage not between", value1, value2, "aliimage");
            return (Criteria) this;
        }

        public Criteria andLimitnumIsNull() {
            addCriterion("limitNum is null");
            return (Criteria) this;
        }

        public Criteria andLimitnumIsNotNull() {
            addCriterion("limitNum is not null");
            return (Criteria) this;
        }

        public Criteria andLimitnumEqualTo(Integer value) {
            addCriterion("limitNum =", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotEqualTo(Integer value) {
            addCriterion("limitNum <>", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumGreaterThan(Integer value) {
            addCriterion("limitNum >", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitNum >=", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumLessThan(Integer value) {
            addCriterion("limitNum <", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumLessThanOrEqualTo(Integer value) {
            addCriterion("limitNum <=", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumIn(List<Integer> values) {
            addCriterion("limitNum in", values, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotIn(List<Integer> values) {
            addCriterion("limitNum not in", values, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumBetween(Integer value1, Integer value2) {
            addCriterion("limitNum between", value1, value2, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("limitNum not between", value1, value2, "limitnum");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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