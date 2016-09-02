package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGuiderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGuiderExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelIsNull() {
            addCriterion("language_level is null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelIsNotNull() {
            addCriterion("language_level is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelEqualTo(Byte value) {
            addCriterion("language_level =", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelNotEqualTo(Byte value) {
            addCriterion("language_level <>", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelGreaterThan(Byte value) {
            addCriterion("language_level >", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("language_level >=", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelLessThan(Byte value) {
            addCriterion("language_level <", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelLessThanOrEqualTo(Byte value) {
            addCriterion("language_level <=", value, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelIn(List<Byte> values) {
            addCriterion("language_level in", values, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelNotIn(List<Byte> values) {
            addCriterion("language_level not in", values, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelBetween(Byte value1, Byte value2) {
            addCriterion("language_level between", value1, value2, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("language_level not between", value1, value2, "languageLevel");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIsNull() {
            addCriterion("audit_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIsNotNull() {
            addCriterion("audit_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdEqualTo(Integer value) {
            addCriterion("audit_manager_id =", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotEqualTo(Integer value) {
            addCriterion("audit_manager_id <>", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdGreaterThan(Integer value) {
            addCriterion("audit_manager_id >", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_manager_id >=", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdLessThan(Integer value) {
            addCriterion("audit_manager_id <", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_manager_id <=", value, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdIn(List<Integer> values) {
            addCriterion("audit_manager_id in", values, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotIn(List<Integer> values) {
            addCriterion("audit_manager_id not in", values, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_manager_id between", value1, value2, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_manager_id not between", value1, value2, "auditManagerId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
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

        public Criteria andCreateMangerIdIsNull() {
            addCriterion("create_manger_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdIsNotNull() {
            addCriterion("create_manger_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdEqualTo(Integer value) {
            addCriterion("create_manger_id =", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdNotEqualTo(Integer value) {
            addCriterion("create_manger_id <>", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdGreaterThan(Integer value) {
            addCriterion("create_manger_id >", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_manger_id >=", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdLessThan(Integer value) {
            addCriterion("create_manger_id <", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_manger_id <=", value, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdIn(List<Integer> values) {
            addCriterion("create_manger_id in", values, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdNotIn(List<Integer> values) {
            addCriterion("create_manger_id not in", values, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdBetween(Integer value1, Integer value2) {
            addCriterion("create_manger_id between", value1, value2, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andCreateMangerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_manger_id not between", value1, value2, "createMangerId");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
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