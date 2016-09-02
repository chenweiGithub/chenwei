package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.ArrayList;
import java.util.List;

public class TServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServerExample() {
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIsNull() {
            addCriterion("age_group is null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIsNotNull() {
            addCriterion("age_group is not null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupEqualTo(Byte value) {
            addCriterion("age_group =", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotEqualTo(Byte value) {
            addCriterion("age_group <>", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupGreaterThan(Byte value) {
            addCriterion("age_group >", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupGreaterThanOrEqualTo(Byte value) {
            addCriterion("age_group >=", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupLessThan(Byte value) {
            addCriterion("age_group <", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupLessThanOrEqualTo(Byte value) {
            addCriterion("age_group <=", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIn(List<Byte> values) {
            addCriterion("age_group in", values, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotIn(List<Byte> values) {
            addCriterion("age_group not in", values, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupBetween(Byte value1, Byte value2) {
            addCriterion("age_group between", value1, value2, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotBetween(Byte value1, Byte value2) {
            addCriterion("age_group not between", value1, value2, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoIsNull() {
            addCriterion("personal_photo is null");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoIsNotNull() {
            addCriterion("personal_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoEqualTo(String value) {
            addCriterion("personal_photo =", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoNotEqualTo(String value) {
            addCriterion("personal_photo <>", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoGreaterThan(String value) {
            addCriterion("personal_photo >", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("personal_photo >=", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoLessThan(String value) {
            addCriterion("personal_photo <", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoLessThanOrEqualTo(String value) {
            addCriterion("personal_photo <=", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoLike(String value) {
            addCriterion("personal_photo like", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoNotLike(String value) {
            addCriterion("personal_photo not like", value, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoIn(List<String> values) {
            addCriterion("personal_photo in", values, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoNotIn(List<String> values) {
            addCriterion("personal_photo not in", values, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoBetween(String value1, String value2) {
            addCriterion("personal_photo between", value1, value2, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonalPhotoNotBetween(String value1, String value2) {
            addCriterion("personal_photo not between", value1, value2, "personalPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoIsNull() {
            addCriterion("passport_photo is null");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoIsNotNull() {
            addCriterion("passport_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoEqualTo(String value) {
            addCriterion("passport_photo =", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoNotEqualTo(String value) {
            addCriterion("passport_photo <>", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoGreaterThan(String value) {
            addCriterion("passport_photo >", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("passport_photo >=", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoLessThan(String value) {
            addCriterion("passport_photo <", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoLessThanOrEqualTo(String value) {
            addCriterion("passport_photo <=", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoLike(String value) {
            addCriterion("passport_photo like", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoNotLike(String value) {
            addCriterion("passport_photo not like", value, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoIn(List<String> values) {
            addCriterion("passport_photo in", values, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoNotIn(List<String> values) {
            addCriterion("passport_photo not in", values, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoBetween(String value1, String value2) {
            addCriterion("passport_photo between", value1, value2, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andPassportPhotoNotBetween(String value1, String value2) {
            addCriterion("passport_photo not between", value1, value2, "passportPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoIsNull() {
            addCriterion("foreign_id_photo is null");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoIsNotNull() {
            addCriterion("foreign_id_photo is not null");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoEqualTo(String value) {
            addCriterion("foreign_id_photo =", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoNotEqualTo(String value) {
            addCriterion("foreign_id_photo <>", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoGreaterThan(String value) {
            addCriterion("foreign_id_photo >", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_id_photo >=", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoLessThan(String value) {
            addCriterion("foreign_id_photo <", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoLessThanOrEqualTo(String value) {
            addCriterion("foreign_id_photo <=", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoLike(String value) {
            addCriterion("foreign_id_photo like", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoNotLike(String value) {
            addCriterion("foreign_id_photo not like", value, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoIn(List<String> values) {
            addCriterion("foreign_id_photo in", values, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoNotIn(List<String> values) {
            addCriterion("foreign_id_photo not in", values, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoBetween(String value1, String value2) {
            addCriterion("foreign_id_photo between", value1, value2, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andForeignIdPhotoNotBetween(String value1, String value2) {
            addCriterion("foreign_id_photo not between", value1, value2, "foreignIdPhoto");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdIsNull() {
            addCriterion("user_basic_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdIsNotNull() {
            addCriterion("user_basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdEqualTo(Integer value) {
            addCriterion("user_basic_id =", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdNotEqualTo(Integer value) {
            addCriterion("user_basic_id <>", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdGreaterThan(Integer value) {
            addCriterion("user_basic_id >", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_basic_id >=", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdLessThan(Integer value) {
            addCriterion("user_basic_id <", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_basic_id <=", value, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdIn(List<Integer> values) {
            addCriterion("user_basic_id in", values, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdNotIn(List<Integer> values) {
            addCriterion("user_basic_id not in", values, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdBetween(Integer value1, Integer value2) {
            addCriterion("user_basic_id between", value1, value2, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andUserBasicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_basic_id not between", value1, value2, "userBasicId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberIsNull() {
            addCriterion("service_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberIsNotNull() {
            addCriterion("service_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberEqualTo(String value) {
            addCriterion("service_phone_number =", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberNotEqualTo(String value) {
            addCriterion("service_phone_number <>", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberGreaterThan(String value) {
            addCriterion("service_phone_number >", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone_number >=", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberLessThan(String value) {
            addCriterion("service_phone_number <", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("service_phone_number <=", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberLike(String value) {
            addCriterion("service_phone_number like", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberNotLike(String value) {
            addCriterion("service_phone_number not like", value, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberIn(List<String> values) {
            addCriterion("service_phone_number in", values, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberNotIn(List<String> values) {
            addCriterion("service_phone_number not in", values, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberBetween(String value1, String value2) {
            addCriterion("service_phone_number between", value1, value2, "servicePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumberNotBetween(String value1, String value2) {
            addCriterion("service_phone_number not between", value1, value2, "servicePhoneNumber");
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