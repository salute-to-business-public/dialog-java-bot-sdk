package im.dlg.botsdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class CustomerProfile {
    @SerializedName("email_omega")
    @Getter
    private String emailOmega;
    @Getter
    @SerializedName("email_sigma")
    private String emailSigma;
    @Getter
    @SerializedName("gender")
    private String gender;
    @Getter
    @SerializedName("emp_id")
    private Integer empId;
    @Getter
    @SerializedName("structure_name")
    private String structureName;
    @Getter
    @SerializedName("job_title")
    private String jobTitle;
    @Getter
    @SerializedName("department_name")
    private String departmentName;
    @Getter
    @SerializedName("department_root_name")
    private String departmentRootName;
    @Getter
    @SerializedName("department_id")
    private Integer departmentId;
    @Getter
    @SerializedName("photo_hide")
    private Boolean photoHide;
    @Getter
    @SerializedName("phone_internal")
    private String phoneInternal;
    @Getter
    @SerializedName("aux_phone")
    private String auxPhone;
    @Getter
    @SerializedName("rk_phone")
    private String rkPhone;
    @Getter
    @SerializedName("phone_external")
    private String phoneExternal;
    @Getter
    @SerializedName("phone_mobile")
    private String phoneMobile;
    @Getter
    @SerializedName("phone_mobile_hide")
    private Boolean phoneMobileHide;
    @Getter
    @SerializedName("birthday")
    private String birthday;
    @Getter
    @SerializedName("birthday_hide")
    private Boolean birthdayHide;
    @Getter
    @SerializedName("address")
    private String address;
    @Getter
    @SerializedName("chief")
    private String chief;
    @Getter
    @SerializedName("chief_link")
    private String chiefLink;
    @Getter
    @SerializedName("employee_number")
    private String employeeNumber;
    @Getter
    @SerializedName("emp_room")
    private String empRoom;
    @Getter
    @SerializedName("emp_street")
    private String empStreet;
    @Getter
    @SerializedName("emp_city")
    private String empCity;
    @Getter
    @SerializedName("emp_country")
    private String empCountry;
    @Getter
    @SerializedName("main_mail")
    private Integer mainMail;
    @Getter
    @SerializedName("is_sec")
    private Boolean isSec;
    @Getter
    @SerializedName("sec_name")
    private String secName;
    @Getter
    @SerializedName("sec_id")
    private Integer secId;
    @Getter
    @SerializedName("sec_link")
    private String secLink;
    @Getter
    @SerializedName("responsibility")
    private String responsibility;
    @Getter
    @SerializedName("vk")
    private String vk;
    @Getter
    @SerializedName("hide_vk")
    private Boolean hideVk;
    @Getter
    @SerializedName("timezone")
    private String timezone;
    @Getter
    @SerializedName("emp_family_name")
    private String empFamilyName;
    @Getter
    @SerializedName("emp_given_name")
    private String empGivenName;
    @Getter
    @SerializedName("emp_patronymic")
    private String empPatronymic;
}
