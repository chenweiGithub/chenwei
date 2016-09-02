package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TServiceItemsHasTGuiderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServiceItemsHasTGuiderExample() {
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

        public Criteria andServiceItemsIdIsNull() {
            addCriterion("service_items_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdIsNotNull() {
            addCriterion("service_items_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdEqualTo(Integer value) {
            addCriterion("service_items_id =", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdNotEqualTo(Integer value) {
            addCriterion("service_items_id <>", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdGreaterThan(Integer value) {
            addCriterion("service_items_id >", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_items_id >=", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdLessThan(Integer value) {
            addCriterion("service_items_id <", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_items_id <=", value, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdIn(List<Integer> values) {
            addCriterion("service_items_id in", values, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdNotIn(List<Integer> values) {
            addCriterion("service_items_id not in", values, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("service_items_id between", value1, value2, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andServiceItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_items_id not between", value1, value2, "serviceItemsId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdIsNull() {
            addCriterion("guider_id is null");
            return (Criteria) this;
        }

        public Criteria andGuiderIdIsNotNull() {
            addCriterion("guider_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuiderIdEqualTo(Integer value) {
            addCriterion("guider_id =", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdNotEqualTo(Integer value) {
            addCriterion("guider_id <>", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdGreaterThan(Integer value) {
            addCriterion("guider_id >", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guider_id >=", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdLessThan(Integer value) {
            addCriterion("guider_id <", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdLessThanOrEqualTo(Integer value) {
            addCriterion("guider_id <=", value, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdIn(List<Integer> values) {
            addCriterion("guider_id in", values, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdNotIn(List<Integer> values) {
            addCriterion("guider_id not in", values, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdBetween(Integer value1, Integer value2) {
            addCriterion("guider_id between", value1, value2, "guiderId");
            return (Criteria) this;
        }

        public Criteria andGuiderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guider_id not between", value1, value2, "guiderId");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIsNull() {
            addCriterion("update_tiem is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIsNotNull() {
            addCriterion("update_tiem is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemEqualTo(Date value) {
            addCriterion("update_tiem =", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotEqualTo(Date value) {
            addCriterion("update_tiem <>", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemGreaterThan(Date value) {
            addCriterion("update_tiem >", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemGreaterThanOrEqualTo(Date value) {
            addCriterion("update_tiem >=", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemLessThan(Date value) {
            addCriterion("update_tiem <", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemLessThanOrEqualTo(Date value) {
            addCriterion("update_tiem <=", value, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemIn(List<Date> values) {
            addCriterion("update_tiem in", values, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotIn(List<Date> values) {
            addCriterion("update_tiem not in", values, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemBetween(Date value1, Date value2) {
            addCriterion("update_tiem between", value1, value2, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andUpdateTiemNotBetween(Date value1, Date value2) {
            addCriterion("update_tiem not between", value1, value2, "updateTiem");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
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