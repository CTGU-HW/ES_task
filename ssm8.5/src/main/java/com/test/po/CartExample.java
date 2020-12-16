package com.test.po;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartidIsNull() {
            addCriterion("cartid is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartid is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("cartid =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("cartid <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("cartid >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartid >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("cartid <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("cartid <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("cartid in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("cartid not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("cartid between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartid not between", value1, value2, "cartid");
            return (Criteria) this;
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

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andLimitumIsNull() {
            addCriterion("limitUm is null");
            return (Criteria) this;
        }

        public Criteria andLimitumIsNotNull() {
            addCriterion("limitUm is not null");
            return (Criteria) this;
        }

        public Criteria andLimitumEqualTo(Integer value) {
            addCriterion("limitUm =", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumNotEqualTo(Integer value) {
            addCriterion("limitUm <>", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumGreaterThan(Integer value) {
            addCriterion("limitUm >", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitUm >=", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumLessThan(Integer value) {
            addCriterion("limitUm <", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumLessThanOrEqualTo(Integer value) {
            addCriterion("limitUm <=", value, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumIn(List<Integer> values) {
            addCriterion("limitUm in", values, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumNotIn(List<Integer> values) {
            addCriterion("limitUm not in", values, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumBetween(Integer value1, Integer value2) {
            addCriterion("limitUm between", value1, value2, "limitum");
            return (Criteria) this;
        }

        public Criteria andLimitumNotBetween(Integer value1, Integer value2) {
            addCriterion("limitUm not between", value1, value2, "limitum");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(String value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(String value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(String value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(String value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(String value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLike(String value) {
            addCriterion("checked like", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotLike(String value) {
            addCriterion("checked not like", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<String> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<String> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(String value1, String value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(String value1, String value2) {
            addCriterion("checked not between", value1, value2, "checked");
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