package com.neuedu.entity;

import java.io.Serializable;

public class MenuWithBLOBs extends Menu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.menu_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private byte[] menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.url
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private byte[] url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_menu
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.menu_name
     *
     * @return the value of t_menu.menu_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public byte[] getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.menu_name
     *
     * @param menuName the value for t_menu.menu_name
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setMenuName(byte[] menuName) {
        this.menuName = menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.url
     *
     * @return the value of t_menu.url
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public byte[] getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.url
     *
     * @param url the value for t_menu.url
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    public void setUrl(byte[] url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu
     *
     * @mbg.generated Tue Apr 21 09:05:41 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuName=").append(menuName);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}