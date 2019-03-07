package cn.yzlsoft.mutualaidfunds.module.api.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
* @Date: 2019/03/07
* @Description: 
*/
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Increment1 {
    private Long incrementId;

    private Long incrementAssociation;

    private String incrementAssociationName;

    private Long incrementRepayment;

    private Long incrementFarmer;

    private String incrementFarmerName;

    private String incrementFarmerNamePinyin;

    private Date incrementRepaymentTime;

    private Long incrementSummary;

    private String incrementSummaryName;

    private BigDecimal incrementMoney;

    private Date incrementTime;

    private Long incrementVoucher;

    private Long incrementSubjectSelectTemplet;

    private String incrementSubjectSelectTempletName;

    private Boolean incrementDelete;

    private String incrementAddUser;

    private Date incrementAddTime;

    private String incrementModifyUser;

    private Date incrementModifyTime;

    private String incrementOwner;

    private Boolean incrementPreadd;
}