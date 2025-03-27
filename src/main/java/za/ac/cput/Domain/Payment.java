package za.ac.cput.Domain;

public class Payment {
    private String paymentId;
    private String amount;
    private String paymentStatus;
    private String userTenant;
    private String property;


    private Payment(Payment.Builder builder) {
        this.paymentId = builder.paymentId;
        this.amount = builder.amount;
        this.paymentStatus = builder.paymentStatus;
        this.userTenant = builder.userTenant;
        this.property = builder.property;


    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getUserTenant() {
        return userTenant;
    }

    public String getProperty() {
        return property;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount='" + amount + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", userTenant='" + userTenant + '\'' +
                ", property='" + property + '\'' +
                '}';




    }

    public static class Builder {
        private String paymentId;
        private String amount;
        private String paymentStatus;
        private String userTenant;
        private String property;
        private String leaseAgreement;



        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder setUserTenant(String userTenant) {
            this.userTenant = userTenant;
            return this;
        }

        public Builder setProperty(String property) {
            this.property = property;
            return this;
        }

        public Builder setLeaseAgreement(String leaseAgreement) {
            this.leaseAgreement = leaseAgreement;
            return this;
        }

        public Payment.Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.amount = payment.amount;
            this.paymentStatus = payment.paymentStatus;
            this.userTenant = payment.userTenant;
            this.property = payment.property;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }

    }


}