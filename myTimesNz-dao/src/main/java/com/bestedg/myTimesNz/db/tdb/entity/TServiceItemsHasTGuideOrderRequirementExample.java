package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TServiceItemsHasTGuideOrderRequirementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServiceItemsHasTGuideOrderRequirementExample() {
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

        public Criteria andGuideOrderRequirementIdIsNull() {
            addCriterion("guide_order_requirement_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdIsNotNull() {
            addCriterion("guide_order_requirement_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdEqualTo(Integer value) {
            addCriterion("guide_order_requirement_id =", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdNotEqualTo(Integer value) {
            addCriterion("guide_order_requirement_id <>", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdGreaterThan(Integer value) {
            addCriterion("guide_order_requirement_id >", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_order_requirement_id >=", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdLessThan(Integer value) {
            addCriterion("guide_order_requirement_id <", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdLessThanOrEqualTo(Integer value) {
            addCriterion("guide_order_requirement_id <=", value, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdIn(List<Integer> values) {
            addCriterion("guide_order_requirement_id in", values, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdNotIn(List<Integer> values) {
            addCriterion("guide_order_requirement_id not in", values, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdBetween(Integer value1, Integer value2) {
            addCriterion("guide_order_requirement_id between", value1, value2, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andGuideOrderRequirementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_order_requirement_id not between", value1, value2, "guideOrderRequirementId");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdIsNull() {
            addCriterion("create_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdIsNotNull() {
            addCriterion("create_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdEqualTo(Integer value) {
            addCriterion("create_manager_id =", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdNotEqualTo(Integer value) {
            addCriterion("create_manager_id <>", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdGreaterThan(Integer value) {
            addCriterion("create_manager_id >", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_manager_id >=", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdLessThan(Integer value) {
            addCriterion("create_manager_id <", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_manager_id <=", value, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdIn(List<Integer> values) {
            addCriterion("create_manager_id in", values, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdNotIn(List<Integer> values) {
            addCriterion("create_manager_id not in", values, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("create_manager_id between", value1, value2, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andCreateManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_manager_id not between", value1, value2, "createManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdIsNull() {
            addCriterion("update_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdIsNotNull() {
            addCriterion("update_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdEqualTo(Integer value) {
            addCriterion("update_manager_id =", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdNotEqualTo(Integer value) {
            addCriterion("update_manager_id <>", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdGreaterThan(Integer value) {
            addCriterion("update_manager_id >", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_manager_id >=", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdLessThan(Integer value) {
            addCriterion("update_manager_id <", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_manager_id <=", value, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdIn(List<Integer> values) {
            addCriterion("update_manager_id in", values, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdNotIn(List<Integer> values) {
            addCriterion("update_manager_id not in", values, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("update_manager_id between", value1, value2, "updateManagerId");
            return (Criteria) this;
        }

        public Criteria andUpdateManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_manager_id not between", value1, value2, "updateManagerId");
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