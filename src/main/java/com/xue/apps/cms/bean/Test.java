package com.xue.apps.cms.bean;

public class Test {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.name
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.age
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.name
     *
     * @return the value of test.name
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.name
     *
     * @param name the value for test.name
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.age
     *
     * @return the value of test.age
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.age
     *
     * @param age the value for test.age
     *
     * @mbg.generated Mon Nov 11 16:31:33 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}