import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class DetailRecord {

    private String accountNumber;
    private String currentBalance;
    private String amountLastPayment;
    private String dateLastPayment;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String phone1;
    private String phone2;
    private String phone3;
    private String ssn;
    private String randomDigits;
    private String paymentDueDate; // format is MMDDYYYY
    private String creditLimit;
    private String minimumPaymentDue;
    private String delinquentArrearsAmount; // pastDueAmount
    private String numberCyclesDelinquent;
    private String cycleCode;
    private String daysDelinquent;
    private String dateOfBirth;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String dateLastReaged;
    private String openDate;
    private String previousReageDate;
    private String nextReageDate;
    private String lastContactDate;
    private String programStatus;
    private String siteKey;
    private String accountId;
    private String accountStatus;
    private String divisionId; // Biller Division ID for Payment Advantage
    private String allowPaymentAdvantagePaymentsFlag; // can be ignored for clients who only use VCA for payments
    private String accountDelinquencyStatusFlag; // can also be ignored
    private String paymentAdvantageAccountStatus; // can be ignored, but when used, A for Active, D for disabled
    private String accountLink; // used to link accounts together during login
    private String filler; // reserved for future use
    private String userDefined1;
    private String userDefined2;
    private String userDefined3;
    private String userDefined4;
    private String userDefined5;
    private String userDefined6;
    private String userDefined7;
    private String userDefined8;
    private String userDefined9;
    private String userDefined10;
    private String userDefined11;
    private String userDefined12;
    private String userDefined13;
    private String userDefined14;
    private String userDefined15;
    private String userDefined16;
    private String userDefined17;
    private String userDefined18;
    private String userDefined19;
    private String userDefined20;
    private String userDefined21;
    private String userDefined22;
    private String userDefined23;
    private String userDefined24;
    private String userDefined25;

    @Field(offset = 1, length = 30)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Field(offset = 31, length = 11)
    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Field(offset = 42, length = 11)
    public String getAmountLastPayment() {
        return amountLastPayment;
    }

    public void setAmountLastPayment(String amountLastPayment) {
        this.amountLastPayment = amountLastPayment;
    }

    @Field(offset = 53, length = 8)
    public String getDateLastPayment() {
        return dateLastPayment;
    }

    public void setDateLastPayment(String dateLastPayment) {
        this.dateLastPayment = dateLastPayment;
    }

    @Field(offset = 61, length = 26)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Field(offset = 87, length = 26)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Field(offset = 113, length = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Field(offset = 133, length = 2)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Field(offset = 135, length = 9)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Field(offset = 144, length = 16)
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Field(offset = 160, length = 16)
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Field(offset = 176, length = 16)
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @Field(offset = 192, length = 9)
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Field(offset = 201, length = 2)
    public String getRandomDigits() {
        return randomDigits;
    }

    public void setRandomDigits(String randomDigits) {
        this.randomDigits = randomDigits;
    }

    @Field(offset = 203, length = 8)
    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(String paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    @Field(offset = 211, length = 15)
    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Field(offset = 226, length = 11)
    public String getMinimumPaymentDue() {
        return minimumPaymentDue;
    }

    public void setMinimumPaymentDue(String minimumPaymentDue) {
        this.minimumPaymentDue = minimumPaymentDue;
    }

    @Field(offset = 237, length = 11)
    public String getDelinquentArrearsAmount() {
        return delinquentArrearsAmount;
    }

    public void setDelinquentArrearsAmount(String delinquentArrearsAmount) {
        this.delinquentArrearsAmount = delinquentArrearsAmount;
    }

    @Field(offset = 248, length = 3)
    public String getNumberCyclesDelinquent() {
        return numberCyclesDelinquent;
    }

    public void setNumberCyclesDelinquent(String numberCyclesDelinquent) {
        this.numberCyclesDelinquent = numberCyclesDelinquent;
    }

    @Field(offset = 251, length = 2)
    public String getCycleCode() {
        return cycleCode;
    }

    public void setCycleCode(String cycleCode) {
        this.cycleCode = cycleCode;
    }

    @Field(offset = 253, length = 3)
    public String getDaysDelinquent() {
        return daysDelinquent;
    }

    public void setDaysDelinquent(String daysDelinquent) {
        this.daysDelinquent = daysDelinquent;
    }

    @Field(offset = 256, length = 8)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Field(offset = 264, length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Field(offset = 289, length = 26)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Field(offset = 315, length = 60)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Field(offset = 375, length = 8)
    public String getDateLastReaged() {
        return dateLastReaged;
    }

    public void setDateLastReaged(String dateLastReaged) {
        this.dateLastReaged = dateLastReaged;
    }

    @Field(offset = 383, length = 8)
    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    @Field(offset = 391, length = 8)
    public String getPreviousReageDate() {
        return previousReageDate;
    }

    public void setPreviousReageDate(String previousReageDate) {
        this.previousReageDate = previousReageDate;
    }

    @Field(offset = 399, length = 8)
    public String getNextReageDate() {
        return nextReageDate;
    }

    public void setNextReageDate(String nextReageDate) {
        this.nextReageDate = nextReageDate;
    }

    @Field(offset = 407, length = 8)
    public String getLastContactDate() {
        return lastContactDate;
    }

    public void setLastContactDate(String lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    @Field(offset = 415, length = 10)
    public String getProgramStatus() {
        return programStatus;
    }

    public void setProgramStatus(String programStatus) {
        this.programStatus = programStatus;
    }

    @Field(offset = 425, length = 30)
    public String getSiteKey() {
        return siteKey;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Field(offset = 455, length = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Field(offset = 495, length = 3)
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Field(offset = 498, length = 6)
    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    @Field(offset = 504, length = 1)
    public String getAllowPaymentAdvantagePaymentsFlag() {
        return allowPaymentAdvantagePaymentsFlag;
    }

    public void setAllowPaymentAdvantagePaymentsFlag(String allowPaymentAdvantagePaymentsFlag) {
        this.allowPaymentAdvantagePaymentsFlag = allowPaymentAdvantagePaymentsFlag;
    }

    @Field(offset = 505, length = 1)
    public String getAccountDelinquencyStatusFlag() {
        return accountDelinquencyStatusFlag;
    }

    public void setAccountDelinquencyStatusFlag(String accountDelinquencyStatusFlag) {
        this.accountDelinquencyStatusFlag = accountDelinquencyStatusFlag;
    }

    @Field(offset = 506, length = 1)
    public String getPaymentAdvantageAccountStatus() {
        return paymentAdvantageAccountStatus;
    }

    public void setPaymentAdvantageAccountStatus(String paymentAdvantageAccountStatus) {
        this.paymentAdvantageAccountStatus = paymentAdvantageAccountStatus;
    }

    @Field(offset = 507, length = 30)
    public String getAccountLink() {
        return accountLink;
    }

    public void setAccountLink(String accountLink) {
        this.accountLink = accountLink;
    }

    @Field(offset = 537, length = 32)
    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    @Field(offset = 569, length = 25)
    public String getUserDefined1() {
        return userDefined1;
    }

    public void setUserDefined1(String userDefined1) {
        this.userDefined1 = userDefined1;
    }

    @Field(offset = 594, length = 25)
    public String getUserDefined2() {
        return userDefined2;
    }

    public void setUserDefined2(String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    @Field(offset = 619, length = 25)
    public String getUserDefined3() {
        return userDefined3;
    }

    public void setUserDefined3(String userDefined3) {
        this.userDefined3 = userDefined3;
    }

    @Field(offset = 644, length = 25)
    public String getUserDefined4() {
        return userDefined4;
    }

    public void setUserDefined4(String userDefined4) {
        this.userDefined4 = userDefined4;
    }

    @Field(offset = 669, length = 25)
    public String getUserDefined5() {
        return userDefined5;
    }

    public void setUserDefined5(String userDefined5) {
        this.userDefined5 = userDefined5;
    }

    @Field(offset = 694, length = 25)
    public String getUserDefined6() {
        return userDefined6;
    }

    public void setUserDefined6(String userDefined6) {
        this.userDefined6 = userDefined6;
    }

    @Field(offset = 719, length = 25)
    public String getUserDefined7() {
        return userDefined7;
    }

    public void setUserDefined7(String userDefined7) {
        this.userDefined7 = userDefined7;
    }

    @Field(offset = 744, length = 25)
    public String getUserDefined8() {
        return userDefined8;
    }

    public void setUserDefined8(String userDefined8) {
        this.userDefined8 = userDefined8;
    }

    @Field(offset = 769, length = 25)
    public String getUserDefined9() {
        return userDefined9;
    }

    public void setUserDefined9(String userDefined9) {
        this.userDefined9 = userDefined9;
    }

    @Field(offset = 794, length = 25)
    public String getUserDefined10() {
        return userDefined10;
    }

    public void setUserDefined10(String userDefined10) {
        this.userDefined10 = userDefined10;
    }

    @Field(offset = 819, length = 25)
    public String getUserDefined11() {
        return userDefined11;
    }

    public void setUserDefined11(String userDefined11) {
        this.userDefined11 = userDefined11;
    }

    @Field(offset = 844, length = 25)
    public String getUserDefined12() {
        return userDefined12;
    }

    public void setUserDefined12(String userDefined12) {
        this.userDefined12 = userDefined12;
    }

    @Field(offset = 869, length = 25)
    public String getUserDefined13() {
        return userDefined13;
    }

    public void setUserDefined13(String userDefined13) {
        this.userDefined13 = userDefined13;
    }

    @Field(offset = 894, length = 25)
    public String getUserDefined14() {
        return userDefined14;
    }

    public void setUserDefined14(String userDefined14) {
        this.userDefined14 = userDefined14;
    }

    @Field(offset = 919, length = 25)
    public String getUserDefined15() {
        return userDefined15;
    }

    public void setUserDefined15(String userDefined15) {
        this.userDefined15 = userDefined15;
    }

    @Field(offset = 944, length = 25)
    public String getUserDefined16() {
        return userDefined16;
    }

    public void setUserDefined16(String userDefined16) {
        this.userDefined16 = userDefined16;
    }

    @Field(offset = 969, length = 25)
    public String getUserDefined17() {
        return userDefined17;
    }

    public void setUserDefined17(String userDefined17) {
        this.userDefined17 = userDefined17;
    }

    @Field(offset = 994, length = 25)
    public String getUserDefined18() {
        return userDefined18;
    }

    public void setUserDefined18(String userDefined18) {
        this.userDefined18 = userDefined18;
    }

    @Field(offset = 1019, length = 25)
    public String getUserDefined19() {
        return userDefined19;
    }

    public void setUserDefined19(String userDefined19) {
        this.userDefined19 = userDefined19;
    }

    @Field(offset = 1044, length = 25)
    public String getUserDefined20() {
        return userDefined20;
    }

    public void setUserDefined20(String userDefined20) {
        this.userDefined20 = userDefined20;
    }

    @Field(offset = 1069, length = 25)
    public String getUserDefined21() {
        return userDefined21;
    }

    public void setUserDefined21(String userDefined21) {
        this.userDefined21 = userDefined21;
    }

    @Field(offset = 1094, length = 25)
    public String getUserDefined22() {
        return userDefined22;
    }

    public void setUserDefined22(String userDefined22) {
        this.userDefined22 = userDefined22;
    }

    @Field(offset = 1119, length = 25)
    public String getUserDefined23() {
        return userDefined23;
    }

    public void setUserDefined23(String userDefined23) {
        this.userDefined23 = userDefined23;
    }

    @Field(offset = 1144, length = 25)
    public String getUserDefined24() {
        return userDefined24;
    }

    public void setUserDefined24(String userDefined24) {
        this.userDefined24 = userDefined24;
    }

    @Field(offset = 1168, length = 25)
    public String getUserDefined25() {
        return userDefined25;
    }

    public void setUserDefined25(String userDefined25) {
        this.userDefined25 = userDefined25;
    }

    public DetailRecord(){
        accountNumber = "1234";
        currentBalance = "413300";
        amountLastPayment = "550";
        dateLastPayment = "20201201";
        address1 = "2006 Kimball St";
        address2 = "";
        city = "Philadelphia";
        state = "PA";
        zipCode = "19146";
        phone1 = "3025887312";
        phone2 = "";
        phone3 = "";
        emailAddress = "tom.donovan@aciworldwide.com";
    }

}
