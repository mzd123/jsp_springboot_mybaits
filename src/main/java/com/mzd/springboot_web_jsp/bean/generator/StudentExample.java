package com.mzd.springboot_web_jsp.bean.generator;

import java.util.ArrayList;
import java.util.List;

//通过generator插件自动生成的
public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("STUID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("STUID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("STUID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("STUID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("STUID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("STUID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("STUID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("STUID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("STUID like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("STUID not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("STUID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("STUID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("STUID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("STUID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("STUNAME is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("STUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("STUNAME =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("STUNAME <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("STUNAME >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("STUNAME >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("STUNAME <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("STUNAME <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("STUNAME like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("STUNAME not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("STUNAME in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("STUNAME not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("STUNAME between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("STUNAME not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("STUSEX is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("STUSEX is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(String value) {
            addCriterion("STUSEX =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(String value) {
            addCriterion("STUSEX <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(String value) {
            addCriterion("STUSEX >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(String value) {
            addCriterion("STUSEX >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(String value) {
            addCriterion("STUSEX <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(String value) {
            addCriterion("STUSEX <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLike(String value) {
            addCriterion("STUSEX like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotLike(String value) {
            addCriterion("STUSEX not like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<String> values) {
            addCriterion("STUSEX in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<String> values) {
            addCriterion("STUSEX not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(String value1, String value2) {
            addCriterion("STUSEX between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(String value1, String value2) {
            addCriterion("STUSEX not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStutelIsNull() {
            addCriterion("STUTEL is null");
            return (Criteria) this;
        }

        public Criteria andStutelIsNotNull() {
            addCriterion("STUTEL is not null");
            return (Criteria) this;
        }

        public Criteria andStutelEqualTo(String value) {
            addCriterion("STUTEL =", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotEqualTo(String value) {
            addCriterion("STUTEL <>", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThan(String value) {
            addCriterion("STUTEL >", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThanOrEqualTo(String value) {
            addCriterion("STUTEL >=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThan(String value) {
            addCriterion("STUTEL <", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThanOrEqualTo(String value) {
            addCriterion("STUTEL <=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLike(String value) {
            addCriterion("STUTEL like", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotLike(String value) {
            addCriterion("STUTEL not like", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelIn(List<String> values) {
            addCriterion("STUTEL in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotIn(List<String> values) {
            addCriterion("STUTEL not in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelBetween(String value1, String value2) {
            addCriterion("STUTEL between", value1, value2, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotBetween(String value1, String value2) {
            addCriterion("STUTEL not between", value1, value2, "stutel");
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