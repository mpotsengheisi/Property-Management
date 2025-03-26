package za.ac.cput.Domain;

public class Property {
    public String propertyId;
    public String address;
    public String rentalPrice;
    public String status;
    public String landlord;
    public String application;
    public String leaseAgreement;
    public String payments;
    public String maintenanceRequests;
    public String expenses;
    public String complaints;

    private Property(Property.Builder builder) {
        this.propertyId = builder.propertyId;
        this.address = builder.address;
        this.rentalPrice = builder.rentalPrice;
        this.status = builder.status;
        this.landlord = builder.landlord;
        this.application = builder.application;
        this.leaseAgreement = builder.leaseAgreement;
        this.payments = builder.payments;
        this.maintenanceRequests = builder.maintenanceRequests;
        this.expenses = builder.expenses;
        this.complaints = builder.complaints;


    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getAddress() {
        return address;
    }

    public String getRentalPrice() {
        return rentalPrice;
    }

    public String getStatus() {
        return status;
    }

    public String getLandlord() {
        return landlord;
    }

    public String getApplication() {
        return application;
    }

    public String getPayments() {
        return payments;
    }

    public String getLeaseAgreement() {
        return leaseAgreement;
    }

    public String getMaintenanceRequests() {
        return maintenanceRequests;
    }

    public String getExpenses() {
        return expenses;
    }

    public String getComplaints() {
        return complaints;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", address='" + address + '\'' +
                ", rentalPrice='" + rentalPrice + '\'' +
                ", status='" + status + '\'' +
                ", landlord='" + landlord + '\'' +
                ", application='" + application + '\'' +
                ", leaseAgreement='" + leaseAgreement + '\'' +
                ", payments='" + payments + '\'' +
                ", maintenanceRequests='" + maintenanceRequests + '\'' +
                ", expenses='" + expenses + '\'' +
                ", complaints='" + complaints + '\'' +
                '}';
    }

    public static class Builder{
        private String propertyId;
        private String address;
        private String rentalPrice;
        private String status;
        private String landlord;
        private String application;
        private String leaseAgreement;
        private String payments;
        private String maintenanceRequests;
        private String expenses;
        private String complaints;




        public Builder setPropertyId(String propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setRentalPrice(String rentalPrice) {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setLandlord(String landlord) {
            this.landlord = landlord;
            return this;
        }

        public Builder setApplication(String application) {
            this.application = application;
            return this;
        }

        public Builder setLeaseAgreement(String leaseAgreement) {
            this.leaseAgreement = leaseAgreement;
            return this;
        }

        public Builder setPayments(String payments) {
            this.payments = payments;
            return this;
        }

        public Builder setMaintenanceRequests(String maintenanceRequests) {
            this.maintenanceRequests = maintenanceRequests;
            return this;
        }

        public Builder setExpenses(String expenses) {
            this.expenses = expenses;
            return this;
        }

        public Builder setComplaints(String complaints) {
            this.complaints = complaints;
            return this;
        }

        public Property.Builder copy(Property property) {
            this.propertyId = property.propertyId;
            this.address = property.propertyId;
            this.rentalPrice= property.rentalPrice;
            this.status = property.status;
            this.landlord = property.landlord;
            this.application = property.application;
            this.leaseAgreement = property.leaseAgreement;
            this.payments = property.payments;
            this.maintenanceRequests = property.maintenanceRequests;
            this.expenses = property.expenses;
            this.complaints = property.complaints;
            return this;
        }
        public Property build() {
            return new Property(this);
        }
    }
}
