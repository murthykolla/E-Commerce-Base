package com.ecommerce.login.util;

/**
 * Created by vanantharaman on 4/19/17.
 */
public class ErxConstants {

    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_TEST = "qa";
    public static final String SPRING_PROFILE_SB = "sb";
    public static final String SPRING_PROFILE_UAT = "uat";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    public static final String SPRING_PROFILE_SWAGGER = "swagger";

    //department_master constants
    //departmentId constants
    public static final String DM_CURRENT_TABLE_NAME = "DEPARTMENT_MASTER";
    public static final String DM_CURRENT_COLUMN_NAME = "DEPARTMENT_ID";

    //ProjectTransferFundDetail
    public static final String PTFD_CURRENT_TABLE_NAME = "PROJECT_TRANSFER_FUND_DETAILS";
    public static final String PTFD_CURRENT_COLUMN_NAME = "TRANSFER_FUND_ID";
    //ProjectReturnFundDetail
    public static final String PRFD_CURRENT_TABLE_NAME = "PROJECT_RETURN_FUND_DETAILS";
    public static final String PRFD_CURRENT_COLUMN_NAME = "RETURN_FUND_ID";
    //Project
    public static final String PRJ_CURRENT_TABLE_NAME = "PROJECT";
    public static final String PRJ_CURRENT_COLUMN_NAME = "PROJECT_ID";
    //FundDetail
    public static final String FD_CURRENT_TABLE_NAME = "FUND_DETAIL";
    public static final String FD_CURRENT_COLUMN_NAME = "FUND_ID";

    //project constants
    //projectId constants

    public static final String PROJECT_CURRENT_TABLE_NAME = "PRJOJECT";
    public static final String PROJECT_CURRENT_COLUMN_NAME = "PROJECT_ID";

    private ErxConstants() {
    }

}
