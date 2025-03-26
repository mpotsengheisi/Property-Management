package za.ac.cput.Domain;

public class LeaseAgreement {
    public String leaseAgreementId;
    public String startDate;
    public String endDate;
    public String rentAmount;
    public String depositAmount;
    public String tenant;
    public String property;
    public String payments;

    private LeaseAgreement(LeaseAgreement.Builder builder) {
        this.leaseAgreementId = builder.leaseAgreementId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.rentAmount = builder.rentAmount;
        this.depositAmount = builder.depositAmount;
        this.tenant = builder.tenant;
        this.property = builder.property;
        this.payments = builder.payments;



    }

    public String getId() {
        return leaseAgreementId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getRentAmount() {
        return rentAmount;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public String getTenant() {
        return tenant;
    }

    public String getProperty() {
        return property;
    }

    public String getPayments() {
        return payments;


    }

    @Override
    public String toString() {
        return "LeaseAgreement{" +
                "Id='" + leaseAgreementId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", rentAmount='" + rentAmount + '\'' +
                ", depositAmount='" + depositAmount + '\'' +
                ", tenant='" + tenant + '\'' +
                ", property='" + property + '\'' +
                ", payments='" + payments + '\'' +
                '}';
    }

    public static class Builder {
        public String leaseAgreementId;

        private String startDate;
        private String endDate;
        private String rentAmount;
        private String depositAmount;
        private String tenant;
        private String property;
        private String payments;



        public Builder setLeaseAgreementId(String leaseAgreementId) {
            this.leaseAgreementId = leaseAgreementId;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setRentAmount(String rentAmount) {
            this.rentAmount = rentAmount;
            return this;
        }

        public Builder setDepositAmount(String depositAmount) {
            this.depositAmount = depositAmount;
            return this;
        }

        public Builder setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setProperty(String property) {
            this.property = property;
            return this;
        }

        public Builder setPayments(String payments) {
            this.payments = payments;
            return this;
        }

        public LeaseAgreement.Builder copy(LeaseAgreement leaseAgreement) {
            this.leaseAgreementId = leaseAgreement.leaseAgreementId;
            this.startDate = leaseAgreement.startDate;
            this.endDate = leaseAgreement.endDate;
            this.rentAmount = leaseAgreement.rentAmount;
            this.depositAmount = leaseAgreement.depositAmount;
            this.tenant = leaseAgreement.tenant;
            this.property = leaseAgreement.property;
            this.payments = leaseAgreement.payments;
            return this;
        }
        public LeaseAgreement build() {
            return new LeaseAgreement(this);
        }

    }


}